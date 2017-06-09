import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Bir sayi giriniz:");
		Scanner sc = new Scanner(System.in);
		int sayi = sc.nextInt();
		
		System.out.println(sayi+" sayýsýnýn karesi ="+(sayi*sayi));
		
		sc.close();
		

	}

}
