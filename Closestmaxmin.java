package Listeler;
import java.util.Scanner;
public class Closestmaxmin {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        
        int [] liste={15, 12, 788, 1, -1, -778, 2, 0, 70, 80};
         int enymax=999999999;
         int enymin=-999999999;
         
        System.out.print("Lütfen İstediğiniz Bir Sayıyı Giriniz:");
         int s=klavye.nextInt();        
        
        for (int i : liste ) {
            
            if (s < i && enymax > i) {
              enymax=i;  
            }
            
            if (s > i && enymin < i) {
              enymin=i;              
            }
        }
        if (enymax==999999999) {
            System.out.println("Listede Girdiğiniz Sayıdan Daha Büyük Bir Sayı Yoktur");
        }
        else{
            System.out.println("girilen sayıya en yakın büyük sayı: "+enymax);
        }
        
        if (enymin==-999999999) {
          System.out.println("Listede Girdiğiniz Sayıdan Daha Küçük Bir Sayı Yoktur");  
        }
        else{
        System.out.println("girilen sayıya en yakın küçük sayı: "+enymin);
        }
    }
}
