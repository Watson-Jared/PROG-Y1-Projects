/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package loan;

/**
 *
 * @author lab_services_student
 */
public class PersonalLoan extends Loan {
    
    public PersonalLoan(int loanNumber, String customerLastName, 
                       double loanAmount, int term, double primeRate) {
        super(loanNumber, customerLastName, loanAmount, term);        
        setInterestRateValue(primeRate + 2.0);
    }
    
    @Override
    public void setInterestRate(double primeRate) {       
        setInterestRateValue(primeRate + 2.0);
    }
    
    @Override
    public String toString() {
        return "PERSONAL LOAN\n" +
               "Company: " + COMPANY_NAME + "\n" +
               super.toString() + 
               "----------------------------------------\n";
    }
}
