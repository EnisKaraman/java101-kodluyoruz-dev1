import java.util.Scanner;

public class cinzodyagi {

public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    
     System.out.print("Doğum Yılınızı Giriniz:");
     int dgm=klavye.nextInt();
     
     if (dgm%12==0) {
         System.out.println("Çin Zodyağı Burcunuz: Maymun");
     }
     else if (dgm%12==1) {
         System.out.println("Çin Zodyağı Burcunuz: Horoz");
     }
     else if (dgm%12==2) {
         System.out.println("Çin Zodyağı Burcunuz: Köpek");
     }
     else if (dgm%12==3) {
         System.out.println("Çin Zodyağı Burcunuz: Domuz");
     }
     else if (dgm%12==4) {
         System.out.println("Çin Zodyağı Burcunuz: Fare");
     }
     else if (dgm%12==5) {
         System.out.println("Çin Zodyağı Burcunuz: Öküz");
     }
    else if (dgm%12==6) {
         System.out.println("Çin Zodyağı Burcunuz: Kaplan");
     }
     else if (dgm%12==7) {
         System.out.println("Çin Zodyağı Burcunuz: Tavşan");
     }
     else if (dgm%12==8) {
         System.out.println("Çin Zodyağı Burcunuz: Ejderha");
     }
     else if (dgm%12==9) {
         System.out.println("Çin Zodyağı Burcunuz: Yılan");
     }
     else if (dgm%12==10) {
         System.out.println("Çin Zodyağı Burcunuz: At");
     }
     else if (dgm%12==11) {
         System.out.println("Çin Zodyağı Burcunuz: Koyun");
     }
     else{
         System.out.println("Hatalı Giriş Yaptınız.");
     }
 }
 
}
