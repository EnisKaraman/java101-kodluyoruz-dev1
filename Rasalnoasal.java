import java.util.*;
public class Rasalnoasal {
    static int j=1;
    static void asal(int x, int b){
        if (x==b) {
            System.out.println("Asaldır.");
            return;
        }
        else if (x%b==0){
            System.out.println("Asal Değildir.");
            return;
        }    
     asal(x, b+1);
    }
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int s=klavye.nextInt();
        asal(s,2);
    }
}
