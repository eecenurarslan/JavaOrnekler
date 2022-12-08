package ornekler;
//10 elemanlı bir dizinin ortalamasını hesaplama
import java.util.Scanner;

public class soru7 {

	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			int toplam = 0;
			
			int [] dizi = new int[10];
			
			for(int i = 0; i < 10; i++)
			{
			    System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
			    dizi[i] = scan.nextInt();
			    toplam += dizi[i];
			}
			System.out.println("Dizinin ortalaması " + (toplam / dizi.length));
		}

	}

}
