
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
public class Etterem extends VendeglatoipariEgyseg{
    private String[] etlap;

    public Etterem(String nev, int ferohelyekSzama, boolean dohanyzo,String[] etlap) {
        super(nev, ferohelyekSzama, false);
        this.etlap = etlap;
    }

    public String[] getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return super.toString() + Arrays.toString(etlap);
    }
    
    
    
}
