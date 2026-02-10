/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package horse;

/**
 *
 * @author lab_services_student
 */
public class RaceHorse extends Horse {
    private int numberOfRaces;
    
    public RaceHorse(){
        super();
        numberOfRaces = 0;
    }
    
    public void setNumberOfRaces(int n){
        numberOfRaces = n;
    }
    
    public int getNumberOfRaces(){
        return numberOfRaces;
    }
    
    
}
