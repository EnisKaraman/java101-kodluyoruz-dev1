import javax.sound.sampled.SourceDataLine;
import java.util.*;
public class Notort {
public static void main(String[] args) {
Scanner klavye=new Scanner(System.in);

    System.out.println("Matematik Notunuzu Giriniz:");
    int mat=klavye.nextInt();

    System.out.println("Fizik Notunuzu Giriniz:");
    int fizik=klavye.nextInt();

    System.out.println("Kimya Notunuzu Giriniz:");
    int kimya=klavye.nextInt();

    System.out.println("Türkçe Notunuzu Giriniz:");
    int turkce=klavye.nextInt();

    System.out.println("Tarih Notunuzu Giriniz:");
    int tarih=klavye.nextInt();

    System.out.println("Müzik Notunuzu Giriniz:");
    int muzik=klavye.nextInt();
    
    double ort=(mat+fizik+kimya+turkce+tarih+muzik)/6;
    
    String olay=(60<=ort) ? "Sınıfı Geçtiniz":"Sınıfta Kaldınız";

    System.out.println("Ders Ortalamanız:"+ort);
    System.out.println(olay);
}
}