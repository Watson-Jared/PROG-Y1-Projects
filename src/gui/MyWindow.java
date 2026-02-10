/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MyWindow extends JFrame implements ActionListener {
    private JLabel lblName, lblTest1, lblTest2, lblFinal;
    private JTextField txtName, txtTest1, txtTest2,txtFinal;
    private JButton btnCalculate, btnClear,btnSave,btnRead;
    File file = new File("Student.txt");
    
    public MyWindow(){
        super();
        setTitle("MSA Mark System");
        setSize(300,300);
        setLayout(new GridLayout(6,2));
        createControls();
        setVisible(true);
    }
    
    public void createControls(){
        lblName = new JLabel("Name");
        lblTest1 = new JLabel("Test 1");
        lblTest2 = new JLabel("Test 2");
        lblFinal = new JLabel("Final");
        
        txtName = new JTextField();
        txtTest1 = new JTextField();
        txtTest2 = new JTextField();
        txtFinal = new JTextField();
        
        btnCalculate = new JButton("Calculate");
        btnCalculate.setMnemonic('C');
        btnCalculate.setToolTipText("Alt + Enter to calculate");
        btnCalculate.addActionListener(this);
        
        btnClear = new JButton("Clear");
        btnClear.setMnemonic('l');
        btnClear.addActionListener(this);
        
        btnSave = new JButton("Save");
        btnSave.setMnemonic('S');
        btnSave.addActionListener(this);
        
        btnRead = new JButton("Read");
        btnRead.setMnemonic('R');
        btnRead.addActionListener(this);
        
        add(lblName);
        add(txtName);
        add(lblTest1);
        add(txtTest1);
        add(lblTest2);
        add(txtTest2);
        add(lblFinal);
        add(txtFinal);
        add(btnCalculate);
        add(btnClear);
        add(btnSave);
        add(btnRead);             
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        Object source = e.getSource();
        
        if(source == btnCalculate){
            
            int t1 = Integer.parseInt(txtTest1.getText());
            int t2 = Integer.parseInt(txtTest2.getText());
            
            double ans = (t1+t2)/2;
            
            txtFinal.setText("" +ans);
            
        }else if(source == btnClear){
            txtName.setText(null);
            txtTest1.setText(null);
            txtTest2.setText(null);
            txtFinal.setText(null);
        }else if(source == btnSave){
            
            
            try{
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw);
                
                bw.write(txtName.getText() + " " + txtTest1.getText()+ " " + txtTest2.getText() + " " + txtFinal.getText());
                bw.newLine();
                
                bw.close();
                fw.close();
                clearAll();
                
            }catch(IOException err){
                System.out.println(err.getMessage());
            }
        }else if(source == btnRead){
            String[] name = new String[10];
            String[] test1 = new String[10];
            String[] test2 = new String[10];
            String[] finalMark = new String[10];
            
            
            
            try{
            FileReader fr = new FileReader(file);
            BufferedReader  br = new BufferedReader(fr);
            
            String line = br.readLine();
            int count = 0;
            while (line != null && count < 100) {
                String[] student = line.split(" ");
                
                if (student.length >= 4) {
                    name[count] = student[0];
                    test1[count] = student[1];
                    test2[count] = student[2];
                    finalMark[count] = student[3];
                    count++;
                }
                
                line = br.readLine();
            };
            
            
            }catch(IOException err){
                System.out.println(err.getMessage());
            }
        }
        
    }
    
    public void clearAll(){
        txtName.setText(null);
        txtTest1.setText(null);
        txtTest2.setText(null);
        txtFinal.setText(null);
    }
    
}
