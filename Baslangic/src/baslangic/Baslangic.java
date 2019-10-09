
package baslangic;

import java.util.Scanner;

public class Baslangic {

   
    public static void main(String[] args) {
        // TODO code application logic he //açıklama satırı 
        //kodlar buraya yazılır
        int a;
        int x=0;
        int y,z,t;
        
        String ad;
        String soyad="Yılmaz";
        
        float pi=3.14f;
        double sayi=345.564;
        
        System.out.println("Merhaba Java");
        System.out.println("Burası hızlı yazıldı");
        y=78;
        System.out.println("y değeri:"+y);
        
        Scanner klavye = new Scanner(System.in);
       
        System.out.println("İsim giriniz:");
        ad=klavye.next();
        System.out.println("Merhaba "+ad);
        
        Baslangic nesne=new Baslangic();
        nesne.getClass();
        
    }
    
}
