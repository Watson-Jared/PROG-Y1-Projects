/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numbersdemo.java;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class NumbersDemoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number 1");
        num1 = input.nextInt();
        System.out.println("Enter number 2");
        num2 = input.nextInt();
        
        
        
        displayTwiceTheNumber(num1, num2);
         displayNumberPlusFive(num1, num2);
          displayNumberSquared(num1, num2);
    }  
   
    
    public static void displayTwiceTheNumber(int num1, int num2)
    {
     num1 = num1*2;
     num2 = num2 *2;
     
     System.out.println(num1 + " "+ num2);
    }
    
    public static void displayNumberPlusFive(int num1, int num2)
    {
     num1 = num1+5;
     num2 = num2+5;
     
     System.out.println(num1 + " "+ num2);
    }
    
    public static void displayNumberSquared(int num1, int num2)
    {
     num1 = num1*num1;
     num2 = num2 * num2;
     
     System.out.println(num1 + " "+ num2);
    }
    
    
    public static String myMethod(){
        
        return "Confirmed";
        
        
    }
    
    
    
    
}
