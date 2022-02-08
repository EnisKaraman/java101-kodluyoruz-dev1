package kdvhesaplama;
import java.util.*;
public class kdv {
    public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);
       double kdv,kdvorani=0.18,kdvorani2=0.08;

       System.out.print("Ücreti Giriniz:");
       double ucret=klavye.nextDouble();

       double hesap=(ucret>0 && ucret<1000) ? (ucret*kdvorani)+ucret:(ucret*kdvorani2)+ucret;
       kdv=hesap-ucret;
       System.out.println("Kdv'siz fiyatı:"+ucret);
       System.out.println("1000 TL ve altı kdv oranı:"+kdvorani);
       System.out.println("1000 TL üstü kdv oranı:"+kdvorani2);
       System.out.println("Kdv tutarı:"+kdv);
       System.out.println("Kdv dahil fiyatı:"+hesap);
    }
    
}
