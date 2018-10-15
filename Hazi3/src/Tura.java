
import java.util.Date;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class Tura {
    private Date ev;
    private Date honap;
    private Date nap;
    private String nev;
    private int[] resztav;

    public Tura(Date ev, Date honap, Date nap, String nev, int[] resztav) {
        this.ev = ev;
        this.honap = honap;
        this.nap = nap;
        this.nev = nev;
        this.resztav = resztav;
    }

    
    
    public Date getEv() {
        return ev;
    }

    public void setEv(Date ev) {
        this.ev = ev;
    }

    public Date getHonap() {
        return honap;
    }

    public void setHonap(Date honap) {
        this.honap = honap;
    }

    public Date getNap() {
        return nap;
    }

    public void setNap(Date nap) {
        this.nap = nap;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int[] getResztav() {
        return resztav;
    }

    public void setResztav(int[] resztav) {
        this.resztav = resztav;
    }

    @Override
    public String toString() {
        return ev + ";" + honap + ";" + nap + ";" + nev + ";"+ resztav;
    }
    
 
    
}