import java.util.*;
public class ushesaplama {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı:");
        int us=klavye.nextInt();

        System.out.print("Üs Alacak Sayı:");
        int s=klavye.nextInt();

        int total=1;

        for (int i = 1; i <= s; i++) {
            total *= us;
        }
        System.out.println("\nİşlemin Sonucu:"+total);



    }
}
