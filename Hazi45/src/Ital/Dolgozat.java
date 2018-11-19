/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ital;

/**
 *
 * @author Patrik
 */
public class Dolgozat {
    
    public static void legmagasabb3 (SzeszesItal[] ital) {
        int db=0;
        
        for(int i=0;i<ital.length-1;i++){
                for(int j=i+1;j<ital.length;j++){
                    if(ital[i].getAlkoholTartalom()<ital[j].getAlkoholTartalom()){
                        SzeszesItal tmp=ital[i];
                        ital[i]=ital[j];
                        ital[j]=tmp;
                    }
    }
}
        if(ital.length<3) {
        }
        else for(int i=0;i<ital.length;i++){
            System.out.println(ital[i]);
        }
        
        }
       
        
        
        

    
    public static void main(String[] args) {
        
      SzeszesItal[] italok={ new SzeszesItal("Vorosbor","0,5 l",500,5),
                              new SzeszesItal("Feherbor","0,5 l",550,4.5),
                                new SzeszesItal("Tokaji","0,5 l",2000,6)};
        legmagasabb3(italok);
}
    
}