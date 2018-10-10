/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Patrik
 */
    public class Test {
        
////3.feladat
//public static Kocsma[] adottItaltKinaloKocsmak(String ital,VendeglatoipariEgyseg[] kocs){
//        int count=0;
//            for(int i=0;i<kocs.length;i++){
//                if(kocs[i] instanceof Kocsma){
//                    Kocsma k=(Kocsma) kocs[i];
//                    
//                    for(int j=0;j<k.getSorlap().length;j++){
//                        if(k.getSorlap()[j].equals(ital)){
//                           count++;
//                        }
//                    }
//                }
//            }
//        Kocsma[] Kocsma=new Kocsma[count];
//        
//        int k=0;
//            for(int i=0;i<kocs.length;i++){
//                if(kocs[i] instanceof Kocsma){
//                    Kocsma p=(Kocsma) kocs[i];
//                    
//                    for(int j=0;j<p.getSorlap().length;j++){
//                        if(p.getSorlap()[j].equals(ital)){
//                           Kocsma[k]=p;
//                           k++;
//                        }
//                    }
//                }
//            }
//        return Kocsma;
//    }
//    
//    public static void main(String[] args) {
//        VendeglatoipariEgyseg[] kocs=new VendeglatoipariEgyseg[]{
//            new Etterem("McDonalds",1,false,new String[]{"Big Mac","McNuggets","Chesseburger"}),
//            new Etterem("Burger King",1,false,new String[]{"Big King","Cheeseburger","Chicken burger"}),
//            new Etterem("KFC",1,false,new String[]{"Strips","Csirkecomb","KFC kosar"}), 
//            new Etterem("Fast Food",1,false,new String[]{"Hot Dog","Cheeseburger","Gyros"}),
//            new Etterem("Chinese",1,false,new String[]{"Rice","Chicken","Hot Dog"}),
//            new Kocsma("Sorozo",1,true,new String[]{"Heineken","Kobanyai","Korona"}),
//            new Kocsma("Borozo",1,true,new String[]{"Vorosbor","Heineken","Feherbor"}),
//            new Kocsma("Palinkazo",1,true,new String[]{"Szilva palinka","Kobanyai","Barack palinka"}),
//            new Kocsma("Whiskeyzo",1,true,new String[]{"Whiskey","Heineken","Kobanyai"}),
//            new Kocsma("Ginezo",1,true,new String[]{"Gin","Whiskey","Jagermeister"}) 
//        };
//        
//        Kocsma[] ko=adottItaltKinaloKocsmak("Heineken",kocs);
//        
//            for(Kocsma k:ko)
//        System.out.println(k);
//        
//    }

//5.feladat
//import java.util.Random;
//    public class Test {
//        public static void main(String[] args) {
//    Random rnd = new Random();
//     int[] t = new int[30];
//        for (int i = 0; i < t.length; i++) {
//                t[i] = rnd.nextInt(10);
//                    }
//            printArray(t);
//        long timeStart = System.currentTimeMillis();
//           insertionSort(t);
//        long timeEnd = System.currentTimeMillis();
//            printArray(t);
//    System.out.println(timeEnd - timeStart);
//}
//        static void printArray(int[] a) {
//            for (int i = 0; i < a.length; i++) {
//            System.out.print(a[i] + " ");
//            }
//        System.out.println();
//}
//static void insertionSort(int[] a) {
//	for(int i=0;i<=a.length-1;i++){
//	    for(int j=i+1;j<a.length;j++)
//                if(a[i]>a[j]){
//                   int tmp=a[i];
//                    a[i]=a[j];
//                    a[j]=tmp;}
//	}
//}
//4.feladat
  
    private static void rendezMaxSzallithatoteher(Teherauto[] teher){
        for(int i=0;i<teher.length-1;i++){
            for(int j=i+1;j<teher.length;j++){
                if(teher[i].getMaxSzallithatoTeher()<teher[j].getMaxSzallithatoTeher()){
                    Teherauto tmp=teher[i];
                    teher[i]=teher[j];
                    teher[j]=tmp;
                }
            }
        }      
  
}
    
    public static Auto keresMaxMotorTeljesitmeny(Auto[] auto) {
        
        int max = 0;
        int j = 0;
        int index = 0;
        
        for(int i=0;i<auto.length;i++) {
            if(auto[i] instanceof Auto) {
                Auto[] auto1 = new Auto[j];
            }
        }
        for(int k=0;k<auto.length;k++) {
            if(auto[k].getMotorteljesitmeny()>max)
                max=auto[k].getMotorteljesitmeny();
        }
        for(int l=0;l<auto.length;l++) {
            if(auto[l].getMotorteljesitmeny() == max)
                index = l;
        }
        return auto[index];
    }
    
    private static void kiir(Auto[] auto){
        for(int i=0;i<auto.length;i++)
            System.out.println(auto[i]);
    }
    
        public static void main(String[] args) {
            Auto[] a1 = new Auto[]{
                new Auto("PVM 190",90),
                new Auto("ASD 103",104),
                new Auto("XLS 641",140),
                new Auto("AHK 177",123),
                new Auto("FSD 123",89),
                new Teherauto("GHD 441",400,4210),
                new Teherauto("GHD 453",431,4330),
                new Teherauto("GUF 443",401,3033),
                new Teherauto("FAA 123",351,4000),
                new Teherauto("TRS 145",430,4400)
        };
            
            Teherauto[] t1= new Teherauto[] {
                new Teherauto("GHD 441",400,4210),
                new Teherauto("GHD 453",431,4330),
                new Teherauto("GUF 443",401,3033),
                new Teherauto("FAA 123",351,4000),
                new Teherauto("TRS 145",430,4400),
                new Teherauto("KJL 441",454,4210),
                new Teherauto("GOP 453",466,4330),
                new Teherauto("EVS 443",412,3333),
                new Teherauto("MNB 123",367,4100),
                new Teherauto("MNB 145",410,4430)
            };
            
            
            rendezMaxSzallithatoteher(t1);
            kiir(t1);
            
            System.out.println("\n"+keresMaxMotorTeljesitmeny(a1));
           
        }
    
    
    
    
    
    
}