import java.util.Scanner;

public class Konu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Gün sýrasýný yazýnýz.");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		
		switch (number) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Salý");
			break;
		case 3:
			System.out.println("Çarþamba");
			break;
		case 4:
			System.out.println("Perþembe");
			break;
		case 5:
			System.out.println("Cuma");
			break;
		case 6:
			System.out.println("Cumartesi");
			break;
		case 7:
			System.out.println("Pazar");
			break;

		default:
			System.out.println("Hafta da 7 gün vardýr.");
			break;
		}
		
	}

}
