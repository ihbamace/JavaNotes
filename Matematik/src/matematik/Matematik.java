
package matematik;

import java.util.Scanner;


public class Matematik {
//metodlar buraya yazılır
    
    //parametre almayan ve değer döndürmeyen
    public void MerhabaDe(){
    
        System.out.println("Merhaba Programa Hoşgeldiniz");
        System.out.println("Burası Metodla yazıldı...");
        System.out.println("Yazılan Metod kod kalabalığını engeller.");
    
    }
    
    //parametre alan ve değer döndürmeyen
    public void YasHesapla(int dogumyili)
    {
    int yas;
    yas=2019-dogumyili;
        System.out.println("Yaşınız:"+yas);
    
    
    }
    
    //dışarıdan parametre alan ve değer döndüren
    public double DaireAlan(int yaricap)
    {
    double alan;
    //int sayi;
    alan=3.14*yaricap*yaricap;
    
    return alan;
    
    }
    
  
    public static void main(String[] args) {
        
        Scanner klavye=new Scanner(System.in);
        
        Matematik nesne=new Matematik();
        nesne.MerhabaDe();
        
        System.out.println("Doğum yılınızı giriniz:");
        int dyili=klavye.nextInt();
        nesne.YasHesapla(dyili);
        
        //nesne.YasHesapla(1995);
        //nesne.YasHesapla(2001);
        double d_alan;
        d_alan=nesne.DaireAlan(4);
        System.out.println("Metodla hesaplanan daire alanı:"+d_alan);
        
        int r;
        System.out.println("Yarıçapı elle giriniz:");
        r=klavye.nextInt();
        d_alan=nesne.DaireAlan(r);
        System.out.println(r+" yarıçaplı daire alanı:"+d_alan);
    }
}
