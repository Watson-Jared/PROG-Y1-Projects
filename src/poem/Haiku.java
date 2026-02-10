/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poem;

/**
 *
 * @author lab_services_student
 */
public class Haiku extends Poem{
    
    public Haiku(){
    }
    
    public Haiku(String n){
        super(n,3);
    }
    
    private final int lines = 3;
    public void setLines(){
        super.setNumOfLines(lines);
    }
    
}
