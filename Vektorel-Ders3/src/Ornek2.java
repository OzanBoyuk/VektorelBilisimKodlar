import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		
		
		/**
		 * if number is between 50 and 70 and than if number is divide by 13 print divided else not divided 
		 * else divide by 9 
		 */
		
		System.out.println("Sayi Gir:");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		
		if (number >= 50 && number <=70) {
			if (number % 13 ==0) {
				System.out.println(number + " sayisi 13  e bölünür.");
			}else {
			
				System.out.println(number + " sayisi 13  e bölünemez.");
				
			}
		}else {
			if (number % 9 ==0) {
				System.out.println(number + " sayisi 9  a bölünür.");
			}else {
			
				System.out.println(number + " sayisi 9  a bölünemez.");
				
			}
		}
		
	}
	
}
