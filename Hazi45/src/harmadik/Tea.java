/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmadik;

/**
 *
 * @author Patrik
 */
public class Tea implements Rendezheto <Tea>{
    public String nev; 
    public int ar; 
    
    public Tea(String s,int j) { nev=s; ar=j; }

    public int getAr(){
        return this.ar;
    }
    

    public boolean egyenlo(Tea o) {
        if(this.ar == o.getAr()) return true;
        else return false;
    }

  
    public boolean nagyobbMint(Tea o) {
        if(this.ar > o.getAr()) return true;
        else return false;
    }

  
    public boolean kisebbMint(Tea o) {
        if(this.ar > o.getAr()) return true;
        else return false;
    }

}