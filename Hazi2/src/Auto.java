
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class Auto {
    private String rendszam;
    private int motorteljesitmeny;
    private Date gyartasDatum;

    public Auto(String rendszam, int motorteljesitmeny) {
        this.rendszam = rendszam;
        this.motorteljesitmeny = motorteljesitmeny;
        this.gyartasDatum = new Date();
    }

    public String getRendszam() {
        return rendszam;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    public int getMotorteljesitmeny() {
        return motorteljesitmeny;
    }

    public Date getGyartasDatum() {
        return gyartasDatum;
    }

    @Override
    public String toString() {
        return "Auto{" + "rendszam=" + rendszam + ", motorteljesitmeny=" + motorteljesitmeny + ", gyartasDatum=" + gyartasDatum + '}';
    }
    
    @Override
    public boolean equals(Object obj) {
        
        if(obj == null || !(obj instanceof Auto))
            return false;
        
        Auto k = (Auto) obj;
        
        return this.rendszam.equals(k.getRendszam()) && this.motorteljesitmeny == k.getMotorteljesitmeny();
        
    }













}
