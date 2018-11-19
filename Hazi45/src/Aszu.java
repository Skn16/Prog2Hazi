/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class Aszu extends Bor {
    private int puttonySzam;

    public Aszu(String iz, double alkoholTartalom, String szoloFajta, String termoTerulet,int puttonySzam) {
        super(iz, alkoholTartalom, szoloFajta, termoTerulet);
        this.puttonySzam= puttonySzam;
    }
    
    public int hanyPuttonyos(){
        return this.puttonySzam;
    }

    @Override
    public String toString() {
        return "Aszu{" + "puttonySzam=" + puttonySzam + '}';
    }




}
