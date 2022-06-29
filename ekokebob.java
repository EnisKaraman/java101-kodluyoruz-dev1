import java.util.*;
public class ekokebob {
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("1. Sayınızı Giriniz:");
        int s1=klavye.nextInt();
        System.out.println("2. Sayınızı Giriniz:");
        int s2=klavye.nextInt();
        int i=1;
        int k=1;
        int ebob=1;
        while(i<s1){
            if (s1%i==0 && s2%i==0) {
                System.out.println(i);
                ebob=i;
            }
            
            i++;
    }
        System.out.println(i);
        System.out.println("Ebob:"+ebob);

        
        while(k<=(s1*s2)){
            
            if (k%s1==0 && k%s2==0) {
                System.out.println("Ekok:"+k);
                break;               
            }
            k++;            
        }
            System.out.println("Ekok Sağlama:"+(s1*s2)/ebob);
    }
}
