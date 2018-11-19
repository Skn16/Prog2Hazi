/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otodik;

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
public class Szamologep extends JFrame implements ActionListener{
    
    private String sz="";
    private JTextField tf1;
    
    private JButton bt1;
    private JButton bt2;
    private JButton bt3;
    private JButton bt4;
    private JButton bt5;
    private JButton bt6;
    private JButton bt7;
    private JButton bt8;
    private JButton bt9;
    private JButton bt10;
    private JButton bt11;
    private JButton bt12;
    private JButton bt13;
    private JButton bt14;
    private JButton bt15;
    private JButton bt16;
    private JButton bt17;
    private JButton bt18;
    private JButton bt19;
    private JButton bt20;
    private JButton bt21;
    private JButton bt22;
    private JButton bt23;
    private JButton bt24;
    private JButton bt25;
    private JButton bt26;
    private JButton bt27;
    private JButton bt28;
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    private JPanel p5;
    private JPanel p6;
    private JPanel p7;
    private JPanel p8;
    
    public Szamologep() throws HeadlessException{
    
        super("Szamologep");
        setVisible(true);
        setDefaultCloseOperation(3);
        
         tf1 = new JTextField(50);
        
        this.bt1 = new JButton("");
        this.bt2 = new JButton("Backspace");
        this.bt3 = new JButton("CE");
        this.bt4 = new JButton("C");
        this.bt5 = new JButton("MC");
        this.bt6 = new JButton("7");
        this.bt7 = new JButton("8");
        this.bt8 = new JButton("9");
        this.bt9 = new JButton("/");
        this.bt10 = new JButton("sqrt");
        this.bt11 = new JButton("MR");
        this.bt12 = new JButton("4");
        this.bt13 = new JButton("5");
        this.bt14 = new JButton("6");
        this.bt15 = new JButton("*");
        this.bt16 = new JButton("%");
        this.bt17 = new JButton("MS");
        this.bt18 = new JButton("1");
        this.bt19 = new JButton("2");
        this.bt20 = new JButton("3");
        this.bt21 = new JButton("-");
        this.bt22 = new JButton("1/x");
        this.bt23 = new JButton("M+");
        this.bt24 = new JButton("0");
        this.bt25 = new JButton("+/-");
        this.bt26 = new JButton(".");
        this.bt27 = new JButton("+");
        this.bt28 = new JButton("=");
            
         p1= new JPanel();
         p2= new JPanel();
         p3= new JPanel();
         p4= new JPanel();
         p5= new JPanel();
         p6= new JPanel();
         p7=new JPanel();
    
    GridLayout gr = new GridLayout(6,1);
      setLayout(gr);
      GridLayout gr2 = new GridLayout(1,1);
    FlowLayout fl = new FlowLayout();
//      setLayout(fl);
        
        p1.add(tf1);
        p1.setLayout(gr2);
        
        p2.add(bt1);
        p2.add(bt2);
        p2.add(bt3);
        p2.add(bt4);
        p2.setLayout(gr2);
        
        p3.add(bt5);
        p3.add(bt6);
        p3.add(bt7);
        p3.add(bt8);
        p3.add(bt9);
        p3.add(bt10);
        p3.setLayout(gr2);
        
        p4.add(bt11);
        p4.add(bt12);
        p4.add(bt13);
        p4.add(bt14);
        p4.add(bt15);
        p4.add(bt16);
        p4.setLayout(gr2);
        
        p5.add(bt17);
        p5.add(bt18);
        p5.add(bt19);
        p5.add(bt20);
        p5.add(bt21);
        p5.add(bt22);
        p5.setLayout(gr2);
        
        p6.add(bt23);
        p6.add(bt24);
        p6.add(bt25);
        p6.add(bt26);
        p6.add(bt27);
        p6.add(bt28);
        p6.setLayout(gr2);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        this.add(p5);
        this.add(p6);
        
    
        
        bt28.addActionListener(this);
        bt27.addActionListener(this);
        bt6.addActionListener(this);
        bt7.addActionListener(this);
        bt8.addActionListener(this);
        bt12.addActionListener(this);
        bt13.addActionListener(this);
        bt14.addActionListener(this);
        bt18.addActionListener(this);
        bt19.addActionListener(this);
        bt20.addActionListener(this);
        bt24.addActionListener(this);
                
       
        pack();
          
      
}
    
     public static void main(String[] args) {
                Szamologep sz=new Szamologep();
        
        }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
        if(ae.getSource()==bt28){
            sz+="=";
            tf1.setText(sz);
            int szam1=0;
            int szam2=0;
            szam1=Integer.parseInt(sz);

//            szam2=Integer.parseInt(sz);
        }
        if(ae.getSource()==bt27){
            sz+="+";
            tf1.setText(sz);
        }
        if(ae.getSource()==bt6){
            sz+="7";
            tf1.setText(sz);
        }
        if(ae.getSource()==bt7){
            sz+="8";
            tf1.setText(sz);
        }
        if(ae.getSource()==bt8){
            sz+="9";
            tf1.setText(sz);
        }
        if(ae.getSource()==bt12){
            sz+="4";
            tf1.setText(sz);
        }
        if(ae.getSource()==bt13){
            sz+="5";
            tf1.setText(sz);
        }
        if(ae.getSource()==bt14){
            sz+="6";
            tf1.setText(sz);
        }
        if(ae.getSource()==bt18){
            sz+="1";
            tf1.setText(sz);
        }
        if(ae.getSource()==bt19){
            sz+="2";
            tf1.setText(sz);
        }
        if(ae.getSource()==bt20){
            sz+="3";
            tf1.setText(sz);
        }
        if(ae.getSource()==bt24){
            sz+="0";
            tf1.setText(sz);
        }
        
    }

}
