import java.util.*;
public class atm {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        String kad,sifre;
        int balance=1500,right=3,select,miktar;
        while(right>0){
        System.out.print("Kullanıcı Adınız:");
        kad=klavye.next();
        System.out.print("Şİfreniz:");
        sifre=klavye.next();
        
        if (kad.equals("enis") && sifre.equals("1234")) {
            System.out.println("Giriş Başarılı Hoşgeldiniz.");
            do {
                System.out.println("İşlemler\n1.Para Yatırma\n2.Para Çekme\n3.Bakiye Sorgula\n4.Çıkış Yap");
                System.out.print("İşleminiz:");
                
                select=klavye.nextInt();
                
                switch (select){
                case 1:
                System.out.println("Para miktarı:");
                miktar=klavye.nextInt();
                balance+=miktar;
                break;
                case 2:
                    System.out.println("Para miktarı:");
                    miktar=klavye.nextInt();
                    if (balance<miktar) {
                        System.out.println("Hesabınızda Yeterli Bakiye Bulunmamaktadır.");
                    }
                    else{
                        balance-=miktar;
                        System.out.println("İşleminiz Gerçekleşti.\nMevcut Kalan Bakiyeeniz:"+balance);
                        break;}
                case 3:
                    System.out.println("Mevcut Bakiyeniz:"+balance);
                    break;
            }
            } while (select!=4);
            System.out.println("Görüşmek Üzere.");
            break;
            
        }
        else{
        right--;
            System.out.println("Başarısız Giriş.\n"
                    +"Kalan Giriş Hakkınız:"+right);
                    }
        if (right==0) {
            System.out.println("Hesabınız Bloke Olmuştur.");
        }
    }
}
}