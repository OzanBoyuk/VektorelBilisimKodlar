import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float PI = 3.14f ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�emberin yar��ap�n� girin : ");
		float yariCap = scanner.nextInt();
		
		float cevre = 2.0f*PI*yariCap;
		
		System.out.println("Yari �ap� "+yariCap+" olan �emberin �evresi =" +  cevre );
		System.out.println("Yarr� �ap� "+yariCap+"olan �emberin alan� =" + (PI*Math.pow(yariCap, 2)));
		
		
		
		scanner.close();
		

	}

}
