/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negyedik;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Patrik
 */
public class IdoAtalakito extends JFrame implements ActionListener {

    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    private JLabel lb4;
    private JLabel lb5;
    private JLabel lb6;
    private JLabel lb7;
    private JLabel lb8;
    private JLabel lb9;
    private JLabel lb10;
    private JLabel lb11;
    private JLabel lb12;
    
    private JTextField tf1;
    private JTextField tf2;
    private JTextField tf3;
    private JTextField tf4;
    private JTextField tf5;
    private JTextField tf6;
    private JTextField tf7;
    private JTextField tf8;
    private JTextField tf9;
    private JTextField tf10;
    private JTextField tf11;
    private JTextField tf12;
    
    private JButton bt;
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    
    public IdoAtalakito() throws HeadlessException{
        super("IdoAtalakito");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        lb1= new JLabel("nap");
        lb2= new JLabel("ora");
        lb3= new JLabel("perc");
        lb4= new JLabel("masodperc");
        
        lb5= new JLabel("nap");
        lb6= new JLabel("ora");
        lb7= new JLabel("perc");
        lb8= new JLabel("masodperc");
        
        lb9= new JLabel("nap");
        lb10= new JLabel("ora");
        lb11= new JLabel("perc");
        lb12= new JLabel("masodperc");
        
        bt= new JButton("Szamol");
        
        tf1 = new JTextField(5);
        tf2 = new JTextField(5);
        tf3 = new JTextField(5);
        tf4 = new JTextField(5);
        tf5 = new JTextField(5);
        tf6 = new JTextField(5);
        tf7 = new JTextField(5);
        tf8 = new JTextField(5);
        tf9 = new JTextField(5);    
        tf10 = new JTextField(5);
        tf11 = new JTextField(5);
        tf12 = new JTextField(5);
        
        p1= new JPanel();
         p2= new JPanel();
          p3= new JPanel();
           p4= new JPanel();
        
        GridLayout gr = new GridLayout(4,1);
        GridLayout gr1 = new GridLayout(1,1);
        setLayout(gr);
        FlowLayout fl = new FlowLayout();
        
//        p1.setLayout(gr);
        p1.add(tf1);
        p1.add(lb1);
        p1.add(tf2);
        p1.add(lb2);
        p1.add(tf3);
        p1.add(lb3);
        p1.add(tf4);
        p1.add(lb4);
        
//        p2.setLayout(gr);
        p2.add(tf5);
        p2.add(lb5);
        p2.add(tf6);
        p2.add(lb6);
        p2.add(tf7);
        p2.add(lb7);
        p2.add(tf8);
        p2.add(lb8);
        
        p3.setLayout(gr1);
        p3.add(bt);
        
//        p4.setLayout(gr);
        p4.add(tf9);
        p4.add(lb9);
        p4.add(tf10);
        p4.add(lb10);
        p4.add(tf11);
        p4.add(lb11);
        p4.add(tf12);
        p4.add(lb12);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        
        bt.addActionListener(this);
       
        pack();
          
    }
    
                public static void main(String[] args) {
                IdoAtalakito i=new IdoAtalakito();
        
        }
    
        public void actionPerformed(ActionEvent e) {
           int a=0;
           a=Integer.valueOf(tf4.getText()) + Integer.valueOf(tf8.getText());
           int b=0;
           b=Integer.valueOf(tf3.getText()) + Integer.valueOf(tf7.getText());
           int c=0;
           c=Integer.valueOf(tf2.getText())+Integer.valueOf(tf6.getText());
           int d=0;
           d=Integer.valueOf(tf1.getText())+Integer.valueOf(tf5.getText());
            
           if(e.getSource()==bt) {
                if(Integer.valueOf(tf4.getText()) + Integer.valueOf(tf8.getText()) < 60) {
                     tf12.setText(String.valueOf(a));
            } else {
                tf12.setText(String.valueOf(a-60));
                b = b + 1;
            }
            
            if(Integer.valueOf(tf3.getText()) + Integer.valueOf(tf7.getText()) < 60) {
                tf11.setText(String.valueOf(b));
            } else {
                tf11.setText(String.valueOf(b-60));
                c = c + 1;
            }
            
            if(Integer.valueOf(tf2.getText()) + Integer.valueOf(tf6.getText()) < 24) {
                tf10.setText(String.valueOf(c));
            } else {
                tf10.setText(String.valueOf(c-24));
                d = d + 1;
            }
            
            tf9.setText(String.valueOf(d));
        }
                }
        
        
        }
