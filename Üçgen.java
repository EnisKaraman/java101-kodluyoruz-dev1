import java.util.*;
public class Üçgen {
    public static void main(String[] args) {
     int a,b,c;
     
        Scanner klavye=new Scanner(System.in);

        System.out.print("1. Kenarı Giriniz:");
        a=klavye.nextInt();

        System.out.print("2. Kenarı Giriniz:");
        b=klavye.nextInt();

        System.out.print("3. Kenarı Giriniz:");
        c=klavye.nextInt();

        double u=(a+b+c)/2;
        double alan=u * (u - a)* (u - b) * (u - c);
        System.out.println("Üçgenin Alanı:"+alan);

    }
    
}
