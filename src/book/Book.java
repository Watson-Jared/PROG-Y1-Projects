/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package book;

/**
 *
 * @author lab_services_student
 */
public class Book {

    private String title;
    private int numOfPages;
    
    public Book(String t, int n){
        title = t;
        numOfPages = n;        
    }
    
    public String toString(){
       return "\nTitle: " + title+"\nNumber of Pages: "+numOfPages;        
    }
    
}
