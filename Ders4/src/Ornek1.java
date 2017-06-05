import java.util.Scanner;

public class Ornek1 {

	//Girilen sayýnýn 10 adamýn ilerisine kadar 2 ye bölünen sayýlarý yazýn
	
	public static void main(String[] args) {
		
		System.out.print("Sayý giriniz:");
		Scanner sc = new Scanner(System.in);
		
		int sayi = sc.nextInt();
		
		
		for (int i = sayi; i < sayi+10; i++) {
			if (i%2==0) {
			System.out.println(i);	
			}
		}
		
		sc.close();
		
		
	}
	
}
