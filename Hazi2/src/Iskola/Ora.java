/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Iskola;

/**
 *
 * @author Home
 */
public class Ora {
    private int kod;
    private String nev;
    private int kezdet;

    public Ora(int kod, String nev, int kezdet) {
        this.kod = kod;
        this.nev = nev;
        this.kezdet = kezdet;
        
        if(kezdet<8) this.kezdet=8;
        if(kezdet>12) this.kezdet=12;
    }
    
    
    
    public int getKod() {
        return kod;
    }

    public void setKod(int kod) {
        this.kod = kod;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getKezdet() {
        return kezdet;
    }

    public void setKezdet(int kezdet) {
    this.kezdet= kezdet;
    }

    @Override
    public String toString() {
        return "Ora{" + "kod=" + kod + ", nev=" + nev + ", kezdet=" + kezdet + '}';
    }
    
    
    
    
}
