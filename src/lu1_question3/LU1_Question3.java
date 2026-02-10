/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lu1_question3;

/**
 *
 * @author lab_services_student
 */
import java.util.Random;
public class LU1_Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random number = new Random();
        int[] array = new int[35];
        
        
        for(int count = 0; count< array.length; count++){
            int randomNum = number.nextInt(3,40);
            array[count]= randomNum;
            System.out.println(array[count]);
        }
        
        int sum = 0;
        int avrg = 0;
        for(int count = 0; count < array.length; count++){
           sum += array[count];            
        }
        
        avrg = sum/array.length;
        
        int numOfHigherThanAvrg = 0;
        for(int count = 0; count< array.length; count++){
            if(array[count] > avrg){
              numOfHigherThanAvrg++;  
            }
        }
        
        System.out.println("Amount a numbers higher than average:" + avrg+ " is " + numOfHigherThanAvrg);
    }
    
}
