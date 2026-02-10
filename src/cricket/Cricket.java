/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cricket;

/**
 *
 * @author lab_services_student
 */
public abstract class Cricket implements ICricket{
    
    String name;
    int runs;
    String stadium;
   // Parameterised Constructor
   public Cricket(String n, int r, String s){
       name = n;
       runs = r;
       stadium = s;
   }
   
    @Override
    public String getBatsman(){
        return "Cricket Player: " + name;
    };
    
    @Override
    public String getStadium(){
        return "\nStadium: " + stadium;
    }
    
    @Override
    public String getRunsScored(){
        return "\nTotal Runs Scored: " + runs;
    }
  
    
}
