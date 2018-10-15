/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class Homerseklet {
    private String varos;
    private int homerseklet;

    public Homerseklet(String varos, int homerseklet) {
        this.varos = varos;
        this.homerseklet = homerseklet;
    }

    public String getVaros() {
        return varos;
    }

    public void setVaros(String varos) {
        this.varos = varos;
    }

    public int getHomerseklet() {
        return homerseklet;
    }

    public void setHomerseklet(int homerseklet) {
        this.homerseklet = homerseklet;
    }

    @Override
    public String toString() {
        return varos + " (" + homerseklet +")";
    }
    
    
    
}
