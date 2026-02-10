/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package movietickets;

/**
 *
 * @author lab_services_student
 */
public interface IMovieTickets {
    int totalMovieSales(int[] movieTicketSales);
    String topMovie(String[] movies, int[] totalSaless);
}
