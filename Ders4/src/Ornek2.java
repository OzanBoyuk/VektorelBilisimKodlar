import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		System.out.print("Say� giriniz:");
		Scanner sc = new Scanner(System.in);
		
		int sayi = sc.nextInt();
		int sayac = 0 ;
	
		for (int i = 1; i <= sayi; i++) {
			if (sayi%i == 0 ) {
				sayac++;
				
			}
			
		}
		

		if (sayac==2) {
			System.out.println("Asaldir.");
		}else {
			System.out.println("Asal de�ildir.");
		} 
		
		
		
		for (int i = 0; i < 15 ; i++) {
			if (i==5) {
				break;
			}//�� i�e for olsa sadece i�erdekinden ��kar
			
			System.out.println(i);
		}
		
		
		
		sc.close();
	
	}
	
}
