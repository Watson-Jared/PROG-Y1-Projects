/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeedataentry;

/**
 *
 * @author lab_services_student
 */
public class EmployeeMessages {
    
  public static final String[] messages = {
        "Employee number must be numeric",
        "Employee number must be between 1000 and 9999",
        "Hourly pay rate must be numeric", 
        "Hourly pay rate must be at least R9.00",
        "Hourly pay rate must not exceed R25.00",
        "Valid Employee data"
    };
  
    public static final int EMPLOYEE_NUMBER_NOT_NUMERIC = 0;
    public static final int EMPLOYEE_NUMBER_OUT_OF_RANGE = 1;
    public static final int PAY_RATE_NOT_NUMERIC = 2;
    public static final int PAY_RATE_TOO_LOW = 3;
    public static final int PAY_RATE_TOO_HIGH = 4;
    public static final int VALID_DATA = 5;
  
}
