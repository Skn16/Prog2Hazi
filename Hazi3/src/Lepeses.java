/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class Lepeses {
    private String nev;
    private String[] lepesek;

    public Lepeses(String nev, String[] lepesek) {
        this.nev = nev;
        this.lepesek = lepesek;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String[] getLepesek() {
        return lepesek;
    }

    public void setLepesek(String[] lepesek) {
        this.lepesek = lepesek;
    }

    @Override
    public String toString() {
        return "Lepeses{" + "nev=" + nev + ", lepesek=" + lepesek + '}';
    }
    
    
}
