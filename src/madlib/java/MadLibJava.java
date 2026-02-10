/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package madlib.java;

/**
 *
 * @author lab_services_student
 */
import javax.swing.JOptionPane;
public class MadLibJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String noun1;
        String noun2;
        String noun3;
        String adjective;
        String pastverb;
        
        noun1 = JOptionPane.showInputDialog(null, "Enter a noun");
        noun2 = JOptionPane.showInputDialog(null, "Enter another noun");       
        adjective = JOptionPane.showInputDialog(null, "Enter an adjective");
        pastverb = JOptionPane.showInputDialog(null, "Enter a past tense verb");
        noun3 = JOptionPane.showInputDialog(null, "Enter another noun");
        
         JOptionPane.showMessageDialog(null, "Mary had a little " + noun1 + "\n" + 
                "Its " + noun2 + " was " + adjective + " as snow\n" + 
                "And everywhere that Mary " + pastverb+ "\n" + 
                "The " + noun3 + " was sure to go");
    }
    
}
