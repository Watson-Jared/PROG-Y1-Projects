/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package movietickets;

import java.util.Scanner;

/**
 *
 * @author lab_services_student
 */
public class MovieTickets implements IMovieTickets {

    int sales[][] = new int[2][3];
    String[] movieNames = {"Napolean", "Oppenhimer"};
    String[] monthNames = {"January", "February", "March"};
    
    public void populateArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Movie Ticket Sales");
        for(int row = 0; row < sales.length; row++){
            for(int col = 0; col < sales[row].length; col++){
                System.out.print("Enter sales for " + movieNames[row] + " for " + monthNames[col] + " ");
                sales[row][col] = input.nextInt();
            }
        }
    }
    
     public void printReport() {
         
        System.out.println("Movie Sales Ticket Report-2024\n");
        // Print column headers
        System.out.print("\t\t\t");
        for(int col = 0; col < monthNames.length; col++){
            System.out.print(monthNames[col] + "\t");
        }
        System.out.println();
        
        // Print separator
        System.out.print("\t\t\t");
        for(int col = 0; col < monthNames.length; col++){
            System.out.print("----------\t");
        }
        System.out.println();
        
        // Print rows with custom labels
        for(int row = 0; row < sales.length; row++){
            System.out.print(movieNames[row] + "\t|\t");
            for(int col = 0; col < sales[row].length; col++){
                System.out.print(sales[row][col] + "\t\t");
            }
            System.out.println();
        }
        System.out.println("");
        totalTicketsPerMovie();
        findHighestPerformingMovie();
    }
     
    public void totalTicketsPerMovie() {       
        
        // Create single array to store totals
        int[] movieTotals = new int[sales.length];
        
        // Calculate total for each movie
        for(int movie = 0; movie < sales.length; movie++){
            int sum = 0;
            for(int month = 0; month < sales[movie].length; month++){
                sum += sales[movie][month];
            }
            movieTotals[movie] = sum;
        }
        
        // Print totals
        for(int movie = 0; movie < movieTotals.length; movie++){
            System.out.println("\nTotal movie tickets for "+movieNames[movie] + " " + movieTotals[movie] );
        }
    }
    
    public void findHighestPerformingMovie() {
        int maxTickets = 0;
        int highestMovie = 0;
        
        for(int row = 0; row < sales.length; row++){
            int total = 0;
            for(int col = 0; col < sales[row].length; col++){
                total += sales[row][col];
            }
            if(total > maxTickets){
                maxTickets = total;
                highestMovie = row;
            }
        }        
        System.out.println("Top performing movie "+movieNames[highestMovie] + " with " + maxTickets + " tickets");
    }
    
    @Override
    public int totalMovieSales(int[] movieTicketSales){
        return 9;
    } 
    
    public String topMovie(String[] movies, int[] totalSaless){
        
        return null;
        
    }
    
}
