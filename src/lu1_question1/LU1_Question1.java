/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lu1_question1;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class LU1_Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        
        for(int count = 0; count < array.length; count++){
            System.out.println("Input number " + (count+1));
            array[count] = input.nextInt();
        }
        int sum = 0;
        int avrg = 0;
        for(int count = 0; count < array.length; count++){
           sum += array[count];            
        }
        
        avrg = sum/array.length;
        
        System.out.println("Average is "+ avrg);
    }
    
}
