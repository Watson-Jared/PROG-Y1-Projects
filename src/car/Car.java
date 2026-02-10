/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package car;

/**
 *
 * @author lab_services_student
 */
import java.util.Scanner;
public class Car {
    
     String brand;
        int speed;
        int baseRent;
        int acceleratedSpeed;
        int brakeSpeed;
        
        Scanner input = new Scanner(System.in);
    
    public Car(){ 
        brand = "Unknown";
        speed = 0;   
        baseRent = 0;
        acceleratedSpeed = 0;
        brakeSpeed = 0;
        
    }
    
    public void getData(int number){
        
        System.out.println("Enter car " + number+ " brand");
        brand = input.nextLine();
        System.out.println("Enter car " + number+ "  speed");
        speed = input.nextInt();
        System.out.println("Enter car " + number+ " accelerartion speed");
        acceleratedSpeed = input.nextInt();
        System.out.println("Enter car " + number+ " brake speed");
        brakeSpeed= input.nextInt(); 
        System.out.println("Enter car " + number+ " base rent increase");
        baseRent = input.nextInt();
        
       
        
        
        
        
        
    }
    
   /* public void setCarBrand(String brand){
        this.brand = brand;
                
    }
     public void setCarSpeed(int speed){
        this.speed = speed;       
    }
     
     public String getCarBrand(){
         return brand;
     }
      public int getCarSpeed(){
         return speed;
     }*/
    
    public void displayInfo(){ 
        System.out.println("Car Brand: " + brand +" Speed: " + speed +"km/h" + "\n" +
                brand + " Acceleration Speed: " + acceleratedSpeed + "km/h \n" + 
                brand + " Brake Speed: " + brakeSpeed + "km/h \n" +
                brand + " Base Rent Increase Amount: R" + baseRent + "\n"
                );
    }
    
    /*public void accelerate(){
       
        
       acceleratedSpeed = speed + plusSpeed;
     System.out.println( );
       
      
    }
    
    public void brake(){
        
       
        
        speedAfterBrake = speed - minusSpeed;
       System.out.println( );
        
    }
    
    public void isMoving(){       
        
        boolean moving;
        
        if(speed > 0){
        moving = true;}
        else{moving = false;}
        System.out.println("Is " + brand +" moving " + moving);
        
        
        
    }
    
    public  void increaseBaseRent(){
        
        baseRent += 100;
        
        System.out.println("Base rent increased by 100. New Rent " + baseRent);
  
    }
    
    public static void explainRentalPolicy(){
        
        System.out.println("Rental Policy: Base rent increases by R100 each time car is rented.");
        
    }*/
    
    

   
    public static void main(String[] args) {
        
        Car defaultCar = new Car();
        Car car1 = new Car();
        Car car2 = new Car();
        Car car3 = new Car();
       
         
        car1.getData(1);
        car2.getData(2);
        car3.getData(3);

       
        car1.displayInfo();
        car2.displayInfo();
        car3.displayInfo();
        defaultCar.displayInfo();
         
        /*car1.accelerate();
        car2.brake();
        car3.accelerate();
        
        defaultCar.isMoving();
        car1.isMoving();
        car2.isMoving();
        car3.isMoving();
       
        
        
       
        explainRentalPolicy();
        car1.increaseBaseRent();
        car1.increaseBaseRent(); 
        car1.increaseBaseRent(); */
        
        
     
      
        
        
        
        
   
        
        
       
        
        
        
       
    }
    
}
