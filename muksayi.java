import java.util.*;
public class muksayi {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int toplam=0;
        
        System.out.println("Bir Sayı Giriniz:");
        int s=klavye.nextInt();
        
        for (int i = 1; i < s; i++) {
            if (s%i==0) {
                System.out.println(i);
                toplam+=i;                
        }}
        
        if (toplam==s) {
                    System.out.println(s+" Sayınız Mükemmel Sayıdır.");
                }
                else{
                    System.out.println(s+" Sayınız Mükemmel Bir Sayı Değildir.");
                }
    }
}
