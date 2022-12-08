package ornekler;
//Girilen değerlere göre üçgen alanının hesaplanması
import java.util.Scanner;
public class soru5 {
	
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Taban uzunluğu giriniz");
			int a=scanner.nextInt();
			
			System.out.println("Yükseklik giriniz");
			int h=scanner.nextInt();
			
			System.out.println("Üçgen alanı:"+ a*h/2);
		}
		
		
		
		
	}
}
