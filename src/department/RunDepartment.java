/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package department;


import java.util.Scanner;
public class RunDepartment {
    
    public static void main(String[] args) {
       Department department = new Department();
       Scanner input = new Scanner(System.in);
       int userNum = 0;
       
        
      department.populateArray();
      department.calculateAvgSalesPerMonth(department.getSales());
      department.calculateAvgSalesPerDepart(department.getSales());
      
      System.out.print("Enter month number (1-3): ");
      userNum = input.nextInt();
      department.determineHighestMonthlySale(userNum);      
      
      System.out.print("Enter department number (1-4): ");
      userNum = input.nextInt();
      department.determineHighestDepartSale(userNum);
      
    }
}
