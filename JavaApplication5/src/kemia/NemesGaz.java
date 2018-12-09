/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kemia;

/**
 *
 * @author Patrik
 */
public class NemesGaz extends KemiaiElem {
    
    public NemesGaz(String vegyjel, int rendszam, int focsoport) {
        super(vegyjel, rendszam, focsoport);
        
        try{
            if(super.getFocsoport()==8);
        }catch(Exception e){
            System.out.println("a gazok focsoportja a 8");
        }
    }
    
    public boolean reakcioKepes(KemiaiElem k){
       if(super.getFocsoport()+k.getFocsoport()%8==0)
           return true;
       else return false;
    }
    
}
