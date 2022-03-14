import java.util.*;
public class sarttoplama {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int s=0;
       int toplam=0;
        do {
            System.out.print("Sayı Giriniz:");
            s=klavye.nextInt();
            if (s%2==0||s%4==0) {
               toplam+=s;
            }
        } while (s%2==0);
        System.out.println("Sayıların Toplamı:"+toplam);
    }
}
