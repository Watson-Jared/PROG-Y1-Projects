/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cricket;

import java.util.Scanner;
public class RunApplication {
    //Main Method
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        int run;
        String stadium;
        //User Input
        System.out.println("Enter Name: ");
        name = input.nextLine();        
        System.out.println("Enter Stadium: ");
        stadium = input.nextLine();        
        System.out.println("Enter total runs: ");
        run = input.nextInt();
        
        
        CricketRunsScored runs = new CricketRunsScored(name, run, stadium);
        //Report
        System.out.println("Batsman runs Report:\n" + runs.getBatsman() + runs.getStadium() + runs.getRunsScored());
    }
}
