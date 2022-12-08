package ornekler;
//Kullanıcıdan alınan 2 sayının toplamını ve ortalamasını ekrana yazın

import java.util.Scanner;

public class soru1 {

	public static void main(String[] args) {
		int sayi1,sayi2,toplam;
		float ortalama;
		
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("1.Sayi : ");
			sayi1 = scan.nextInt();
			
			System.out.println("2.Sayi : ");
			 sayi2 = scan.nextInt();
		}
			
			toplam = sayi1 + sayi2;
		
		ortalama = (float) toplam / 2;
		
		System.out.println("Toplam = " +toplam);
		System.out.println("Ortalama = " +ortalama);
		
		
		
				
		

	}

}
