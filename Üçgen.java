import java.util.*;
public class Üçgen {
    public static void main(String[] args) {
        int k1, k2, k3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("İlk kenarı giriniz : ");
		k1 = scanner.nextInt();
		
		System.out.println("İkinci kenarı giriniz : ");
		k2 = scanner.nextInt();
		
		System.out.println("Son kenarı giriniz : ");
		k3 = scanner.nextInt();
		
		double u = (k1 + k2 + k3) / 2;
		
		double cevre = 2 * u;
		
		double alan = u * (u - k1) * (u - k2) * (u - k3);
		
		System.out.println("Üçgenin çevresi : " + cevre);
		System.out.println("Ügenin alanı : " + alan);
		

    }
    
}
