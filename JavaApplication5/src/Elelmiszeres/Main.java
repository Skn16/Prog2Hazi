/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elelmiszeres;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrik
 */
public class Main {
     public static void main(String[] args) {
        
        List<Tartos> li = new ArrayList<>();
        
        try {
            
            FileReader fr = new FileReader(new File("beolvas.txt"));
            BufferedReader br = new BufferedReader(fr);
            
            String sor;
            
            while((sor=br.readLine())!=null) {
                
                String[] st = sor.split(";");
                
            if(st.length>5) {
                Elelmiszer e = new Elelmiszer(st[0],st[1],Double.parseDouble(st[2]),st[3],Integer.parseInt(st[4]),Integer.parseInt(st[5]));
                li.add(e);
            }else {
                Tartos t = new Tartos(st[0],st[1],Double.parseDouble(st[2]),st[3],Integer.parseInt(st[4]));
                li.add(t);
            }
            }
          br.close();  
        }catch(IOException e) {
            System.out.println("File hiba!");
        }
        
        try {
            FileWriter fw = new FileWriter(new File("ki.txt"));
            BufferedWriter bw = new BufferedWriter(fw);
            
            for(Tartos i:li) {
                bw.write(i.toString());
                bw.newLine();
            }
        bw.close();
        }catch(IOException e) {
            System.out.println("File hiba!");
        }
        
        for(Tartos s:li)
            System.out.println(s);
        
    } 
}

