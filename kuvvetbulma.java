import java.util.*;
public class kuvvetbulma {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Katını Bulmak İçin Sayı Belirleyiniz:");
        int s=klavye.nextInt();
        for (int i = 1; i <= s; i*=4) {
            System.out.println("4 Katı:"+i);
        }
        System.out.println(" ");
        for (int j = 1; j <= s; j*=5) {
            System.out.println("5 Katı:"+j);
        }
    }
}
