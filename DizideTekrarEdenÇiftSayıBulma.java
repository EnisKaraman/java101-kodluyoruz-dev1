package Listeler;
import java.util.Arrays;

public class DizideTekrarEdenÇiftSayıBulma {
    static boolean isFind(int[] arr, int value){
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    } 
    
    public static void main(String[] args) {
        
        int [] liste={45, 22, 12, 7, 6, 22, 12, 60, 7};
        int [] cliste=new int[liste.length];
        int sayac=0;
        
        for (int i = 0; i < liste.length; i++) {
            for (int j = 0; j < liste.length; j++) {
                if ( (i != j) && (liste[i]==liste[j]) && (liste[i] % 2 == 0) ) {
                    if (!isFind(cliste, liste[i])) {
                      cliste[sayac++]=liste[i];                             
                    }
                    break; 
                                      
                }                
            }
        }
         System.out.println(Arrays.toString(cliste));
    }
    
}
