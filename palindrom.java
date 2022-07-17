import java.util.*;
public class palindrom {
    static boolean ispalindrom(int number){
     int temp=number, reversenumber=0, lastnumber;
     while(temp != 0){
       lastnumber=temp%10;
       reversenumber=(reversenumber*10)+ lastnumber;
       temp/=10;
     } 
        if (number == reversenumber) {
            System.out.println(number+" Sayınız Bir Paindrom Sayıdır:"+reversenumber);
        }
        else{
            System.out.println(number+" Sayınız Bir Paindrom Sayı Değildir:"+reversenumber);
        }
     return true;
}
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.print("Sayınızın Palindrom Olup Olmadığını Anlamak İçin\nBir Sayı Giriniz: ");
        int number=klavye.nextInt();
        ispalindrom(number);
    }
}
