import java.util.Scanner;

public class Ornek1 {

	//Girilen say�n�n 10 adam�n ilerisine kadar 2 ye b�l�nen say�lar� yaz�n
	
	public static void main(String[] args) {
		
		System.out.print("Say� giriniz:");
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
