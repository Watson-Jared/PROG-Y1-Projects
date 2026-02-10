/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package movieticketsgui;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.io.*;

/**
 *
 * @author lab_services_student
 */
public class MyWindow extends JFrame implements ActionListener {
    
    private JPanel pMovie, pNumTickets, pTicketPrice, pTicketReport;
    private JComboBox cboMovie;
    private JLabel lblMovie, lblNumTickets, lblPrice, lblReport;
    private JTextField txtNumTickets, txtPrice;
    private JTextArea txtReport;
    private JMenuBar bar;
    private JMenu mFile, mTools;
    private JMenuItem iExit, iProcess, iClear;
    
    
    
    public MyWindow(){
        super("Movie TIckets");
        setLayout(new GridLayout(4,1));
        createPanel1();
        createPanel2();
        createPanel3();
        setSize(400,300);
        setVisible(true);
    }
    
    public void createPanel1(){
        pMovie = new JPanel();
        pMovie.setLayout(new GridLayout(1,2));
        
        lblMovie = new JLabel("Movie: ");
        
        String movies[] = {"Napoleon","Oppenhimer","Damsel"};
        cboMovie = new JComboBox(movies);
        cboMovie.addActionListener(this);
        
        pMovie.add(lblMovie);
        pMovie.add(cboMovie);
        
        add(pMovie);
    }
    
    public void createPanel2(){
        pNumTickets = new JPanel();
        pNumTickets.setLayout(new GridLayout(1,2));
        
        lblNumTickets = new JLabel("Number of Tickets: ");
        
        txtNumTickets = new JTextField();
        
        pNumTickets.add(lblNumTickets);
        pNumTickets.add(txtNumTickets);
        
        add(pNumTickets);
    }
    
    public void createPanel3(){
        pTicketPrice = new JPanel();
        pTicketPrice.setLayout(new GridLayout(1,2));
        
        lblPrice = new JLabel("Ticket Price: ");
        
        txtPrice = new JTextField();
        
        pTicketPrice.add(lblPrice);
        pTicketPrice.add(txtPrice);
        
        add(pTicketPrice);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
    }
}
