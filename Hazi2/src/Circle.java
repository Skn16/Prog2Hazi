
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
    public class Circle extends GeometricShape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, boolean filled, String color, Date dateCrated) {
        super(filled, color);
        this.radius = radius;
    }
    
    

    public double getRadius(){
        return this.radius;
    }
    
    public double getArea(){
        return Math.PI*(this.radius*this.radius);
    }
    
    public double getPerimeter(){
        return 2*Math.PI*this.radius;
    }
    
    public double getDiameter(){
        return 2*this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
  
    }
