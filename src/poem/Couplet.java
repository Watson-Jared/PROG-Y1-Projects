/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poem;

/**
 *
 * @author lab_services_student
 */
public class Couplet extends Poem{
    
    private final int lines = 2;
    public Couplet(){
        
    }
   
    public Couplet(String n){
        super(n,2);
    }
    
    
    public void setLines(){
        super.setNumOfLines(lines);
    }
    
}
