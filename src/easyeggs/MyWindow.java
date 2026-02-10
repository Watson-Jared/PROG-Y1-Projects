/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package easyeggs;

import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;

public class MyWindow extends JFrame implements ActionListener {
    private JLabel lblTitle, lblNumEggBought, lblNumEggBroke, lblCostEgg, lblNumPacSold, lblProfit, lblPerEggBroke, lblNumEggTake;
    private JTextField txtNumEggBought, txtNumEggBroke, txtCostEgg, txtNumPacSold, txtProfit, txtPerEggBroke, txtNumEggTake;
    private JButton btnCal, btnCl, btnExt;
    
    private JPanel titlePanel = new JPanel();    
    private JPanel inputPanel = new JPanel();
    private JPanel outputPanel = new JPanel();
    private JPanel buttonPanel = new JPanel();
    
    
    
    public MyWindow(){
        super();
        setTitle("Easy Eggs");       
        setSize(700, 400);
        setLayout(new BorderLayout());      
        createControls();
        setVisible(true);
    }
    
    
    public void createControls(){
        
        lblTitle = new JLabel("Enok, the Egg Entrepreneur");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));        
        titlePanel.add(lblTitle);
        titlePanel.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        add(titlePanel, BorderLayout.NORTH);
        
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new GridLayout(2, 1));
        centerPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        
        lblNumEggBought = new JLabel("Number of Eggs Bought:");
        lblNumEggBroke = new JLabel("Number of Eggs Broken:");
        lblCostEgg = new JLabel("Cost Price Per Egg:");
        lblNumPacSold = new JLabel("Number of Packets Sold:");
        
        txtNumEggBought = new JTextField();        
        txtNumEggBroke = new JTextField();
        txtCostEgg = new JTextField();
        txtNumPacSold = new JTextField();
        
        inputPanel.setLayout(new GridLayout(2, 4));
        inputPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createDashedBorder(Color.BLUE, 5, 2),"Please enter the following"));
        
        inputPanel.add(lblNumEggBought);
        inputPanel.add(txtNumEggBought);
        inputPanel.add(lblNumEggBroke);
        inputPanel.add(txtNumEggBroke);
        inputPanel.add(lblCostEgg);
        inputPanel.add(txtCostEgg);
        inputPanel.add(lblNumPacSold);
        inputPanel.add(txtNumPacSold);        
        
        centerPanel.add(inputPanel);
        
        lblProfit = new JLabel("Your profit for the week is the following:");
        lblPerEggBroke = new JLabel("The percentage of eggs that broke during packaging is:");
        lblNumEggTake = new JLabel("The number of eggs that you took for personal use is:");
        
        txtProfit = new JTextField(10);
        txtProfit.setEditable(false);
        txtProfit.setBackground(Color.WHITE);
        txtPerEggBroke = new JTextField(10);
        txtPerEggBroke.setEditable(false);
        txtPerEggBroke.setBackground(Color.WHITE);
        txtNumEggTake = new JTextField(10);
        txtNumEggTake.setEditable(false);
        txtNumEggTake.setBackground(Color.WHITE);
        
        outputPanel.setLayout(new GridLayout(3, 2));       
         
        outputPanel.add(lblProfit);
        outputPanel.add(txtProfit);
        outputPanel.add(lblPerEggBroke);
        outputPanel.add(txtPerEggBroke);
        outputPanel.add(lblNumEggTake);
        outputPanel.add(txtNumEggTake);
        
        centerPanel.add(outputPanel);
        
        add(centerPanel, BorderLayout.CENTER);
        
        btnCal = new JButton("Calculate");
        btnCal.addActionListener(this);
        btnCl = new JButton("Clear");
        btnCl.addActionListener(this);
        btnExt = new JButton("Exit");
        btnExt.addActionListener(this);
        
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 10));
        buttonPanel.add(btnCal);
        buttonPanel.add(btnCl);
        buttonPanel.add(btnExt);
        buttonPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 15, 10));
        
        add(buttonPanel, BorderLayout.SOUTH);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        Object source = e.getSource();
        
        if(source == btnCal){
            
        }else if(source == btnCl){
            txtNumEggBought.setText(null);
            txtNumEggBroke.setText(null);
            txtCostEgg.setText(null);
            txtNumPacSold.setText(null);
            txtProfit.setText(null);
            txtPerEggBroke.setText(null);
            txtNumEggTake.setText(null);
        }else if(source == btnExt){
            new ExitWindow();
        }
        
    }
    
    
    
}
