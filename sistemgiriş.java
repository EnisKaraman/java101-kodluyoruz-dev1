import java.util.*;
public class sistemgiriş {
   public static void main(String[] args) {
    String username,password,select;

    Scanner klavye = new Scanner(System.in);

    System.out.print("Kullanıcı Adınız : ");
    username = klavye.nextLine();

    System.out.print("Şifreniz : ");
    password = klavye.nextLine();
    String npassword;
    if (username.equals("patika")&&password.equals("java")) {
        System.out.println("Giriş Yaptınız");}

         else {
            System.out.println("Bilgileriniz Yanlış ! \nŞifrenizi sıfırlamak ister misiniz?\n1.evet\n2.hayır  ");
            select = klavye.nextLine();

            if (select.equals("1")) {
                System.err.println("(Yanlış Girdiğiniz Şifre ve Eski Şifreniz ile Aynı Olmamalıdır)");
                System.out.print("Yeni şifrenizi giriniz : ");
                npassword = klavye.nextLine();
                
                if (npassword.equals("java")||npassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz : ");

                } else {
                    System.out.println("Şifre oluşturuldu.");
                    password=npassword;
                    System.out.print("Kullanıcı Adınız : ");
                    username = klavye.nextLine();

                    System.out.print("Şifreniz : ");
                    password = klavye.nextLine();
    
    if (username.equals("patika")&&password.equals(npassword)) {
        System.out.println("Giriş Yaptınız");}else{System.out.println("Hatalı Giriş Tekrar Giriş Sağlayın.");}
        }
            } else {
                System.out.println("Tekrar giriş yapınız : ");
            }


        }
    } 
    
}

   

