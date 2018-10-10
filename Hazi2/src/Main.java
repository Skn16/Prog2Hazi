
import java.util.Date;
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
//2.feladat
public class Main {
//    public static void main(String[] args) {
//        Triangle h= new Triangle(1,1.5,1);
//        System.out.println(h);
//        System.out.println("A haromszog Teruelete:"+h.getArea()+", A haromszog Kerulete:"+h.getPerimeter());
//        h.setColor("yellow");
//        h.setFilled(true);
//        System.out.println("A szine:"+h.getColor());
//        System.out.println("Filled:"+h.isFilled());
//    
//    }
       
    
// 6.feladat   
   public static boolean isConsecutiveFour(int[] values){
       int seged=values[0]; 
       int count=0;
       if (values.length < 4 ) return false;
       for(int i=0;i<values.length;i++){
           if(values[i]==seged){
              count++;}
                else { count=1;
                       seged=values[i];
              }
           if(count == 4) return true;
       }
   
   return false;
   }
    
    public static void main(String[] args) {

       int v[]={1,2,3,4,4,4,4,9};
        System.out.println(isConsecutiveFour(v));
        
    }
}