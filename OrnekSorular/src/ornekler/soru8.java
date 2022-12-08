package ornekler;
//Tahmini varış süresi hesaplama
import java.util.Scanner;

public class soru8 {

	public static void main(String[] args) {
try (Scanner scan = new Scanner(System.in)) {
	int yol,saat;
	
	System.out.print("Yol mesafini giriniz (km) : ");
	yol = scan.nextInt();
	System.out.print("Gitmek istediğiniz süreyi giriniz (saat) : ");
	saat = scan.nextInt();
	
	System.out.println("Gitmeniz gereken ortalama hız = " + (yol / saat) + "km/s dir.");
}

	}

}
