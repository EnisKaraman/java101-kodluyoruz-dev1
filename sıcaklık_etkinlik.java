/**
 * sıcaklık_etkinlik
 */
import java.util.Scanner;
public class sıcaklık_etkinlik {

    public static void main(String[] args) {        
        Scanner klavye = new Scanner(System.in);

        System.out.println("Hava Sıcaklığını Giriniz: ");
        int derece = klavye.nextInt();

        if (derece < 5)
        {
            System.out.println("Kayak Yapabilirsiiniz");
        }
        else if (derece >= 5){
            if (derece<15) {
                System.out.println("Sinemaya Gidebilirsiniz");
            }
            else if (derece>=15 && derece <=25)
            {
                System.out.println("Pikniğe Gidebilirsiniz");
            }
            else{
                System.out.println("Yüzmeye Gidebilirsiniz");
            }
        }

    }

    
}