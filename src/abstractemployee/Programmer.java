/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractemployee;

/**
 *
 * @author lab_services_student
 */
public class Programmer extends Employee implements setters{
    
    private int hours;
    private double rate;
    
    public Programmer(String n, String s, int hrs, double r){
        super(n,s);
        hours = hrs;
        rate = r;        
    }
    
    @Override
    public void setHours(int hrs){
        hours = hrs;
    }
    
    @Override
    public void setRate(double r)    {
        rate =r;
    }
    
    @Override
    public double calcPay(){
        return hours*rate;
    }
    
    @Override
    public String toString(){
        return super.toString() + "\t" + hours + "\t" + rate + "\t" + calcPay();
    }
}
