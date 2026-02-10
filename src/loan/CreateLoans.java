/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loan;

import java.util.Scanner;
public class CreateLoans {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Loan[] loans = new Loan[5];
        
        System.out.println("=== " + LoanConstants.COMPANY_NAME + " ===");
        System.out.println("Loan Application System\n");
        
        System.out.print("Enter the current prime interest rate (%): ");
        double primeRate = input.nextDouble();
        
        for (int i = 0; i < loans.length; i++) {
            System.out.println("\n--- Loan " + (i + 1) + " ---");
            
            String loanType = "";
            while (!loanType.equals("B") && !loanType.equals("P")) {
                System.out.print("Enter loan type (B for Business, P for Personal): ");
                loanType = input.next().toUpperCase();
                if (!loanType.equals("B") && !loanType.equals("P")) {
                    System.out.println("Invalid input. Please enter 'B' for Business or 'P' for Personal.");
                }
            }
            
            int loanNumber = 0;
            while (loanNumber <= 0) {
                System.out.print("Enter loan number: ");
                loanNumber = input.nextInt();
                if (loanNumber <= 0) {
                    System.out.println("Loan number must be positive.");
                }
            }
            
            System.out.print("Enter customer last name: ");
            String lastName = input.next();
            
            double amount = 0;
            while (amount <= 0) {
                System.out.print("Enter loan amount (max R" + LoanConstants.MAX_LOAN_AMOUNT + "): R");
                amount = input.nextDouble();
                if (amount <= 0) {
                    System.out.println("Loan amount must be positive.");
                }
            }
            
            System.out.println("Available loan terms:");
            System.out.println("1 - Short term (1 year)");
            System.out.println("3 - Medium term (3 years)");
            System.out.println("5 - Long term (5 years)");
            System.out.print("Enter loan term (1, 3, or 5 years): ");
            int term = input.nextInt();
            if (term != 1 && term != 3 && term != 5) {
                System.out.println("Invalid term. Defaulting to short-term (1 year).");
                term = 1;
            }
            
            if (loanType.equals("B")) {
                loans[i] = new BusinessLoan(loanNumber, lastName, amount, term, primeRate);
            } else {
                loans[i] = new PersonalLoan(loanNumber, lastName, amount, term, primeRate);
            }
            
            System.out.println("Loan created successfully!");
        }
        
        System.out.println("\n" + "=".repeat(50));
        System.out.println("ALL LOANS SUMMARY");
        System.out.println("=".repeat(50));
        
        double totalLoansAmount = 0;
        double totalAmountOwed = 0;
        
        for (int i = 0; i < loans.length; i++) {
            System.out.println("LOAN " + (i + 1) + ":");
            System.out.println(loans[i].toString());
            
            totalLoansAmount += loans[i].getLoanAmount();
            totalAmountOwed += loans[i].calculateTotalAmountOwed();
        }
        
        System.out.println("TOTALS:");
        System.out.printf("Total Loan Amounts: R%.2f\n", totalLoansAmount);
        System.out.printf("Total Amount Owed (with interest): R%.2f\n", totalAmountOwed);        
        
    }
}