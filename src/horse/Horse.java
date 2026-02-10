/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package horse;

/**
 *
 * @author lab_services_student
 */
public class Horse {
    
    private String name;
    private String color;
    private String birthYear;
    
    public Horse(){
        name= null;
        color = null;
        birthYear = null;
    }
    
    public void setName(String n){
        name = n;
    }
    
    public void setColor(String c){
        color = c;
    }
    
    public void setBirthYear(String b){
        birthYear = b;
    }
    
    public String getName(){
        return name;
    }
    
    public String getColor(){
        return color;
    }
    
    public String getBirthYear(){
        return birthYear;
    }
    
    
    
}
