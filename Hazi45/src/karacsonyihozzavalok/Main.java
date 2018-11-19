/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Karacsonyihozzavalok;

import java.util.Scanner;

/**
 *
 * @author Home
 */
public class Main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
      String sor= sc.nextLine();
        
        while(sor.length()>0) {
            String[] s = sor.split(";");
            for(int i=1;i<s.length;i++){
                int sz=Integer.parseInt(s[1]);
                Hozzavalok ho = new Hozzavalok(s[0],sz);
    }
            sor=sc.nextLine();
}
    }
    
}
