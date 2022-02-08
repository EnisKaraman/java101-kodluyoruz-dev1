import java.util.*;
public class yolucreti {
public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);

    double tutar=10;
    double km=2.20;
    
    System.out.print("Kaç Kilometre Yol Gideceksiniz:");
    int yol=klavye.nextInt();

    tutar+=km*yol;
    tutar=(tutar>20) ? tutar:20;

    System.out.println("Yol Ücretiniz:"+tutar);
}
}