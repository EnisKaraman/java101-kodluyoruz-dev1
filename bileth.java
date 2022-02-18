import java.util.Scanner;
public class bileth {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in); 
        int km, ytipi, yas;
        double tutar=0,indirim=0;

        System.out.print("Gitmek İstediğiniz Mesafeyi km Cinsinden Giriniz:");
        km=klavye.nextInt();

        System.out.print("Yaşınızı Giriniz:");
        yas=klavye.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        ytipi=klavye.nextInt();
        
        if (yas < 0 || km < 0 || (ytipi < 1 || ytipi > 2)) {
            System.out.println("Hatalı veri girdiniz...");

        } else {
            tutar = km / 10;
            
            if (yas < 12) {
                tutar = tutar * 0.50;            

            } else if (yas >= 12 && yas <= 24) {
                indirim = tutar * 0.10;
                tutar=tutar-indirim;

            } else if (yas > 65) {
                indirim = tutar * 0.30;
                tutar=tutar-indirim;
            }
            else {
                tutar=tutar;                
            }
            
        }
        if (ytipi == 2) {
            tutar+=tutar;
            indirim=tutar*0.20;
            System.out.println("Toplam tutar: " + (tutar-indirim) + " TL");
        }
        else if (ytipi == 1) {
            System.out.println("Toplam tutar: " + tutar + " TL");
        }
        else {
            System.out.println("Hatalı giriş yaptınız");
        }
    
    }
    }

