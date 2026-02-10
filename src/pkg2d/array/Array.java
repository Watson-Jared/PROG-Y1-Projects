/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2d.array;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class Array {


    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int numbers[][] = new int [3][3];
        
        //Populate 2D Array
        for(int row = 0; row <numbers.length; row++){
            for(int col = 0; col < numbers.length; col++){
                System.out.print("Enter value["+row+"]["+col+"]: ");
                numbers[row][col] = input.nextInt();
            }
            System.out.println();
        }
        
        //Print 2D Array
        for(int row = 0; row <numbers.length; row++){
            for(int col = 0; col < numbers.length; col++){
                System.out.print(numbers[row][col]+" ");
            }
            System.out.println();
        }
        
        //Average
        int avrg = 0;
        int sum = 0;
        for(int row = 0; row <numbers.length; row++){
            for(int col = 0; col < numbers.length; col++){
                
                sum = numbers[row][col] + sum;
                avrg =sum/(numbers[row].length*numbers[col].length);
            }
        }
        System.out.println("\nAverage of array: "+avrg);
        
        //Lowest number
        int low = numbers[0][0];
        for(int row = 0; row <numbers.length; row++){
            
            for(int col = 0; col < numbers.length; col++){
                
                if(numbers[row][col] < low){
                low = numbers[row][col];
                }
            }
        }
        System.out.println("\nLowest number: " +low);
        
        //highest number
        int high =0;
        for(int row = 0; row <numbers.length; row++){
            
            for(int col = 0; col < numbers.length; col++){
                
                if(numbers[row][col] > high){
                high = numbers[row][col];
                }
            }
        }
        System.out.println("\nHighest number: "+high);
        
        //Search for index of user number
        int userNum = 0;
        int index1 =0;
        int index2 = 0;
        
        System.out.println("\nEnter number");
        userNum = input.nextInt();
        for(int row = 0; row <numbers.length; row++){
            
            for(int col = 0; col < numbers.length; col++){
                
                if(numbers[row][col] == userNum){
                  index1 = row;
                  index2 = col;
                }
            }
        }
        System.out.println("Row index of number: "+index1+ "\nColumn index of number: " + index2);
        
        
        
    }
    
}
