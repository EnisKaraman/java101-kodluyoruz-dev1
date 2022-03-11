import java.util.Scanner;
public class artıkyıl {
    
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        
         System.out.print("Yılı Giriniz:");
         int yil=klavye.nextInt();
          if (yil%4==0||yil%400==0) {
              System.out.println(yil+" Bir Artık Yıldır!");   
         }
          else {
              System.out.println(yil+" Bir Artık Yıl Değildir!");
          }
         
     }
    }
