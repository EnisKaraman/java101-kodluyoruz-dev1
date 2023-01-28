package com.mycompany.mavenproject1;
import java.util.*;
public class SayıTahmin {
    public static void main(String[] args) {
        
    
    Scanner klavye=new Scanner(System.in);
    Random rand=new Random();
    int ras=rand.nextInt(100);
    int hak=5;
    int[] wrong=new int[5];
    int i=0;
    boolean isWin= false;
    
    while (hak > 0){
            System.out.println("\n"+hak+" Hakkınız Bulunmaktadır.");
            System.out.print("Lütfen Sayınızı Giriniz:");
            int tah=klavye.nextInt();
            if (tah < 0 || tah > 100) {
                System.out.println("Lütfen 0-100 Arasında Bir Değer Giriniz.");
                continue;
        }
            if (ras==tah) {
                System.out.println("Doğru Tahmin Ettiniz Tebrikler. Doğru Sonuç:"+ras);
                isWin=true;
                break;
            }
            else{
                System.out.println("\nTahmininiz Doğru Değildir.");
            }            
            if (tah>ras) {
                System.out.println("Girdiğiniz Sayı Tahmin Edilen Sayıdan Büyüktür.");
        }
            else{
                System.out.println("Girdiğiniz Sayı Tahmin Edilen Sayıdan Küçüktür.");
            }
        wrong[i++]=tah;
        hak--;
    
}
        if (!isWin) {
            System.out.println("\nKaybettiniz. Doğru Sonuç:"+ras+" idi.");
            System.out.println("Hatalı Girdiğiniz Sayılar: "+Arrays.toString(wrong));
        }
    }
    
}
