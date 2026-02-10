/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package paradise.info;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class ParadiseInfo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double price;
        double discount;
        double savings;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter cutoff price for discount >>");
        price = input.nextDouble();
        System.out.println("Enter discount rate as a whole number >>");
        discount = input.nextDouble();
        
        
        displayInfo();
        
        savings = computeDiscountInfo(price, discount);
        
        
        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent.");
        System.out.println("Thats a saving of at least $" + savings);
        
    }
    
    public static void displayInfo()
    {
        System.out.println("Paradise Day Spa wants to pamper you.");
        System.out.println("We will make you look good.");
    }
    
    public static double computeDiscountInfo(double price, double discountRate){
        double savings;   
        savings = price * discountRate / 100;
        return savings;
    }
    
}
