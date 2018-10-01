/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Home
 */
public class Metodusok {
//II.resz
//   1.feladat    
//public static void novekvo(int a,int b,int c){
//    int seged= 0; 
//        if (b<a){
//            seged=b;
//            b=a;
//            a=seged;
//        }
//        if (c<a){
//            seged=c;
//            c=a;
//            a=seged;
//        }
//        if (c<b){
//            seged=c;
//            c=b;
//            b=seged;
//        }
//        System.out.println(a+" "+b+" "+c);
//       
//}
// 
//    public static void main(String[] args) {
//        novekvo(59,1,3);
//    }
//        

//2.feladat
//public static void minmax (double a, double b, double c){
//        double seged = 0;
//        if (a<0){
//            a=a*(-1);
//        }
//        if (b<0){
//            b=b*(-1);
//        }
//        if (c<0){
//            c=c*(-1);
//        }
//        
//        if (b<a){
//            seged=b;
//            b=a;
//            a=seged;
//        }
//        if (c<a){
//            seged=c;
//            c=a;
//            a=seged;
//            
//        }
//        if (c<b){
//            seged=c;
//            c=b;
//            b=seged;
//        }
//         System.out.println(a+" "+c);
//     }
//
//public static void main(String[] args) {
//    minmax(3,9,-55);
//}

//3.feladat
//public static void harmas(double a,double b,double c,double d){
//        if(d>=0){
//            System.out.println(a+","+c+","+b+","+d);
//        }
//        else {
//            System.out.println(a+","+b+","+d+","+c);
//        }}
//
//public static void main(String[] args) {
//    harmas(1.4,5.4,6.33,9.0);
//}

//4.feladat

//public static boolean haromszog(double a,double b,double c){
//        if(a+b>c && b+c>a && c+a>b)
//            return true;
//        else return false;
//    }
//
//public static void main(String[] args) {
//    System.out.println(haromszog(1.3,5.7,2.9));
//}

//5.feladat
// public static void szokoev(int a,int b){
//        int db=0;
//        for(int i=a;i<=b;i++){
//            if(i%4==0 && i%100!=0 || i%400==0){
//                db++;
//            }
//        }
//        System.out.println(db);
// }
//
// public static void main(String[] args) {
//     szokoev(1995,2018);
//}
//
//
////6.feladat
// public static void osztalyzat(int a){
//        switch(a){
//            case 1: System.out.println("elegtelen");break;
//            case 2: System.out.println("elegseges");break;
//            case 3: System.out.println("kozepes");break;
//            case 4: System.out.println("jo");break;
//            case 5: System.out.println("kituno");break;
//            default: System.out.println("nincs ilyen osztalyzat");
//        }}
//
//public static void main(String[] args) {
//    osztalyzat(5);
//}

//7.feladat
//
//public static void main(String[] args) {
////    ?
////}
//
//
//8.feladat
//     public static void Prim(int a){
//        int i;
//        int db=0;
//        for(i=1;i<=a;i++){
//           if(a%i==0){
//               db++;
//           } 
//        }
//        if(db==2){
//            System.out.println("primszám");
//        }
//        else{
//            System.out.println("nem prim");
//        }
//    }
//public static void main(String[] args) {
//    Prim(17);
//}


////9.feladat


//public static void main(String[] args) {
//    ?
//}


////10.feladat
//public static void megfordito(int n){
//       int uj=0;
//       int maradek;
//       while (n!=0){
//           maradek=n%10;
//           uj=uj*10+maradek;
//           n=n/10;
//       }
//       System.out.println(uj);
//    }
//public static void main(String[] args) {
//    megfordito(1345);
//}


////11.feladat
//public static void faktor(int a){
//           int i=1;
//           int faktor=1;
//           while (i!=a+1){
//               faktor=i*faktor;
//               i++;
//           }
//           System.out.println(faktor);}
//           
//public static void main(String[] args) {
//    faktor(4);
//}

////12.feladat
public static void oszthatokval(int a,int b,int k ){
           int i=a;
           while(i!=b){
               if(i%k==0){
                   System.out.println(i);
               }
               i++;
           }}

public static void main(String[] args) {
    oszthatokval(3,27,3);
}

////13.feladat
//
//public static void main(String[] args) {
//    ?
//}

//14.feldat
//public static void main(String[] args) {
//    ?
//}

}