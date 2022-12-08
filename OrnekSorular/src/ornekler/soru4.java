package ornekler;
// 1den 100e kadar olan sayıların toplamı
public class soru4 {

	public static void main(String[] args) {
		int i; 
		int toplam = 0;
for (i=1;i<100;i++) {
	//toplam = toplam + i;
	toplam += i;
}
	System.out.println("1-100 arası sayıların toplamı = " +toplam );
	
}
	}

