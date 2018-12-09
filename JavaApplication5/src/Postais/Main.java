/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postais;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author Patrik
 */

public class Main {
    
    public static void kiirat(List<Posta> p){
       
        int szum=0;
            for(int i=0;i<p.size();i++){
                int iranyitoszam=p.get(i).getIrszam();
                    if(iranyitoszam==p.get(i).getIrszam()){
                        szum+=p.get(i).getErtek();
                    }
                System.out.println(iranyitoszam+":"+szum+" Ft");
                    for(int j=0;j<p.size();j++){
                        if(iranyitoszam==p.get(j).getIrszam())
                             System.out.println(p.get(j).toString());
                    }
                    szum=0;
                    
            }
            
                   
                }
        


    
    
    public static void main(String[] args) {
        
        List<Posta> li = new ArrayList<>();
        
        try{
            FileReader fr= new FileReader(new File("sample2.txt"));
            BufferedReader br=new BufferedReader(fr);
            
            String sor;
            while((sor=br.readLine())!=null){
            
                String[] tmp=sor.split(":");
                
                Posta p= new Posta(tmp[tmp.length-6],Integer.parseInt(tmp[tmp.length-5]),tmp[tmp.length-4],tmp[tmp.length-3],Integer.parseInt(tmp[tmp.length-2]),Integer.parseInt(tmp[tmp.length-1]));
            
                li.add(p);
            }
        Collections.sort(li);
        
//        for(int i=0;i<li.size();i++)
//        System.out.println(li.get(i));
        kiirat(li);
        
        
        }catch(IOException e){
            System.out.println("File Hiba!");
        }
        
    }
}
