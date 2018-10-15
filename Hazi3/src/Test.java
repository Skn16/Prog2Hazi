
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class Test {
    
    public static Katona megkuzd(Katona k1,Katona k2){
        System.out.println(k1.toString()+" megkuzd "+k2.toString()+"-el"); 
        System.out.println("\n a nyertes:");
        if (k1.getTamadoero()>k2.getVedoero()) return k1;
            else if(k1.getTamadoero()==k2.getVedoero())     return k1;
            else return k2;
    }
    
    public static void main(String[] args) {
        Katona[] katonak= new Katona[]{
            new Nyilas(15,6,4),
            new Nyilas(17,5,7),
            new Landzsas(9,5),
    };
        if(megkuzd(katonak[0],katonak[1])==katonak[1]){
            System.out.println(megkuzd(katonak[0],katonak[1]));
            System.out.println("\n");
             System.out.println(megkuzd(katonak[1],katonak[2]));
        }   
        else {
            System.out.println(megkuzd(katonak[0],katonak[1]));
            System.out.println("\n");
            System.out.println(megkuzd(katonak[0],katonak[2]));
        }
        
    }



}
