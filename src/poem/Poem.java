/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poem;

/**
 *
 * @author lab_services_student
 */
public class Poem {
    
    private String name;
    private int numOfLines;
    
    public Poem(){
        name = null;
        
    }
    
    public Poem(String n, int num){
        name = n;
        numOfLines = num;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setNumOfLines(int n){
        numOfLines = n;
    }
    
    public String getName(){
        return name;
    }
    
    public int getNumOfLines(){
        return numOfLines;
    }

   
    
    
}
