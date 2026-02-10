/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package integerdemo;

/**
 *
 * @author lab_services_student
 * 
 */
import javax.swing.JOptionPane;
public class IntegerDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int anInt = 12;
        byte aByte =12;
        short aShort = 12;
        long aLong = 12;
        
        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);
        
        int num1 = 3;
        int num2 = 6;
        // True or False
        boolean areSame = (num1 == num2);
        
        boolean isBigger = (num1 > num2);
        
        boolean isSmaller = (num1 < num2);
        
        double decimal = 30.88;
        
        //One Character 
        char Pass = 'P';
        
        
        System.out.println(areSame);
        System.out.println(isBigger);
        System.out.println(isSmaller);
        System.out.println("Your grade is " + Pass);
        JOptionPane.showMessageDialog(null, "This is the decimal " + decimal);
        
        
        
        
        
        
    }
    
}
