/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
public class Teherauto extends Auto {

    private int maxSzallithatoTeher;
    
    public Teherauto(String rendszam, int motorteljesitmeny, int maxSzallithatoTeher ) {
        super(rendszam, motorteljesitmeny);
        this.maxSzallithatoTeher = maxSzallithatoTeher;
    }

    public int getMaxSzallithatoTeher() {
        return maxSzallithatoTeher;
    }

    @Override
    public String toString() {
        return super.toString() + maxSzallithatoTeher;
    }

     @Override
    public boolean equals(Object obj) {
        
        if(obj == null || !(obj instanceof Auto))
            return false;
        
        Auto k = (Auto) obj;
        
        return super.equals(k) && this.maxSzallithatoTeher == getMaxSzallithatoTeher();
        
    }








}