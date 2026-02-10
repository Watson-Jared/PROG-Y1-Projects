/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui02;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class ExitWindow extends JFrame implements ActionListener{

    private JPanel p = new JPanel();    
    private JLabel confirm = new JLabel("Are you sure you want to exit");
    private JButton yes, no;
    
    public ExitWindow(){
        super();
        setTitle("Confirm");       
        setSize(300, 200);
        setLayout(new GridLayout(2,1));
        createControls();
        setVisible(true);
    }
    
    public void createControls(){
        confirm.setFont(new Font("Arial", Font.BOLD, 18));
        add(confirm);
        
        yes = new JButton("Yes");
        yes.addActionListener(this);
        no = new JButton("No");
        no.addActionListener(this);
        
        p.setLayout(new GridLayout(1,2));
        p.add(yes);
        p.add(no);        
        p.setBorder(BorderFactory.createEmptyBorder(10, 0, 0, 10));
        add(p);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e){
        
        Object source = e.getSource();
        
        if(source == yes){
            System.exit(0);
        }else if(source == no){
            dispose();
        }
        
    }
    
}
