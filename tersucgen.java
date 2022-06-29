
public class tersucgen {
    public static void main(String[] args) {
        int s=19;
        for (int i = 1; i <= 10; i++) {
            System.out.println(" ");
            
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
                }
            
            for (int j = 1; j <= s; j++) {
                System.out.print("*");               
            }           
            s-=2;           
        }
    }    
}
