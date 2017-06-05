import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		System.out.print("Sayý giriniz:");
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
			System.out.println("Asal deðildir.");
		} 
		
		
		
		for (int i = 0; i < 15 ; i++) {
			if (i==5) {
				break;
			}//Ýç içe for olsa sadece içerdekinden çýkar
			
			System.out.println(i);
		}
		
		
		
		sc.close();
	
	}
	
}
