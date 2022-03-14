import java.util.*;
public class kombinasyon {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("N Değeri Giriniz:");
        int n=klavye.nextInt();
        
        System.out.println("R Değeri Giriniz:");
        int r=klavye.nextInt();
        
        int nfac=1;
        for (int i = 1; i <= n; i++) {
           nfac*=i;
           
        }
        
        int rfac=1;
        for (int i = 1; i <= r; i++) {
            rfac*=i;
        }
        
        int xfac=1;
        for (int i = 1; i <= (n-r); i++) {
            xfac*=i;
        }
        System.out.println("Kombinasyon:"+nfac/(rfac*xfac));
    }
}
