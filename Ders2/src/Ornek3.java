import java.util.Scanner;

public class Ornek3 {


	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ýlk dik kenar : ");
		int ilkKenar = scanner.nextInt();
		System.out.println("Ýkinci dik kenar : ");
		int ikinciKenar = scanner.nextInt();
		
		int alan = (ilkKenar*ikinciKenar)/2;
				
		System.out.println("Alan = " + alan);
		
		double sonuc = Math.pow(ilkKenar, 2)+Math.pow(ikinciKenar, 2);
		
		double digerKenar = Math.sqrt(sonuc);
		
		System.out.println("Cevre =" + (ilkKenar+ikinciKenar+digerKenar));
		
		scanner.close();
	
		
	}
	
}
