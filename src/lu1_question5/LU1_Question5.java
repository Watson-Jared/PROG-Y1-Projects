/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lu1_question5;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class LU1_Question5 {

    
    
    
    public static void main(String[] args) {
        double[][] revenue = new double[4][7];
        
        populateRevenue(revenue);
        CalculateDailyRevenueTotal(revenue);
        CalculateFloorAverages(revenue);
        FindBestDayForFloor(revenue);
        FindFloorWithHighstRevenueOnDay(revenue);
       
    }
    
    public static void populateRevenue(double[][] array){
        Scanner input = new Scanner(System.in);
        for(int floor = 0; floor <array.length; floor++){
            for(int day = 0; day < 7; day++){
                System.out.print("Enter value for Floor["+(floor+1)+"] Day["+(day+1)+"]: ");
                array[floor][day] = input.nextDouble();
            }
        }
    }
    
    public static void CalculateDailyRevenueTotal(double[][] array){
        double[] dailyTotal= new double[7];
        
        for(int row = 0; row < 4; row++){
            double sum = 0;
            for(int col = 0; col < 7; col++){
                sum = array[row][col] + sum;
            }
            dailyTotal[row] += sum;
        }
        
        for(int count = 0; count < dailyTotal.length; count++){
            System.out.println("Daily total for day " + (count+1)+" is " + dailyTotal[count] );
        }
    }
    
    public static void CalculateFloorAverages(double[][] array){
        double[] floorAvrg= new double[4];
        
        for(int row = 0; row < 4; row++){
            double sum = 0;
            for(int col = 0; col < 7; col++){
                sum = array[row][col] + sum;
            }
            floorAvrg[row] =sum/floorAvrg.length;
        }
        
        for(int count = 0; count < floorAvrg.length; count++){
            System.out.println("Average of floor " + (count+1)+" is " + floorAvrg[count] );
        }
       
    }
    
    public static void FindBestDayForFloor(double[][] array){
        int userNum = 0;
        int day =0;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nEnter floor number");
        userNum = input.nextInt();
        int index= userNum-1;
        double high =0;
        for(int row = 0; row <index; row++){
            for(int col = 0; col < 7; col++){
                if(array[index][col] > high){
                high = array[index][col];
                day = col;
                }
            }
        }
        System.out.println("Highest Revenue day " +(day+1));
    }
    
    public static void FindFloorWithHighstRevenueOnDay(double[][] array){
        int userNum = 0;
        int floor =0;
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("\nEnter day number");
        userNum = input.nextInt();
        int index= userNum-1;
        double high =0;
        for(int row = 0; row < array.length; row++){
            for(int col = 0; col < index; col++){
                
                if(array[index][col] > high){
                high = array[index][col];
                floor = row;
                }
            }
        }
        System.out.println("Floor with highest revenue by day is floor " +(floor+1));
    } 
}
