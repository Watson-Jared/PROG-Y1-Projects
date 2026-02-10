/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package employee;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class Employee {
    
    String empName;
    int empNum;
    
   
    public void setEmpName(String empName){       
        
        //this means this class
        this.empName = empName;
    }
    
    public String getEmpName(){
        return empName;
    }
    
    public void setEmpNum(int empNum){
        this.empNum = empNum;        
    }
    
    public int getEmpNum(){
        return empNum;
    }

    
    public static void main(String[] args) {
        
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee(); 
        
        employee1.setEmpName("Juan");
        employee2.setEmpName("Jules");
        employee3.setEmpName("Frank");
        
        employee1.setEmpNum(765);
        employee2.setEmpNum(65);
        employee3.setEmpNum(98);
        
        System.out.println(employee1.empName + " " +employee1.empNum + "\n" + employee2.empName + " " +employee2.empNum
        + "\n" + employee3.empName + " " +employee3.empNum);
        
        
     
        
    }
    
    
    
}
