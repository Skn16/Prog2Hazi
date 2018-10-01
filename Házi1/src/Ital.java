
import java.util.Date;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class Ital {
protected String nev;
protected String kiszereles;
private static final int ar=10;
protected Date gyartasiDatum;

    public Ital(String nev, String kiszereles) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.gyartasiDatum = new Date();
    }

    public String getNev() {
        return this.nev;
    }

    public String getKiszereles() {
        return this.kiszereles;
    }

    public static int getAr() {
        return ar;
    }

    public Date getGyartasiDatum() {
        return this.gyartasiDatum;
    }

    @Override
    public String toString() {
        return nev+","+kiszereles+","+ar+"Ft";
    }
    
    
    public double getArEuroban(){
        return ar*0.0031;
    }

    @Override
    public boolean equals(Object obj) {
       if(obj==null ||!(obj instanceof Ital))
            return false;
        
        Ital k=(Ital) obj;
        
        return this.nev.equals(k.getNev()) && this.kiszereles.equals(k.getKiszereles());
        
    }
    








}
