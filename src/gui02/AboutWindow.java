/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui02;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
public class AboutWindow extends JFrame implements ActionListener{
    
    private JLabel lblTitle, lblName, lblSTNum;
    private JButton btnBack;
    
    public AboutWindow(){
        super();
        setTitle("About Us");       
        setSize(300, 200);
        setLayout(new GridLayout(4,1));
        createControls();
        setVisible(true);
    }
    
    public void createControls(){
        lblTitle = new JLabel("About Us");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        
        lblName= new JLabel("Jared Watson");
        lblSTNum = new JLabel("St10451234");
        
        btnBack = new JButton("Back");
        btnBack.addActionListener(this);
        
        add(lblTitle);
        add(lblName);
        add(lblSTNum);
        add(btnBack);
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        
        if(source == btnBack){
            dispose();
        }
    }
    
}
