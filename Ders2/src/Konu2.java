import java.util.Scanner;

public class Konu2 {

	/*Yorum sat�r� yapmak i�in kod alan�n� sec sag t�kla Source-> alt�nda */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Birinci sayi: ");
		int sayi1 = sc.nextInt();
		System.out.println("�kinci sayi :");
		int sayi2 = sc.nextInt();
		
		System.out.println("Toplam : "+(sayi1+sayi2));
		
		int carpim = sayi1*sayi2;
		int bolum = sayi1/sayi2;
		int fark = sayi1-sayi2;
		
		System.out.println("��karma : "+(sayi1-sayi2));
		System.out.println("�arp�m : "+(sayi1*sayi2));
		System.out.println("B�l�m : "+(sayi1/sayi2));


		sc.close();
		
	}

}
