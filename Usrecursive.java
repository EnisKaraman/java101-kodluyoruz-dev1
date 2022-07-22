import java.util.*;
public class Usrecursive {
 static int us(int x, int y){    
     if(y == 0){
            return 1;
        }else{
            return (x * us(x, y - 1));           
        }     
 }
    public static void main(String[] args) {
    Scanner klavye=new Scanner(System.in);
    
        System.out.print("Taban değeri giriniz:");
        int taban=klavye.nextInt();
        
        System.out.print("Üs değerini giriniz:");
        int us=klavye.nextInt();
        System.out.println(us(taban,us));
        
}
    
}
