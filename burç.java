import java.util.Scanner;
/*Bu yazdığım kodu ayın ismi yerine, hangi ay olduğunu sorabilirdik. Mayıs ise 5'i tuşlatmak gibi  */
public class burç {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);

        //System.out.println("1.Ocak 2.Şubat 3.Mart 4.Nisan 5.Mayıs 6.Haziran\n7.Temmuz 8.Ağustos 9.Eylül 10.Ekim 11.Kasım 12.Aralık");
        //System.out.println("Hangi Ay'da Doğdunuzu Tuşlayınız:");
        //String ay=klavye.nextLine();

        System.out.println("Lütfen Ayınızı Yazarken Türkçe Karakter Kullanmayınız.(ş,ç,ı,ü,ö,ğ)(mayis)");
        System.out.print("Doğduğunuz Ay:");
        String ay=klavye.nextLine();

        System.out.print("Doğduğunuz Gün:");
        int gun=klavye.nextInt();
        
        /*if(ay.equals("1")){
            if(gun<=21){
                System.out.println("Burcunuz Oğlak.");
            }
            else{
                System.out.println("Burcunuz Kova.");
            }
         }*/

        if(ay.equals("ocak")){
           if(gun<=21){
               System.out.println("Burcunuz Oğlak.");
           }
           else{
               System.out.println("Burcunuz Kova.");
           }
        }

        if(ay.equals("subat")){
            if(gun<=19){
                System.out.println("Burcunuz Kova.");
            }
            else{
                System.out.println("Burcunuz Balık.");
            }
         }

         if(ay.equals("mart")){
            if(gun<=20){
                System.out.println("Burcunuz Balık.");
            }
            else{
                System.out.println("Burcunuz Koç.");
            }
         }

         if(ay.equals("nisan")){
            if(gun<=20){
                System.out.println("Burcunuz Koç.");
            }
            else{
                System.out.println("Burcunuz Boğa.");
            }
         }

         if(ay.equals("mayis")){
            if(gun<=21){
                System.out.println("Burcunuz Boğa.");
            }
            else{
                System.out.println("Burcunuz İkizler.");
            }
         }

         if(ay.equals("haziran")){
            if(gun<=22){
                System.out.println("Burcunuz İkizler.");
            }
            else{
                System.out.println("Burcunuz Yengeç.");
            }
         }

         if(ay.equals("temmuz")){
            if(gun<=22){
                System.out.println("Burcunuz Yengeç.");
            }
            else{
                System.out.println("Burcunuz Aslan.");
            }
         }

         if(ay.equals("agustos")){
            if(gun<22){
                System.out.println("Burcunuz Aslan.");
            }
            else{
                System.out.println("Burcunuz Başak.");
            }
         }

         if(ay.equals("eylul")){
            if(gun<22){
                System.out.println("Burcunuz Başak.");
            }
            else{
                System.out.println("Burcunuz Terazi.");
            }
         }

         if(ay.equals("ekim")){
            if(gun<22){
                System.out.println("Burcunuz Terazi.");
            }
            else{
                System.out.println("Burcunuz Akrep.");
            }
         }

         if(ay.equals("kasim")){
            if(gun<21){
                System.out.println("Burcunuz Akrep.");
            }
            else{
                System.out.println("Burcunuz Yay.");
            }
         }

         if(ay.equals("aralik")){
            if(gun<21){
                System.out.println("Burcunuz Yay.");
            }
            else{
                System.out.println("Burcunuz Oğlak.");
            }
         }  
    }
}
