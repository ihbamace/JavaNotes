/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package merhabajava;

/**
 *
 * @author Honour
 */
import java.util.Scanner;
public class MerhabaJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Merhaba Java");
        Scanner klavye = new Scanner(System.in);
        
        System.out.println("Ad giriniz:");
        String ad=klavye.next();
        System.out.println("Merhaba "+ad);
        
        
    }
    
}
