/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employeedataentry;

import java.util.Scanner;
public class EmployeeDataEntry {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        
       Scanner input = new Scanner(System.in);
        
       try {           
            System.out.print("Enter employee number (1000-9999): ");
            String empNumberStr = input.nextLine();
            int employeeNumber = validateEmployeeNumber(empNumberStr);
            
           
            System.out.print("Enter hourly pay rate (R9.00-R25.00): ");
            String payRateStr = input.nextLine();
            double payRate = validatePayRate(payRateStr);
            
            
            System.out.println(EmployeeMessages.messages[EmployeeMessages.VALID_DATA]);
            System.out.println("Employee Number: " + employeeNumber);
            System.out.println("Hourly Pay Rate: R" + String.format("%.2f", payRate));
            
        } catch (EmployeeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            input.close();
        }
    }
    
    
    public static int validateEmployeeNumber(String empNumberStr) throws EmployeeException {
        int employeeNumber;
        
        try {
            employeeNumber = Integer.parseInt(empNumberStr);
        } catch (NumberFormatException e) {
            throw new EmployeeException(EmployeeMessages.messages[EmployeeMessages.EMPLOYEE_NUMBER_NOT_NUMERIC]);
        }
        
        if (employeeNumber < 1000 || employeeNumber > 9999) {
            throw new EmployeeException(EmployeeMessages.messages[EmployeeMessages.EMPLOYEE_NUMBER_OUT_OF_RANGE]);
        }
        
        return employeeNumber;
    }
    
    
    public static double validatePayRate(String payRateStr) throws EmployeeException {
        double payRate;
        
        try {
            payRate = Double.parseDouble(payRateStr);
        } catch (NumberFormatException e) {
            throw new EmployeeException(EmployeeMessages.messages[EmployeeMessages.PAY_RATE_NOT_NUMERIC]);
        }
        
        if (payRate < 9.00) {
            throw new EmployeeException(EmployeeMessages.messages[EmployeeMessages.PAY_RATE_TOO_LOW]);
        }
        
        if (payRate > 25.00) {
            throw new EmployeeException(EmployeeMessages.messages[EmployeeMessages.PAY_RATE_TOO_HIGH]);
        }
        
        return payRate;
    }
}
    

