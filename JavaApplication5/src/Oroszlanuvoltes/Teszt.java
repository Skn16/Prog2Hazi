/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oroszlanuvoltes;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrik
 */
public class Teszt {

    public static void oroszlanSzamol(List<Allomas> l) {

        List <Integer> tmp=l.get(0).oroszlanuvoltesPoz(); //ez elsoallomas oroszlauvoltesei
        for(Allomas i:l)
            tmp.retainAll(i.oroszlanuvoltesPoz());  //retainAll csak azokat tratja meg a tmp-be, amik benne vannak a parameterkent kapott listaban is, azaz ebben: i.oroszlanuvoltesPoz()
        
        System.out.println(tmp.size());      //vegul csak a kozos elemek(emelyek minden listaban benne voltak) maradnak a tmp-be
        
               
    }

    public static void main(String[] args) {

        List<Allomas> l = new ArrayList<>();
        try {
            FileReader fr = new FileReader(new File("sample3.txt"));
            BufferedReader br = new BufferedReader(fr);

            String sor;
            while ((sor = br.readLine()) != null) {
                if (sor.equals("END")) {
                    oroszlanSzamol(l);
                    
                    l.clear();
                } else {

                    String[] komponensek = sor.split(":");
                    Allomas  Ăˇ= new Allomas(komponensek[0], komponensek[1]);
                    l.add(Ăˇ);

                }

            }
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
