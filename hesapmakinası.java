import java.util.Scanner;
public class hesapmakinası {
   public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
        
    System.out.print("İlk Sayınız:");
    int s1=klavye.nextInt();
    
    System.out.print("İkinci Sayınız:");
    int s2=klavye.nextInt();
    
    System.out.println("1. Toplama\n2. Çıkarma\n3. Çarpma\n4. Bölme");
    System.out.print("İşleminizi Seçiniz:");
    int islem=klavye.nextInt();
    
    switch (islem){     
        case 1:
            System.out.println("Sayıların Toplama İşlemi"+(s1+s2));
            break;
        case 2:
            System.out.println("Sayıların Çıkarma İşlemi:"+(s1-s2));
            break;
        case 3:
            System.out.println("Sayıların Çarpma İşlemi:"+(s1*s2));
            break;
        case 4:
            System.out.println("Sayıların Bölme İşlemi:"+(s1/s2));
            break;
    }
  }

} 

