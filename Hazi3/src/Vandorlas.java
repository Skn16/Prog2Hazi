/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class Vandorlas {
    private String nev;
    private String utvonal;

    public Vandorlas(String nev, String utvonal) {
        this.nev = nev;
        this.utvonal = utvonal;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getUtvonal() {
        return utvonal;
    }

    public void setUtvonal(String utvonal) {
        this.utvonal = utvonal;
    }

    @Override
    public String toString() {
        return "Vandorlas{" + "nev=" + nev + ", utvonal=" + utvonal + '}';
    }
    
    
}
