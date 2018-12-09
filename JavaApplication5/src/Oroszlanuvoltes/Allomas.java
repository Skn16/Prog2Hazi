/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Oroszlanuvoltes;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Patrik
 */
public class Allomas {
    private String azonosito;
    private String felvetel;

    public Allomas(String azonosito, String felvetel) {
        this.azonosito = azonosito;
        this.felvetel = felvetel;
    }

    public String getAzonosito() {
        return azonosito;
    }

    public String getFelvetel() {
        return felvetel;
    }
    
    public List<Integer> oroszlanuvoltesPoz()
    {
          List<Integer> l= new ArrayList<>();
        for (int i=0;i<this.felvetel.length();i++)
        {
        if(this.felvetel.charAt(i)=='O')
            l.add(i);
            
        
        
        }
    
    return l;
    }
    
}
