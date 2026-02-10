/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package electionstatistics.java;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class ElectionStatisticsJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        String party1;
        String party2;
        String party3;
        
        double votes1;
        double votes2;
        double votes3;
        
        double vote1decimal;
        double vote2decimal;
        double vote3decimal;
        
        double vote1percent;
        double vote2percent;
        double vote3percent;
        
        
        double total;
        
        
        System.out.println("Please enter first party name");
        party1 = input.next();
        System.out.println("Please enter votes for first party");
        votes1 = input.nextDouble();
        
        System.out.println("Please enter second party name ");
        party2 = input.next();
        System.out.println("Please enter votes for second party");
        votes2 = input.nextDouble();
        
        System.out.println("Please enter third party name ");
        party3 = input.next();        
        System.out.println("Please enter votes for third party");
        votes3 = input.nextDouble();
        
        
        
        total = (votes1 + votes2 + votes3);
        
       vote1decimal = (votes1/total) ;
        vote2decimal = (votes2/total) ;
        vote3decimal = (votes3/total) ;
        
        vote1percent = (vote1decimal *100);
        vote2percent = (vote2decimal *100);
        vote3percent = (vote3decimal *100);
         
       
        
        
        
        
        System.out.println(party1 + " has " + vote1percent + " of the votes");
        System.out.println(party2 + " has " + vote2percent + " of the votes");
        System.out.println(party3 + " has " + vote3percent + " of the votes");
        System.out.println("Total votes for all the partys is " + total);
        
        
        
        
        
        
    }
    
}
