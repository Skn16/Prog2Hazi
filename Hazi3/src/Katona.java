/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class Katona {
    private int tamadoero = 5;
    private int vedoero = 5;

    public Katona(int tamadoero,int vedoero) {
        this.tamadoero = tamadoero;
        this.vedoero = vedoero;
    }

    public Katona() {
        this.tamadoero = tamadoero;
        this.vedoero = vedoero;
    }
    
    public int getTamadoero() {
        return tamadoero;
    }

    public void setTamadoero(int tamadoero) {
        this.tamadoero = tamadoero;
    }

    public int getVedoero() {
        return vedoero;
    }

    public void setVedoero(int vedoero) {
        this.vedoero = vedoero;
    }

    @Override
    public String toString() {
        return "TE:[" + tamadoero + "], VE:[" + vedoero + "]";
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Katona))
            return false;
        
        Katona k = (Katona) obj;
        
        return this.vedoero == k.getVedoero() && this.tamadoero == k.getTamadoero();
        
    }
    
       
    
    
    
    
    
    
    
    
}
