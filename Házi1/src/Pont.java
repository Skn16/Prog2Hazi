/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class Pont {
    private double x;
    private double y;

    public Pont(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getPontX(){
        return x;
    }

    public double getPontY(){
        return y;
    }

    public void setPontX(double x){
        this.x=x;
    }
    
    public void setPontY(double y){
        this.y=y;
    }
 

}
