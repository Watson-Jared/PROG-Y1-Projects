/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lu1_question2;

/**
 *
 * @author lab_services_student
 */
import java.util.Random;
public class LU1_Question2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random number = new Random();
       
        int[] array = new int[10];
        
        System.out.println("Random Numbers\n");
        for(int count = 0; count< array.length; count++){
            int randomNum = number.nextInt(100);
            array[count]= randomNum ;
        }
        
         for(int count = 0; count< array.length; count++){
           System.out.println(array[count]);
        }
         
        System.out.println("\nSorted Numbers\n");
        int temp = 0;
        for(int x = 0; x < array.length; x++){
            for(int y = 0; y < array.length-1; y++){
                
                if(array[y] > array[y+1]){
                    temp = array[y];
                    array[y] = array[y+1];
                    array[y+1] = temp;
                } 
            }
        }
        
        for(int count = 0; count< array.length; count++){
           System.out.println(array[count]);
        }
       
    }
    
}
