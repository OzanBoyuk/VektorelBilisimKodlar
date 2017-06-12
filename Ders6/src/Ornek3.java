import java.util.Scanner;

public class Ornek3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int sayi=0;
		
		
		while (true) {
			 sayi = sc.nextInt();
			
			if (sayi%10==0) {
				break;
			}else {
				int i=1;
				System.out.println(sayi+" sayýsýnýn bölenleri");
				while (i<sayi) {
					
					if (sayi%i==0) {
						System.out.println(""+i);
					}
					i++;
				}
			}
		}
		System.out.println(sayi+" sayisi 10 un katýdýr.");
		
		sc.close();
	}
	
}
