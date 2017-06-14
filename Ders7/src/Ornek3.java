import java.util.Scanner;
/*  Önemli örnek  */
public class Ornek3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String kelime = sc.nextLine();
		
		int dizi[] = new int[kelime.length()];
		
		for (int i = 0; i < kelime.length(); i++) {
			
			char karakter = kelime.charAt(i);
			int sayac=0;
			
			if (kelime.indexOf(karakter) != i) {
				continue;
			}
			
			for (int j = 0 ; j < kelime.length(); j++) {
				if (kelime.charAt(j)==karakter) {
					sayac++;
				}
			}
			
			System.out.println(karakter+ " : "+sayac);
		}
		
	
	}
	
}
