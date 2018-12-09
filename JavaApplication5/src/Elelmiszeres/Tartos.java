/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Elelmiszeres;

/**
 *
 * @author Patrik
 */
public class Tartos {

    private String kezdo="T";
    private String nev;
    private double egysegar;
    private String megyseg;
    private int mennyiseg;
    
    public Tartos(String kezdo, String nev, double egysegar, String megyseg, int mennyiseg) {
        this.kezdo = kezdo;
        this.nev = nev;
        this.egysegar = egysegar;
        this.megyseg = megyseg;
        this.mennyiseg = mennyiseg;
    }

    public String getKezdo() {
        return kezdo;
    }
    
    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public double getEgysegar() {
        return egysegar;
    }

    public void setEgysegar(double egysegar) {
        this.egysegar = egysegar;
    }

    public String getMegyseg() {
        return megyseg;
    }

    public void setMegyseg(String megyseg) {
        this.megyseg = megyseg;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg = mennyiseg;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.kezdo).append(";").append(this.nev).append(";").append(this.egysegar).append(";").append(this.megyseg).append(";");
        sb.append(this.mennyiseg);
        return sb.toString();
    }
}

