import java.util.Scanner;

public class Konu2 {

	/*Yorum satýrý yapmak için kod alanýný sec sag týkla Source-> altýnda */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello World");
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Birinci sayi: ");
		int sayi1 = sc.nextInt();
		System.out.println("Ýkinci sayi :");
		int sayi2 = sc.nextInt();
		
		System.out.println("Toplam : "+(sayi1+sayi2));
		
		int carpim = sayi1*sayi2;
		int bolum = sayi1/sayi2;
		int fark = sayi1-sayi2;
		
		System.out.println("Çýkarma : "+(sayi1-sayi2));
		System.out.println("Çarpým : "+(sayi1*sayi2));
		System.out.println("Bölüm : "+(sayi1/sayi2));


		sc.close();
		
	}

}
