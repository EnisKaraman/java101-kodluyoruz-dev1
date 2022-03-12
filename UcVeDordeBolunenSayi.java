import java.util.Scanner;
public class UcVeDordeBolunenSayi {
    public static void main(String[]args) {
        Scanner klavye=new Scanner(System.in);
        
        int toplam=0;
        int sayac=0;
        
        System.out.print("Bir Sayı Giriniz:");
        int s=klavye.nextInt();
        
        for (int i = 1; i <= s; i++) {
            if (i%3==0) {
                toplam+=i;
                sayac++;
                
            } if(i%4==0) {
                toplam+=i;
                sayac++;
            }		
        }
        System.out.println("0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalaması:"+(toplam/sayac));
        
    }
    }
    

