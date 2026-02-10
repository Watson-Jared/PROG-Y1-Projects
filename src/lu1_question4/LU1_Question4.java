/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lu1_question4;

/**
 *
 * @author lab_services_student
 */
import java.util.Random;
import java.util.Scanner;
public class LU1_Question4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Random number = new Random();
       Scanner input = new Scanner(System.in);
       
       String[] stName= new String[3];
       int[] stMarks = new int[3];
       
        for(int count = 0; count< stMarks.length; count++){
            System.out.println("Enter name of Student " + (count+1) + ":");
            stName[count]= input.nextLine();
        }
       
       for(int count = 0; count< stMarks.length; count++){
            int randomNum = number.nextInt(0, 101);
            stMarks[count]= randomNum;
        }
       System.out.println("Students who passed");
       for(int count = 0; count< stMarks.length; count++){
            if(stMarks[count] >= 50){
                System.out.println(stName[count] + " - Mark:" + stMarks[count]);
            }
        }
    }
    
}
