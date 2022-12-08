package ornekler;
//Kullanıcının girdiği 3 sayıdan en büyük olanını bulan program

import java.util.Scanner;

public class soru2 {
	public static void main(String[]args) {
int a,b,c; 
try (Scanner scan = new Scanner(System.in)) {
	System.out.println("1.Sayi : ");
	a = scan.nextInt();
	
	System.out.println("2.Sayi : ");
	b = scan.nextInt();
	
	System.out.println("3.Sayi : ");
	c = scan.nextInt();
}

if(a>b && a>c) System.out.println("En buyuk sayi =" + a);
 else if (b>a && b>c) System.out.println("En buyuk sayi =" + b);
 else if (c>a && c>b) System.out.println("En buyuk sayi =" + c);
	}
}