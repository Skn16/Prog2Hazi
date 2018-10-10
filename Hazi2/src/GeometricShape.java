
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
public class GeometricShape {
    private String color;
    private boolean filled;
    private Date dateCreated;

    public GeometricShape() {
        this.filled = false;
        this.color ="white";
        this.dateCreated = new Date();
    }
    
    public GeometricShape(boolean filled,String color) {
        this.filled = filled;
        this.color = color;
    }

    
    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return dateCreated +"\n"+ "color:"+color +"and filled: "+filled;
    }

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
