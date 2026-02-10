/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractemployee;

/**
 *
 * @author lab_services_student
 */
public abstract class Employee {
    private String name;
    private String surname;
    
    public Employee(String n, String s){
        name = n;
        surname = s;
    }
    
    @Override
    public String toString(){
        return name +"\t" + surname;
    }
    
    public abstract double calcPay();
}
