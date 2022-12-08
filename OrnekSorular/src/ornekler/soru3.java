package ornekler;
// 2. dereceden ax^2 + bx + c denkleminin diskriminant çözümünü yapınız
// kullanıcıdan a,b,c değerlerini isteyerek deltayı bulunuz
import java.util.Scanner;


    public class soru3 {
    	public static void main(String[] args) {
    int a,b,c;
    float kok1,kok2;
    try (Scanner scan = new Scanner(System.in)) {
		System.out.println("a sayısı: ");
		a = scan.nextInt();
		
		System.out.println("b sayısı: ");
		b = scan.nextInt();
		
		System.out.println("c sayısı: ");
		c = scan.nextInt();
	}
    int delta = b*b - (4*a*c);
   if (delta>0) {
	   System.out.println("Denklemin 2 kökü vardır .");
	   kok1 =(float) (( - b - Math.sqrt(delta) ) / 2*a) ;
	   kok2 =(float) (( - b + Math.sqrt(delta) ) / 2*a) ;
	   System.out.println("Kök = "+ kok1);
	   System.out.println("Kök = "+ kok2);
   }else if (delta==0) {
	   System.out.println("Denklemin çakışık 2 kökü vardır .");
	   kok1 = (float) (-b)/2*a;
	   System.out.println("Kökler = "+ kok1);
   }else System.out.println("Denklemin kökü yoktur.");
   
	   
			   
			
			  
			 
   }
    
    

    

    }