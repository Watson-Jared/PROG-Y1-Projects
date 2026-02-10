/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeedataentry;

/**
 *
 * @author lab_services_student
 */
public class EmployeeException extends Exception {
    private String message;
    
    
    public EmployeeException(String message) {
        super(message);
        this.message = message;
    }
    
    
    @Override
    public String getMessage() {
        return message;
    }
}
