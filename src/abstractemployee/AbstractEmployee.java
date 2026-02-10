/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractemployee;

/**
 *
 * @author lab_services_student
 */
public class AbstractEmployee {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Programmer prog = new Programmer("Sam","Johnson",20,150.0);
        
        System.out.println(prog.toString());
    }
    
}
