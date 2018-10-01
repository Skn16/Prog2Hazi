/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class RegularPolygon {
    private int n;
    private double side;
    private double x;
    private double y;

    public RegularPolygon(int z,double u, double x, double y ) {
        this.n=z;
        this.side=u;
        this.x = x;
        this.y = y;
    }
    
    public RegularPolygon(int z,double u) {
        this.n=z;
        this.side=u;
    }
    public RegularPolygon() {
        this.n=3;
        this.side=1.0;
    }
    
    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n=n;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side=side;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x=x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y=y;
    }

    @Override
    public String toString() {
        return "A sokszogben:" + "n=" + this.n + ", side=" + this.side + ", x=" + this.x + ", y=" + this.y ;
    }
    
    public double getPerimeter(){
        return this.n*this.side;
    }

    public double getArea(){
        return (this.n*(this.side*this.side)/(4*Math.tan(Math.PI/this.n)));
    }
    
    
    
    
    
    
    
    
    
}
