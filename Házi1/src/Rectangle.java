/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class Rectangle {
    public double width;
    public double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this.width =1;
        this.height =1;
    }

    public double getPerimeter(){
        return (this.width+this.height)*2;
    }

    public double getArea(){
        return this.width*this.height;
    }

    @Override
    public String toString() {
        return "Teglalap:" + "szelessege=" + this.width + ", magassaga=" + this.height;
    }

    


}
