import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        int n,i,a=0,b=1,c=0;
        Scanner inp=new Scanner(System.in);
        System.out.println("Fibonacci Eleman Sayisini giriniz:");
        n= inp.nextInt();
        for (i=1;i<=n;i++) {
            c=a+b;
            b=a;
            a=c;
            System.out.print(c + ",");
        }
    }
}