import java.util.*;

public class küçük_büyük_sayıbulma {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        
        int kucuk=0;
        int buyuk=0;
        
        System.out.println("Kaç Adet Sayı Gireceksiniz:");
        int adet=klavye.nextInt();
        
        for (int i = 1; i <= adet; i++) {
            System.out.println(i+".Sayınız:");
            int sayi=klavye.nextInt();
            
            if (sayi>=0) {
                if (buyuk==0) {
                    kucuk=sayi;
                    buyuk=sayi;
                }
                if(kucuk>sayi){
                    kucuk=sayi;
                }
                if(buyuk<sayi){
                    buyuk=sayi;
                }
            }  
        }
        System.out.println("Girdiğiniz Sayılardan;");
        System.out.println("En Küçüğü:"+kucuk);
        System.out.println("En Büyüğü:"+buyuk);
    }
}
