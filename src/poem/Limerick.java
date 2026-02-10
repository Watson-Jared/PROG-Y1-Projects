/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poem;

/**
 *
 * @author lab_services_student
 */
public class Limerick extends Poem{
    public Limerick(){        
    }
    
    public Limerick(String n){
        super(n,5);
    }
    private final int lines = 5;
    public void setLines(){
        super.setNumOfLines(lines);
    }
}
