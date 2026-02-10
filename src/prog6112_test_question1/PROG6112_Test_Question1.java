/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog6112_test_question1;

import java.util.Scanner;
public class PROG6112_Test_Question1 {
    
  
    public static void main(String[] args){
        
       int[][] cricket = new int[3][3];
       Scanner input = new Scanner(System.in);
     
     

      System.out.println("SA Cricketer Apllication\n"+
              "---------------------------\n");
        //Populate Array
        for(int row = 0; row <cricket.length; row++){
            for(int col = 0; col < cricket.length; col++){
                System.out.print("Enter value["+row+"]["+col+"]: ");
                cricket[row][col] = input.nextInt();                
            }
            System.out.println();
        }
      
      for(int row = 0; row <cricket.length; row++){
            for(int col = 0; col < cricket.length; col++){
                System.out.print(cricket[row][col]+" ");
            }
            System.out.println();
        }       
        
        System.out.println("Total runs at stadiums");
         
        double[] batsman = new double[cricket.length];

        for (int batter = 0; batter < cricket.length; batter++) {
            double sum = 0;
            for (int stadium = 0; stadium < cricket[0].length; stadium++) {
                sum += cricket[batter][stadium];
            }
            batsman[batter] = sum;
        }

        for (int batter = 0; batter < batsman.length; batter++) {
            System.out.println("Stadium " + (batter + 1) + "  " + batsman[batter]);
        }
    
        
 
    }     
    
    
}
