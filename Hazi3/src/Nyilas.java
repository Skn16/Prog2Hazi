/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class Nyilas extends Katona {
    private int lotav;

    public Nyilas(int lotav, int tamadoero, int vedoero) {
        super(tamadoero, vedoero);
        this.lotav = lotav;
        super.setTamadoero(tamadoero+this.lotav);
    }

    public int getLotav() {
        return lotav;
    }  
    
     @Override
    public String toString() {
        return "TE:[" + this.getTamadoero() + "], VE:[" + super.getVedoero() + "]";
    }

     @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Katona))
            return false;
        
        Katona k = (Katona) obj;
        
        return this.getTamadoero()==super.getTamadoero() && this.getVedoero()==super.getVedoero() && this.lotav == getLotav();
        
    }
    
    
}
