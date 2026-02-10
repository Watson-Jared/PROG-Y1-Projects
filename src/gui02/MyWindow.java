/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui02;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.io.*;


public class MyWindow extends JFrame implements ActionListener{
    
    private JMenu fileM,editM;
    private JMenuItem newOrderI, exitI, aboutI;
    private JMenuBar bar;    
    private JRadioButton rbSmall, rbMedium, rbLarge;
    private JPanel p1, p2, p3, p4,p5;
    private ButtonGroup group;
    private JCheckBox chkCheese, chkOlives, chkMushrooms, chkMeat;
    private JLabel lblTitle, lblAmountDue;
    private JTextField txtAmountDue;
    private JTextArea txtArea;
    private JComboBox cboList;
    private String size;
    private String[] extras = new String[4];
    
    
    
    public MyWindow(){
        super("Pizza Hut");
        setLayout(new BorderLayout());
        createMenu();
        createRadio();
        createCheckBox();
        createTitle();
        createLablel();
        createArea();
        setSize(400,300);
        setVisible(true);
    }
    
    public void createArea(){
        String [] list = {  "Vegetable", "Meat Lovers", "Mexican"};
        cboList = new JComboBox(list);
        cboList.addActionListener(this);
        
        txtArea = new JTextArea();
        
        p5 = new JPanel();
        p5.setLayout(new GridLayout(2,1));
        
        p5.add(cboList);
        p5.add(txtArea);
        add(p5, BorderLayout.CENTER);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        int total = 0;
        if(rbSmall.isSelected()){
            total+=15;
            size = "Small";
        }else if(rbMedium.isSelected()){
            total += 25;
            size = "Medium";
        }else if(rbLarge.isSelected()){
            total +=40;
            size = "Large";
        }
        
        if(chkCheese.isSelected()){
            total += 5;
            extras[0] = "Cheese";
        } 
        
        if(chkOlives.isSelected()){
            total += 10;
            extras[1] = "Olives";
        }
        
        if(chkMushrooms.isSelected()){
            total += 15;
            extras[2] = "Mushrooms";
        }
        
        if(chkMeat.isSelected()){
            total +=20;
            extras[3] = "Meat";
        }
        
        //Proper way to compare strings
        if("Vegetable".equals(cboList.getSelectedItem())){
            total+= 30;
        }
        else if(cboList.getSelectedItem() ==  "Meat Lovers"){
            total+=40;
        }else if(cboList.getSelectedItem() ==  "Mexican"){
            total+=50;
        }
        
        txtAmountDue.setText(""+total);
        
        if( source==newOrderI ){
            
            writeToFile();
            rbSmall.setSelected(false);
            rbMedium.setSelected(false);
            rbLarge.setSelected(false);
            
            chkCheese.setSelected(false);
            chkOlives.setSelected(false);
            chkMushrooms.setSelected(false);
            chkMeat.setSelected(false);            
            txtAmountDue.setText(null); 
            txtArea.setText(null);
        }
        
        if(cboList == source){
            txtArea.setText(""+cboList.getSelectedItem());
        }    
        
        if(source == exitI){
            new ExitWindow();
        }
        
        if(source == aboutI){
            new AboutWindow();
        }        
        
    }
    
    public void createLablel(){
        lblAmountDue = new JLabel("Amount Due: R");
        txtAmountDue = new JTextField();
        p4 = new JPanel();
        p4.setLayout(new GridLayout(1,2));
        p4.add(lblAmountDue);
        p4.add(txtAmountDue);
        p4.setBorder(new TitledBorder("Display"));
        
        add(p4, BorderLayout.SOUTH);
    }
    
    public void createTitle(){
        lblTitle = new JLabel("Pizza Hut");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 28));
        
        p3= new JPanel();
        p3.setLayout(new FlowLayout());
        
        p3.add(lblTitle);
        add(p3, BorderLayout.NORTH);
    }
    
    public void createCheckBox(){
        
        p2 = new  JPanel();
        p2.setBorder(new TitledBorder("Extras"));
        p2.setLayout(new GridLayout(4,1));
        
        chkCheese = new JCheckBox("Cheese");
        chkCheese.addActionListener(this);
        
        chkOlives = new JCheckBox("Olives");
        chkOlives.addActionListener(this);
        
        chkMushrooms = new JCheckBox("Mushrooms");
        chkMushrooms.addActionListener(this);
        
        chkMeat = new JCheckBox("Meat");
        chkMeat.addActionListener(this);
        
        p2.add(chkCheese);
        p2.add(chkOlives);
        p2.add(chkMushrooms);
        p2.add(chkMeat);
        
        add(p2, BorderLayout.EAST);
        
       
    }
    
    public void createRadio(){
        rbSmall = new JRadioButton("Small");
        rbSmall.addActionListener(this);
        rbMedium = new JRadioButton("Medium");
        rbMedium.addActionListener(this);
        rbLarge = new JRadioButton("Large");
        rbLarge.addActionListener(this);
        
        group = new ButtonGroup();
        group.add(rbSmall);
        group.add(rbMedium);
        group.add(rbLarge);
        
        p1 = new JPanel();
        p1.setLayout(new GridLayout(3,1));
        p1.setBorder(new TitledBorder("Sizes"));
        
        p1.add(rbSmall);
        p1.add(rbMedium);
        p1.add(rbLarge);
        
        add(p1,BorderLayout.WEST);        
        
    }
    
    public void createMenu(){
        bar = new JMenuBar();
        
        fileM = new JMenu("File");
        editM = new JMenu("Edit");
        
        newOrderI = new JMenuItem("New Order");
        newOrderI.addActionListener(this);
        exitI = new JMenuItem("Exit");
        exitI.addActionListener(this);
        aboutI = new JMenuItem("About Us");
        aboutI.addActionListener(this);
        
        fileM.add(newOrderI);
        fileM.addSeparator();
        fileM.add(exitI);
        
        editM.add(aboutI);
        
        bar.add(fileM);
        bar.add(editM);
        
        setJMenuBar(bar);
    }
    
    public void writeToFile(){
        File file = new File("NewOrder.txt");
        
        try{
         FileWriter fw = new FileWriter(file, true);
         BufferedWriter bw = new BufferedWriter(fw);
         
        bw.write("=================================");
        bw.newLine();
        bw.write("Pizza Type: " + cboList.getSelectedItem().toString());
        bw.newLine();
        bw.write("Size: " + (size != null ? size : "Not selected"));
        bw.newLine();
        bw.write("Extras:");
        bw.newLine();
        
        // Write each extra (skip null values)
        boolean hasExtras = false;
        for(int i = 0; i < extras.length; i++){
            if(extras[i] != null){
                bw.write("  - " + extras[i]);
                bw.newLine();
                hasExtras = true;
            }
        }
        if(!hasExtras){
            bw.write("  - None");
            bw.newLine();
        }
        
        bw.write("Total Amount: R" + txtAmountDue.getText());
        bw.newLine();
        bw.write("=================================");
        bw.newLine();
        bw.newLine();
                
        bw.close();
        fw.close();
        System.out.println("Written successfully to file");
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
