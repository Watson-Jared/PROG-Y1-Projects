/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

/**
 *
 * @author lab_services_student
 */
public class RunBook {
    public static void main(String[] args) {
        Book book = new Book("Harry Potter", 100);
        TextBook textBook = new TextBook("Mathematics",30,5);
        
        System.out.println(book.toString());
        System.out.println(textBook.toString());
    }
}
