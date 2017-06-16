import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int sayi1 = sc.nextInt();
		int sayi2 = sc.nextInt();
		
		System.out.println("Toplama =" + topla(sayi1, sayi2));
		System.out.println("Cikarma =" + cikar(sayi1, sayi2));
		System.out.println("Bolme =" + bol(sayi1, sayi2));
		System.out.println("Carpma =" + carp(sayi1, sayi2));
		
		
	}
	
	
	public static int topla(int a,int b){
		
		return a+b;
	}
	public static int cikar(int a,int b){
			
			return a-b;
		}
	public static int bol(int a,int b){
		
		return a/b;
	}
	public static int carp(int a,int b){
		
		return a*b;
	}

	public static int carp(int ... sayi){ //istediðin kadar parametre
			
			int length = sayi.length; // length ini bilirsek kac parametre aldýgýný biliriz.
			
			return length;
	}
	
}
