import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String isim = sc.nextLine();
		System.out.println("Ad�n�z:" + isim);
		String soyisim = sc.nextLine();
		System.out.println("Soyad�n�z:" + soyisim);
		
		String adTers = "";
		
		int i = isim.length();
		while (i>0) {
			adTers = adTers + isim.charAt(i-1);
			i--;
		}
		
		System.out.println(adTers+" "+soyisim);
		
		sc.close();
			
	}
	
}
