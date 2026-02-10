/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraysorting;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class ArraySorting {

  
    public static void main(String[] args){
        
        int[] numbers = {3,4,1,7,6,9};
        Scanner input = new Scanner(System.in);
        
        for(int x = 0; x < numbers.length; x++){
            System.out.println(numbers[x]);
        }
        //Search fo highest number
        int high = numbers[0];
        for(int x = 0; x < numbers.length; x++){
            if(numbers[x] > high){
                high = numbers[x];
            }
        }
        
        //Search for lowest number
        int low = numbers[0];
        for(int x = 0; x < numbers.length; x++){
            if(numbers[x] < low){
                low = numbers[x];
            }
        }
        //Display
        System.out.println("Highest Number is " + high + " " +"Lowest Number is "+ low);
        //Search for index of number given by user
        System.out.println("\nInput a number");
        int userNum = input.nextInt();
      
        int index = -1;
        for(int x = 0; x < numbers.length; x++){
            if(numbers[x] == userNum ){
                index = x;
            }
        }
       
        System.out.println("Index is " + index);
        
        int temp = 0;
        for(int x = 0; x < numbers.length; x++){
            
            for(int y = 0; y < numbers.length-1; y++){
                
                if(numbers[y] > numbers[y+1]){
                    temp = numbers[y];
                    numbers[y] = numbers[y+1];
                    numbers[y+1] = temp;
                }
                
            }
            
        }
        
        System.out.println("\nBubble Sort");
        for(int x = 0; x< numbers.length; x++){
            System.out.println(numbers[x]);
        }
        
        System.out.println("\nAdd 4 to multiples of 2");
        for(int x = 0; x<numbers.length;x++){
            if(numbers[x]%2 == 0){
                numbers[x] += 4;
            }
            System.out.println(numbers[x]);
        }   
        
        //Average of multiples of 3
        int sum = 0;
        int avrg = 0;
        for(int x = 0; x < numbers.length; x++){
            
            if(numbers[x]% 3 == 0){
                sum = sum +numbers[x];   
            }
            avrg = sum/3;
        }
        System.out.println("\nAverage of multiples of three is " + avrg);
        
        System.out.println("\nInsertion sort");
        int a = 1;
        temp=0;
        while(a<numbers.length){
            temp = numbers[a];
            int b = a -1;
            while(b>=0 && numbers[b] >temp){
              numbers[b+1] = numbers[b];
              --b;
            }
            numbers[b+1] = temp;
            ++a;
        }
        
        for(int x = 0; x< numbers.length; x++){
            System.out.println(numbers[x]);
        }
        
    }
    
}
