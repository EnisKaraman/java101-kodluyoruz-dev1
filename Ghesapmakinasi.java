import java.util.*;
public class Ghesapmakinasi {
    
    static int top(int x, int y){ 
       int top=x+y;       
       return top;
    }
    
    static int cik(int x, int y){
        int cik=x-y;
        return cik;
    }
    
    static int carp(int x, int y){
        int carp=x*y;
        return carp;
    }
    
    static int bol(int x, int y){
        int bol=x/y;
        return bol;
    }
    
    static int us(int x, int y){
        int us=1;
        for (int i = 0; i < y; i++) {
            us*=x;
        }
        return us;
    }
    
    static int fac(int x){
        int fac=1;
        for (int i = 1; i <= x; i++) {
         fac*=i;
        }
        return fac;
    }
    
    static int mod(int x, int y){
        int mod=x%y;
        return mod;
    }
    
    static void dik(int x, int y){
        System.out.println("Çevresi:"+2*(x+y));
        System.out.println("Alanı:"+x*y);
    }
    
    public static void main(String[] args) { 
        
        int sonuc=0,f=0,s1=0,s2=0,secim=1;
        
        Scanner klavye=new Scanner(System.in);
        String menu = "1- Toplama İşlemi\n"
                + "2- Çıkarma İşlemi\n"
                + "3- Çarpma İşlemi\n"
                + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n"
                + "6- Faktoriyel Hesaplama\n"
                + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                + "0- Çıkış Yap";
        
            
            
        while(secim != 0){
            System.out.println(menu);        
            System.out.print("Yapmak İstediğiniz İşlemi Seçiniz:");
            secim=klavye.nextInt();
            if (secim==0) {
                break;
            }
            
            if (secim==6) {
                System.out.print("Faktöriyelini Bulmak İstediğiniz Sayı:");
                f=klavye.nextInt();
            }
            else{
            System.out.print("1. Sayınız:");
            s1=klavye.nextInt();
            
            System.out.print("2. Sayınız:");
            s2=klavye.nextInt();
            }
            
        switch(secim){
         case 1:
            System.out.println("Sonuç:"+top(s1,s2)); 
            break;
         case 2:
            System.out.println("Sonuç:"+cik(s1,s2));
            break;
         case 3:
            System.out.println("Sonuç:"+carp(s1,s2));
            break;
         case 4:
            System.out.println("Sonuç:"+bol(s1,s2)); 
            break;
         case 5:
            System.out.println("Sonuç:"+us(s1,s2)); 
            break;
         case 6:
            System.out.println("Sonuç:"+fac(f));
            break;
         case 7:
             System.out.println("Sonuç:"+mod(s1,s2));
             break;
         case 8:
             dik(s1,s2);
             break;
    }
        }
        
    }
        
}
