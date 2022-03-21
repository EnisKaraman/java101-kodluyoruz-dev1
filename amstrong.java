import java.util.Scanner;
public class amstrong {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz:");
        int s = klavye.nextInt();

        int sayac = 0;
        int ilkdeger = s;
        int b = s;
        int c = 0;
        int sonuc = 0;
        int d = 0;

        //Basamak Bulmak İçin.
        while(s != 0){
            s = s / 10;
            sayac++;
        }

        //Burda For İçinde For Kullanarak Birinde Son Değeri Alıp Diğerinde Üssüne Çarpma Uyguladım.
        for (int i = 1; i <= sayac; i++) {
            c = b % 10;
            d=c;
            System.out.println(d);
            for (int j = 1; j < sayac; j++) {

            c*=d; 

            }

            sonuc+=c;
            b/=10;
            
        }

        if(sonuc==ilkdeger){
        System.out.println("Sonuç:"+sonuc+"Giriş Yaptığınız Sayıya Eşit Olduğu İçin bir Armstrong Sayıdır.");
    }
    else{
      System.out.println("Girmiş Olduğunuz Sayı Armstrong Sayı Değildir."+"\nGirmiş Olduğunuz Sayı:"+ilkdeger+"\nSayınızın Sonucu:"+sonuc);
    }
}
}
