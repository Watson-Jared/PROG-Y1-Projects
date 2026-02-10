/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package file01;

import java.io.*;
public class File01 {

    
    public static void main(String[] args) {
      
        File file = new File("Products.txt");
        
        
        try{
         FileWriter fw = new FileWriter(file);
         BufferedWriter bw = new BufferedWriter(fw);
         
         bw.write("Milk 23 29.99");
         bw.newLine();
         bw.write("Salt 16 5.99");
         bw.newLine();
         bw.write("Bread 38 22.99");
         
         bw.close();
         fw.close();
         
         
         System.out.println("Written successfully to file");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        
        try{
            
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            
            String line = br.readLine();
            
            while(line != null){
                System.out.println(line);
                line = br.readLine();
            }
            
            br.close();
            fr.close();
                      
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        
       /* System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.lastModified());*/
       
       
    }
    
}
