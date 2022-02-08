import java.util.Scanner;
public class boykileindeks {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);

        System.out.println("Boyunuzu Giriniz(metre cinsinden):");
        float boy=klavye.nextFloat();

        System.out.println("Kilonuzu Giriniz:");
        double kilo=klavye.nextDouble();

        double indeks=kilo/boy*boy;
        System.out.println("Vücut İndeksiniz:"+indeks);
    }
}
