import java.util.Scanner;
public class manav {
    public static void main(String[] args) {
     Scanner klavye=new Scanner(System.in);

     int armut,elma,domates,muz,patlican;
     double armutkf=2.14,elmakf=3.67,domateskf=1.11,muzkf=0.95,patlicankf=5,toplam;

     System.out.print("Armut kaç kilo:");
     armut=klavye.nextInt();
     toplam=armut*armutkf;

     System.out.print("Elma kaç kilo:");
     elma=klavye.nextInt();
     toplam+=elma*elmakf;

     System.out.print("Domates kaç kilo:");
     domates=klavye.nextInt();
     toplam+=domates*domateskf;

     System.out.print("Muz kaç kilo:");
     muz=klavye.nextInt();
     toplam+=muz*muzkf;

     System.out.print("Patlıcan kaç kilo:");
     patlican=klavye.nextInt();
     toplam+=patlican*patlicankf;

     System.out.println("Toplam Tutar:"+toplam);

    }
}
