/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loan;

/**
 *
 * @author lab_services_student
 */
public class BusinessLoan extends Loan {
    
    public BusinessLoan(int loanNumber, String customerLastName, 
                       double loanAmount, int term, double primeRate) {
        super(loanNumber, customerLastName, loanAmount, term);       
        setInterestRateValue(primeRate + 1.0);
    }
    
    @Override
    public void setInterestRate(double primeRate) {        
        setInterestRateValue(primeRate + 1.0);
    }
    
    @Override
    public String toString() {
        return "BUSINESS LOAN\n" +
               "Company: " + COMPANY_NAME + "\n" +
               super.toString() + 
               "----------------------------------------\n";
    }
}
