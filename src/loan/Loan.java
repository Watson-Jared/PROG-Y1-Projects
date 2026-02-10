/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package loan;

/**
 *
 * @author lab_services_student
 */
public abstract class Loan implements LoanConstants {
    private int loanNumber;
    private String customerLastName;
    private double loanAmount;
    private double interestRate;
    private int term;
    
    public Loan(int loanNumber, String customerLastName, double loanAmount, int term) {
        this.loanNumber = loanNumber;
        this.customerLastName = customerLastName;
        
        
        if (loanAmount > MAX_LOAN_AMOUNT) {
            this.loanAmount = MAX_LOAN_AMOUNT;
        } else {
            this.loanAmount = loanAmount;
        }
        
       
        if (term == SHORT_TERM || term == MEDIUM_TERM || term == LONG_TERM) {
            this.term = term;
        } else {
            this.term = SHORT_TERM;
        }
       
    }
    
   
    public abstract void setInterestRate(double primeRate);
    
    
    public double calculateTotalAmountOwed() {
        double loanFee = loanAmount * (interestRate / 100) * term;
        return loanAmount + loanFee;
    }
    
    
    protected void setInterestRateValue(double interestRate) {
        this.interestRate = interestRate;
    }
    
    
    public int getLoanNumber() {
        return loanNumber;
    }
    
    public String getCustomerLastName() {
        return customerLastName;
    }
    
    public double getLoanAmount() {
        return loanAmount;
    }
    
    public double getInterestRate() {
        return interestRate;
    }
    
    public int getTerm() {
        return term;
    }
    
    @Override
    public String toString() {
        return "Loan Number: " + loanNumber + "\n" +
               "Customer: " + customerLastName + "\n" +
               "Loan Amount: R" + loanAmount + "\n" +
               "Interest Rate: " + interestRate + "%\n" +
               "Term: " + term + " years\n" +
               "Total Amount Owed: R" + calculateTotalAmountOwed() + "\n";
    }
}