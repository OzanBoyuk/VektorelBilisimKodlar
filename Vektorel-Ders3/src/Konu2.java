import java.util.Scanner;

public class Konu2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("G�n s�ras�n� yaz�n�z.");
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		
		switch (number) {
		case 1:
			System.out.println("Pazartesi");
			break;
		case 2:
			System.out.println("Sal�");
			break;
		case 3:
			System.out.println("�ar�amba");
			break;
		case 4:
			System.out.println("Per�embe");
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
			System.out.println("Hafta da 7 g�n vard�r.");
			break;
		}
		
	}

}
