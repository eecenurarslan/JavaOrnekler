package ornekler;

import java.util.Scanner;

//Faktöriyel hesabı
public class ornek9 {

	public static void main(String[] args) {
	        
	        Scanner scan = new Scanner(System.in);
	        int faktoriyel = 1;
	        
	        System.out.println("Bir sayi giriniz: ");
	        int sayi = scan.nextInt();
	        
	        while(sayi > 0) {
	            faktoriyel *= sayi;
	            sayi--;
	        }
	        System.out.println("Faktoriyel = " + faktoriyel);

	}

}
