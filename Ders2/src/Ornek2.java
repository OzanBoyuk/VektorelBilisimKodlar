import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final float PI = 3.14f ;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Çemberin yarýçapýný girin : ");
		float yariCap = scanner.nextInt();
		
		float cevre = 2.0f*PI*yariCap;
		
		System.out.println("Yari çapý "+yariCap+" olan çemberin çevresi =" +  cevre );
		System.out.println("Yarrý çapý "+yariCap+"olan çemberin alaný =" + (PI*Math.pow(yariCap, 2)));
		
		
		
		scanner.close();
		

	}

}
