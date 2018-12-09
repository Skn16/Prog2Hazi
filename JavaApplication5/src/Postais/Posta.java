/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Postais;

/**
 *
 * @author Patrik
 */
public class Posta implements Comparable<Posta>{

    private String nev;
    private int irszam;
    private String telepules;
    private String utca;
    private int hazszam;
    private int ertek;

    public Posta(String nev, int irszam, String telepules, String utca, int hazszam, int ertek) {
        this.nev = nev;
        this.irszam = irszam;
        this.telepules = telepules;
        this.utca = utca;
        this.hazszam = hazszam;
        this.ertek = ertek;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getIrszam() {
        return irszam;
    }

    public void setIrszam(int irszam) {
        this.irszam = irszam;
    }

    public String getTelepules() {
        return telepules;
    }

    public void setTelepules(String telepules) {
        this.telepules = telepules;
    }

    public String getUtca() {
        return utca;
    }

    public void setUtca(String utca) {
        this.utca = utca;
    }

    public int getHazszam() {
        return hazszam;
    }

    public void setHazszam(int hazszam) {
        this.hazszam = hazszam;
    }

    public int getErtek() {
        return ertek;
    }

    public void setErtek(int ertek) {
        this.ertek = ertek;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if  (obj==null || !(obj instanceof Posta)) return false;
        
        Posta k=(Posta) obj;
        return  this.nev.equals(k.getNev());
    }
    
    @Override
    public int compareTo(Posta t) {
        return Integer.compare(this.irszam,t.getIrszam());
    }

    @Override
    public String toString() {
        return telepules + ", " + utca + "," + nev + "," + ertek +" Ft";
    }
    
    
}
