package Listeler;
import java.util.Scanner;
public class DiziSiralama {    
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        
        System.out.print("Kaçtane Sayı Gireceksiniz: ");
        int n=klavye.nextInt();
        
        int[] liste=new int[n];
        int gecici;
        
        for (int i = 0; i < liste.length; i++) {
            System.out.print("Dizinin "+(i+1)+". Elemanını Giriniz: ");
            liste[i]=klavye.nextInt();
        }        
        for(int i = 0; i < liste.length; i++)
        {
            for(int j = i+1; j < liste.length; j++)
            {
                if(liste[j] < liste[i]) {
                    gecici = liste[i];
                    liste[i] = liste[j];
                    liste[j] = gecici;
                }
            }
        }                                  
        for (int i = 0; i < liste.length; i++) {
            System.out.print(liste[i]+", ");
        }
    }   
}
