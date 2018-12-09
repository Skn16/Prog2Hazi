/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Merlegeles;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Patrik
 */
public class Teszt {
    public static void main(String[] args) {
        List<Ceg> li = new ArrayList<>();
        try{
            FileReader fr=new FileReader(new File("sample1.txt"));
            BufferedReader br=new BufferedReader(fr);
            
            String sor;
            
            while((sor=br.readLine())!=null) {
                String [] tmp=sor.split(":");
                Ceg c= new Ceg(tmp[tmp.length-4],tmp[tmp.length-3],Integer.parseInt(tmp[tmp.length-2]),Integer.parseInt(tmp[tmp.length-1]));
               
                li.add(c);
            }
            
            br.close();
            Collections.sort(li);
            
            for(int i=0;i<li.size()-1;i++){
                if(li.get(i).equals(li.get(i+1))){
                    li.get(i).setArbevetel(li.get(i+1).getArbevetel()+li.get(i).getArbevetel());
                    li.remove(i+1);
                }
            }
            
            for(int i=0;i<li.size()-1;i++){
                System.out.println(li.get(i));
            }
            
    }catch(IOException e){
            System.out.println("File Hiba!");        
    }
    
        }
}



