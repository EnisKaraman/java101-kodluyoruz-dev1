import java.util.*;
public class yildizdanelmas {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        int a=1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
            System.out.print(" ");            
            }
            for (int k = 1; k <= a; k++) {
                System.out.print("*");
            }
            System.out.println("");
            a+=2;
        }
            a=7;
        for (int i = 0; i < 4; i++) {
            for (int j = 4; j < 5+i; j++) {
                System.out.print(" "); 
            }
            for (int k = 0; k < a; k++) {
                System.out.print("*");
            }
            System.out.println("");
            a-=2;
        }
    }
}
