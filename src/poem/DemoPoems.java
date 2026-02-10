/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poem;

import java.util.Scanner;
public class DemoPoems {
    
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Poem poem = new Poem();
        Couplet couplet = new Couplet();
        Limerick limerick = new Limerick();
        Haiku haiku = new Haiku();
        int userNum=0;
        String userInput;
        
        
        while(true){
            System.out.println("Enter Number \n1:Poem\n2:Couplet\n3:Limerick\n4:Haiku");
            userNum = input.nextInt();
            input.nextLine();
            switch(userNum){
                case 1 -> {
                    System.out.println("Enter Name of Poem");
                    userInput = input.nextLine();
                    poem.setName(userInput);
                    System.out.println("\nEnter Number of Lines");
                    userNum = input.nextInt();
                    poem.setNumOfLines(userNum);
                    System.out.println("\nPoem Name: " + poem.getName()+"\nNumber of Lines: "+ poem.getNumOfLines());
                    break;
                }
                        
                case 2 -> {
                    System.out.println("\nEnter Name of Couplet");
                    userInput = input.nextLine();
                    couplet.setName(userInput);
                    couplet.setLines();
                    System.out.println("\nCouplet Name: " + couplet.getName()+"\nNumber of Lines: "+couplet.getNumOfLines());
                    break;
                }
                        
                case 3 -> {
                    System.out.println("\nEnter Name of Limerick");
                    userInput = input.nextLine();
                    limerick.setName(userInput);
                    limerick.setLines();
                    System.out.println("\nLimerick Name: " + limerick.getName()+"\nNumber of Lines: "+limerick.getNumOfLines());
                    break;
                }
                
                case 4 -> {
                    System.out.println("\nEnter Name of Haiku");
                    userInput = input.nextLine();
                    haiku.setName(userInput);
                    haiku.setLines();
                    System.out.println("\nHaiku Name: " + haiku.getName()+"\nNumber of Lines: "+haiku.getNumOfLines());
                    break;
                }
                default -> {
                    System.out.println("Enter number between 1-4");
                    continue;
                } 
            }
        break;
        }
        
        
    }
}
