/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package converter;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class MyWindow extends JFrame implements ActionListener {
    
    private JLabel lblDegCel, lblDegF, lblTitle;
    private JTextField txtCel, txtFar;
    private JButton btnCon, btnCl;
    private JPanel p, p2;
    private Converter convertor;
    
    public MyWindow(){
        super();        
        setTitle("Temperature Converter");
        setSize(400,400);
        setLayout(new BorderLayout());
        convertor = new Converter(); 
        createControls();
        setVisible(true);
    }
    
    public void createControls(){
        p = new JPanel();
        p.setLayout(new BorderLayout());
        p.setSize(200,200);
        //add padding
        p.setBorder(BorderFactory.createEmptyBorder(20, 30, 0, 20));
        lblTitle = new JLabel("Converstion from Celsius to Farenheit");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 16));
        p.add(lblTitle, BorderLayout.CENTER);
        
        add(p, BorderLayout.NORTH);
        
        p2 = new JPanel();
        p2.setLayout(new GridLayout(2,3));
        p2.setSize(200,200);
        p2.setBorder(BorderFactory.createEmptyBorder(20, 0, 0, 20));
        
        lblDegCel = new JLabel("Please enter degrees celsuis");
        lblDegF = new JLabel("Equivilent Degree Farenheit");
        
        txtCel = new JTextField();
        txtFar = new JTextField();
        
        btnCon = new JButton("Convert"); 
        btnCon.setMnemonic('C');
        btnCon.addActionListener(this);
        
        btnCl = new JButton("Clear");
        btnCl.setMnemonic('l');
        btnCl.addActionListener(this);
        
        p2.add(lblDegCel);
        p2.add(txtCel);  
        p2.add(btnCon);
        p2.add(lblDegF);
        p2.add(txtFar);
        p2.add(btnCl);     
        
        add(p2, BorderLayout.CENTER);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        Object source = e.getSource();
        if(source == btnCon){
            try {
                double degCel = Double.parseDouble(txtCel.getText());
                double fahrenheit = convertor.convertToFahrenheit(degCel); 
                txtFar.setText("" + fahrenheit);
            } catch (NumberFormatException err) {
                System.out.println(err.getMessage());
            }
        } else if(source == btnCl){
            txtCel.setText("");
            txtFar.setText("");
        }
        
    }
    
    public static void main(String[] args) {
        new MyWindow();
    }
    
}
