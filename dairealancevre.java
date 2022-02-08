import java.util.Scanner;
public class dairealancevre {

    public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);

        double r,alan,cevre,pi=3.14;

        System.out.print("Dairenin Yarı Çapını Giriniz:");
        r=klavye.nextDouble();

        alan=pi*r*r;
        cevre=2*pi*r;

        System.out.println("Dairenin Alanı:"+alan);
        System.out.println("Dairenin Çevresi:"+cevre);

        System.out.println("Dairenin Merkez Açısını Giriniz:");
        double a=klavye.nextDouble();
        double daire_dilim_alani=(pi*(r*r)*a)/360;
        System.out.println("Dairenin Dilim Alını:"+daire_dilim_alani+"cm\u00B2");



        





    }
}