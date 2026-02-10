/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book;

/**
 *
 * @author lab_services_student
 */
public class TextBook extends Book {    
    private int gradeLVL;    
    
    public TextBook(String t, int n,int lvl){
        super(t,n);
        gradeLVL = lvl;
    }
    
    @Override
    public String toString(){
        return super.toString()+ "\nGrade Level: "+ gradeLVL; 
    }
}
