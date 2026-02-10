/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movietickets;

/**
 *
 * @author lab_services_student
 */
public class RunApplication {
    public static void main(String[] args) {
        MovieTickets movieTickets = new MovieTickets();
        
        movieTickets.populateArray();
        movieTickets.printReport();
        
    }
    
}
