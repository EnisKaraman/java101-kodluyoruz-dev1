/**
 * sınıfgeçme
 */
import java.util.Scanner;
public class sınıfgeçme {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int ort=0;
        
        System.out.print("Matematik Notunuz:");
        int mat=klavye.nextInt();
        if (mat>0&&mat<=100) {
            ort=mat;
        }
        
        //ort=(mat<=100&&mat>0) ? ort+=mat:ort;
        
        System.out.print("Fizik Notunuz:");
        int fzk=klavye.nextInt();
        if (fzk>0&&fzk<=100) {
            ort+=fzk;
        }
        System.out.print("Türkçe Notunuz:");
        int trc=klavye.nextInt();
        if (trc>0&&trc<=100) {
            ort+=trc;
        }
        
        System.out.print("Kimya Notunuz:");
        int kim=klavye.nextInt();
        if (kim>0&&kim<=100) {
            ort+=kim;
        }
        
        System.out.print("Müzik Notunuz:");
        int muzik=klavye.nextInt();
        if (muzik>0&&muzik<=100) {
            ort+=muzik;
        }
        ort=ort/5;
        
        if (ort>=55) {
            System.out.println("Sınıfı Geçtiniz Tebrikler.");
            System.out.println("Ortalamanız:"+ort);
        }
        else {
            System.out.println("Sınıfta Kaldınız.");
            System.out.println("Ortalamanız:"+ort);
        }
        
    }
    
     


}
