/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Hallgato {
    String nev;
    String nkod;
    double atlag;
    int evfolyama;

    public Hallgato(String nev, String nkod, int evfolyama) {
        this.nev = nev;
        this.nkod = nkod;
        this.evfolyama = evfolyama;
    }
    
    
public void koszon(Hallgato kinek) {
    System.out.println(kinek.getNev()+ "Jó napot ");
}
    
 public String getNev(){
     return nev;
 }   
}