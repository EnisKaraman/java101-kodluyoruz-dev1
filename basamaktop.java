import java.util.Scanner;
public class basamaktop {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz:");
        int s = klavye.nextInt();
        int sayac = 0;
       int b = s;
       int c = 0;
       int total = 0;
        while(s != 0){
            s = s / 10;
            sayac++;
        }

        for (int i = 1; i <= sayac; i++) {
           c = b % 10;
           b /= 10; 
           total += c;
        }
        System.out.println("Sonuç:"+total);
       
    }
}
