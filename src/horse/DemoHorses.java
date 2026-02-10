/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package horse;

import java.util.Scanner;
public class DemoHorses {
    
    
    public static void main(String[] args) {
        
       Horse horse = new Horse();
       Scanner input = new Scanner(System.in);
       String userInput;
       
       
       System.out.println("Enter Horse Name");
       userInput = input.nextLine();
       horse.setName(userInput);
       
       System.out.println("Enter Horse Color");
       userInput = input.nextLine();
       horse.setColor(userInput);
       
       System.out.println("Enter Horse Birth Year");
       userInput = input.nextLine();
       horse.setBirthYear(userInput);
       
       System.out.println("Horse Name: "+ horse.getName()
               +"\nHorse Color: "+horse.getColor()
               +"\nHorse Birth Year: "+ horse.getBirthYear());
       
       RaceHorse raceHorse = new RaceHorse();
       int raceNum;
       
       System.out.println("\nEnter Race Horse Name");
       userInput = input.nextLine();
       raceHorse.setName(userInput);
       
       System.out.println("Enter Race Horse Color");
       userInput = input.nextLine();
       raceHorse.setColor(userInput);
       
       System.out.println("Enter Race Horse Birth Year");
       userInput = input.nextLine();
       raceHorse.setBirthYear(userInput);
       
       System.out.println("Enter Number of Races for Race Horse");
       raceNum = input.nextInt();
       raceHorse.setNumberOfRaces(raceNum);
       
       System.out.println("Race Horse Name: "+ raceHorse.getName()
               +"\nRace Horse Color: "+raceHorse.getColor()
               +"\nRace Horse Birth Year: "+ raceHorse.getBirthYear()
               +"\nNumber of Races: " +raceHorse.getNumberOfRaces());
       
       
       
       
       
      
      
    }
}
