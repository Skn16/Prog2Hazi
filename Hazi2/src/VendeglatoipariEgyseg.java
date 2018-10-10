
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class VendeglatoipariEgyseg {
    private String nev;
    private int ferohelyekSzama;
    private boolean dohanyzo;

    public VendeglatoipariEgyseg (String nev, int ferohelyekSzama, boolean dohanyzo) {
        this.nev = nev;
        this.ferohelyekSzama = ferohelyekSzama;
        this.dohanyzo = dohanyzo;
    }

    public String getNev() {
        return nev;
    }

    public int getFerohelyekSzama() {
        return ferohelyekSzama;
    }

    public boolean isDohanyzo() {
        return dohanyzo;
    }

    public void setDohanyzo(boolean dohanyzo) {
        this.dohanyzo = dohanyzo;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null ||!(obj instanceof VendeglatoipariEgyseg))
            return false;
        
        VendeglatoipariEgyseg k=(VendeglatoipariEgyseg) obj;
        
        return this.nev.equals(k.getNev()) && this.ferohelyekSzama==k.getFerohelyekSzama();
    }
    
    

    @Override
    public String toString() {
        return "VendeglatoipariEgyseg" + "nev=" + nev + ", ferohelyekSzama=" + ferohelyekSzama + ", dohanyzo=" + dohanyzo + '}';
    }
    
    
    
}
