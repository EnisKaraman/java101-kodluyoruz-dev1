package Listeler;
public class Harmonikort {
    public static void main(String[] args) {
        
        double harmonik;
        float toplam=0;
        
        int [] liste ={1, 2, 3, 4, 5};
        
        for (int i : liste) {
           toplam += 1f / i; 
        }
        harmonik = liste.length / toplam;
        
        System.out.println(harmonik);
    }
  
}
