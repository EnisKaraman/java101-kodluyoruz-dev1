/**
 * sayı_sıralama
 */
import java.util.Scanner;
public class sayı_sıralama {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);

        System.out.println("1. Sayıyı Giriniz:");
        int a=klavye.nextInt();

        System.out.println("2. Sayıyı Giriniz:");
        int b=klavye.nextInt();

        System.out.println("3. Sayıyı Giriniz:");
        int c=klavye.nextInt();

        if((a > b) && (a > c)){
        if(b > c){
            System.out.println("c < b < a");
        }
        else{
           System.out.println("b < c < a");}
        }
      


        if((b > a) && (b > c)){
            if(a > c){
                System.out.println("c < a < b");
            }
            else{
                System.out.println("a < c < b");
            }
            }
           


        if((c > a) && (c > b)){
        if(a > b){
        System.out.println("b < a < c");
        }
        else{
        System.out.println("a < b < c");
        }
        }
                    
    }
}