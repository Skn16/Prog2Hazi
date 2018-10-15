
import java.util.Scanner;
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
public class Main {
//    
//    private static void kiir(Tura[] t){
//        for(int i=0;i<t.length;i++)
//            System.out.println(t[i]);
//    }
//    
//    
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String nev=sc.nextLine();
//        String[] s = nev.split(";");
//        int n = Integer.parseInt(s[0]);
//        Tura[] tura = new Tura[n];
//        int n1 = Integer.parseInt(s[1]);
//        int n2 = Integer.parseInt(s[2]);
//        int n3 = Integer.parseInt(s[3]);
//        int resztav;
//        new tura = new Tura(n1,n2,n3,nev,resztav);
//        
//        for(int i=0;i<n;i++) {
//            nev = sc.nextLine();
//            s = nev.split(";");
//            tura[i]= new Tura(new Date(year,mounth,day),nev,resztav);
//        }
//            
//           
//        }
//    }
    
//    4.feladat
//    
//    public static void rendez(Hullamvasutak[] h){
//            for(int i=0;i<h.length-1;i++){
//                for(int j=i+1;j<h.length;j++){
//                    if(h[i].getVarakozasi_ido()>h[j].getVarakozasi_ido()){
//                        Hullamvasutak tmp=h[i];
//                        h[i]=h[j];
//                        h[j]=tmp;
//                    }
//                    else if(h[i].getVarakozasi_ido()==h[j].getVarakozasi_ido()){
//                            if(h[i].getLegkisebb_magassag()<h[j].getLegkisebb_magassag()) {
//                            Hullamvasutak tmp = h[i];
//                            h[i] = h[j];
//                            h[j] = tmp;}
//                            else if(h[i].getLegkisebb_magassag()==h[j].getLegkisebb_magassag()){
//                                        if(h[i].getVilag_neve().compareTo(h[j].getVilag_neve())>0){
//                                                Hullamvasutak tmp = h[i];
//                                                h[i] = h[j];
//                                                h[j] = tmp;}
//                                    }
//                    }
//                    }
//                }
//            }
//    
//    
//    
//    
//    public static void kiir(Hullamvasutak[] h){
//        for(int i=0;i<h.length;i++){
//            System.out.println(h[i]);
//        }
//    }
//    
//    public static void main(String[] args) {
//        int n;
//        Scanner sc=new Scanner(System.in);
//        n = Integer.parseInt(sc.nextLine());
//        Hullamvasutak[] hlmvs = new Hullamvasutak[n];
//        String sor = sc.nextLine();
//            String st[] = sor.split(";");
//         for(int i=0;i<n;i++) {
//            int k1=Integer.parseInt(st[3]);;
//            int k2=Integer.parseInt(st[4]);;
//            hlmvs[i] = new Hullamvasutak(st[1],st[2],k1,k2);
//        }
//        
//        rendez(hlmvs);
//        kiir(hlmvs);    
//        
//    }
    
    
// 5.feladat   
//    
//    public static void nagyobbhomereseklet(Homerseklet[] h,String v){
//        for(int i=0;i<h.length;i++){
//            if(h[i].getVaros().compareTo(v)==0){
//                for(int j=0;j<h.length;j++){
//                    if(h[j].getHomerseklet()>h[i].getHomerseklet()){
//                        System.out.println(h[j].getVaros()+" ("+h[j].getHomerseklet()+")");
//                    }
//                }
//    }
//            else System.out.println("\nMissing Data");
//        }
//    }
//   
//    public static void kiir(Homerseklet[] h){
//        for(int i=0;i<h.length;i++){
//            System.out.println(h[i]);
//        }
//    }
//    
//    public static void main(String[] args) {
//        int n;
//        Scanner sc= new Scanner(System.in);
//        String sor=sc.nextLine();
//        String st[]=sor.split(";");
//        n=Integer.parseInt(sc.nextLine());
//        Homerseklet[] varosok=new Homerseklet[n];
//        String adottvaros=st[1];
//        
//        for(int i=0;i<n;i++){
//            sor=sc.nextLine();
//            st=sor.split(";");
//            int homerseklet=Integer.parseInt(st[1]);
//           varosok[i]=new Homerseklet(st[0],homerseklet);
//        }
//        
//        nagyobbhomereseklet(varosok,adottvaros);
//        kiir(varosok);
//    }
//}

    
//  6.feladat  
 
    public static void rendez(Vandorlas[] v){
        for(int i=0;i<v.length;i++){
           String pontok=v[i].getUtvonal();
           char p = 'p';
           char k = 'k';
           char s = 's';
           char z = 'z';
        }}
    
    
    
    public static void kiir(Vandorlas[] v){
        for(int i=0;i<v.length;i++){
            System.out.println(v[i]);
        }
    }
    
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        String sor=sc.nextLine();
        String s[]=sor.split(";");
        n=Integer.parseInt(s[0]);
        Vandorlas[] v=new Vandorlas[n];
        
        for(int i=0;i<n;i++){
            sor = sc.nextLine(); 
            s = sor.split(";");
            v[i]=new Vandorlas(s[1],s[2]);
        }
        
        rendez(v);
        kiir(v);
    }





}