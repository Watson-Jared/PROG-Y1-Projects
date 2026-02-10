/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hospital;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class MyWindow extends JFrame implements ActionListener{
    
    private JPanel pTitle, pPatientName, pTypePatient, pAmount, pInPatient, pBill, pRoomButtons,pBtns;
    private JLabel lblTitle, lblPatientName, lblCharges, lblServices, lblNumDays, lblRoomType, lblBill;    
    private JTextField txtPatientName, txtCharges, txtServices, txtNumDays, txtAmount;
    private JRadioButton rbtnInPatient, rbtnOutPatient, rbtnPrivateRoom, rbtnThreeBedRoom, rbtnSixBedRoom;
    private JButton btnCalc, btnCl;
    private ButtonGroup grpTypePatient, grpRoomType;
    
    
    
    public MyWindow(){
        super();
        setTitle("Get Well");
        setSize(800, 600);       
        setLayout(new BorderLayout(10, 10));
        //getContentPane().setBackground(new Color(240, 248, 255)); // Change Color of window
        createControls();
        setVisible(true);
    }
    
    public void createControls(){
        
        createTopPanel();
        createCenterPanel(); 
        createBottomPanel();
    }
    
    public void createTopPanel(){
        pTitle = new JPanel();
        lblTitle = new JLabel("Get Well Hospital");
        lblTitle.setFont(new Font("Arial", Font.BOLD, 18));
        pTitle.setBorder(BorderFactory.createEmptyBorder(15, 10, 15, 10));
        //pTitle.setBackground(new Color(173, 216, 230)); // Change Panel Color
        pTitle.add(lblTitle);
        
        pPatientName = new JPanel();
        pPatientName.setLayout(new GridLayout(1, 2));
        pPatientName.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder(BorderFactory.createDashedBorder(Color.BLUE, 5, 2),"Please Enter the following information in order"
                + "to prepare your bill"),
        BorderFactory.createEmptyBorder(15, 20, 15, 20)
        ));
        
        pPatientName.setSize(500, 100);
        lblPatientName = new JLabel("Patient Name:");
        txtPatientName = new JTextField();
        txtPatientName.setSize(200, 200);
        txtPatientName.setBackground(Color.WHITE);
        pPatientName.add(lblPatientName);
        pPatientName.add(txtPatientName);
        
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        
        topPanel.add(pTitle, BorderLayout.NORTH);
        topPanel.add(pPatientName, BorderLayout.CENTER);
        
        add(topPanel, BorderLayout.NORTH);
    }
    
    public void createCenterPanel(){        
        pTypePatient = new JPanel();
        pTypePatient.setLayout(new GridLayout(2,1));
        pTypePatient.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder(BorderFactory.createDashedBorder(Color.BLUE, 5, 2),"Type of Patient"),
        BorderFactory.createEmptyBorder(15, 20, 15, 20) // top, left, bottom, right padding
        ));
        
        rbtnInPatient = new JRadioButton("In Patient");
        rbtnInPatient.addActionListener(this);
        rbtnOutPatient = new JRadioButton("Out Patient");
        rbtnOutPatient.addActionListener(this);
        
        grpTypePatient = new ButtonGroup();
        grpTypePatient.add(rbtnInPatient);
        grpTypePatient.add(rbtnOutPatient);
        
        pTypePatient.add(rbtnInPatient);
        pTypePatient.add(rbtnOutPatient);
        
        pAmount = new JPanel();
        pAmount.setLayout(new GridLayout(2,2));
        pAmount.setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder(BorderFactory.createDashedBorder(Color.BLUE, 5, 2),"Enter Amount for"),
        BorderFactory.createEmptyBorder(15, 20, 15, 20) // top, left, bottom, right padding
        ));
        
        lblCharges = new JLabel("Medical Charges:");
        lblServices = new JLabel("Hospital Services");
        
        txtCharges = new JTextField();
        txtServices = new JTextField();
        
        pAmount.add(lblCharges);
        pAmount.add(txtCharges);
        pAmount.add(lblServices);
        pAmount.add(txtServices);
        
        
        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BorderLayout());        
        centerPanel.add(pTypePatient, BorderLayout.WEST);
        centerPanel.add(pAmount, BorderLayout.CENTER);
        
        add(centerPanel,  BorderLayout.CENTER); 
    }
    
    public void createBottomPanel(){
        pInPatient  = new JPanel();
        pInPatient .setLayout(new GridLayout(2,2));
        pInPatient .setBorder(BorderFactory.createCompoundBorder(
        BorderFactory.createTitledBorder(BorderFactory.createDashedBorder(Color.BLUE, 5, 2),"For in Patient"),
        BorderFactory.createEmptyBorder(15, 20, 15, 20) // top, left, bottom, right padding
        ));
        
        //Rooms Panel
        lblNumDays = new JLabel("Number of Days:");
        lblRoomType = new JLabel("Select Type of Room");
        
        txtNumDays = new JTextField();
        
        rbtnPrivateRoom = new JRadioButton("Private Room");
        rbtnPrivateRoom.addActionListener(this);
        rbtnThreeBedRoom = new JRadioButton("Three Bed Room");
        rbtnThreeBedRoom.addActionListener(this);
        rbtnSixBedRoom = new JRadioButton("Six Bed Room");
        rbtnSixBedRoom.addActionListener(this);
        
        grpRoomType = new ButtonGroup();
        grpRoomType.add(rbtnPrivateRoom);
        grpRoomType.add(rbtnThreeBedRoom);
        grpRoomType.add(rbtnSixBedRoom);
        
        pRoomButtons = new JPanel(); 
        pRoomButtons.setLayout(new GridLayout(3, 1));
        pRoomButtons.add(rbtnPrivateRoom);
        pRoomButtons.add(rbtnThreeBedRoom);
        pRoomButtons.add(rbtnSixBedRoom);
        
        pInPatient.add(lblNumDays);
        pInPatient.add(txtNumDays);
        pInPatient.add(lblRoomType);
        pInPatient.add(pRoomButtons);
        
        //Bill Panel
        pBill = new JPanel();
        pBill.setLayout(new GridLayout(3,1));
        pBill.setBorder(BorderFactory.createEmptyBorder(15, 20, 15, 20));
        
        pBtns = new JPanel();
        pBtns.setLayout(new GridLayout(1,2));
        pBtns.setBorder(BorderFactory.createEmptyBorder(5, 10, 5, 10));
        btnCalc = new JButton("Calculate");
        btnCalc.addActionListener(this);
        btnCalc.setMnemonic('C');
        btnCl = new JButton("Clear");
        btnCl.addActionListener(this);
        btnCl.setMnemonic('l');
        
        pBtns.add(btnCalc);
        pBtns.add(btnCl);
        
        lblBill = new JLabel("The cost of your bill is:");
        lblBill.setBorder(BorderFactory.createEmptyBorder(5, 0, 5, 0));
        txtAmount = new JTextField();
        
        pBill.add(pBtns);
        pBill.add(lblBill);
        pBill.add(txtAmount);
        
        
        
        JPanel bottomPanel = new JPanel();
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));        
        bottomPanel.add(pInPatient, BorderLayout.WEST);
        bottomPanel.add(pBill, BorderLayout.CENTER);
        
       
        add(bottomPanel, BorderLayout.SOUTH);        
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        Object source = e.getSource();
    }
    
}
