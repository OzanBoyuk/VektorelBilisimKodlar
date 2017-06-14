import java.util.Scanner;

public class Ornek6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String kelime = sc.nextLine();
		String newKelime="";
		
		for (int i = 0; i < kelime.length(); i++) {
			
			if (kelime.charAt(i) != 'z') {
				char a = (char)((byte) kelime.charAt(i)+2);
				newKelime = newKelime + a ;
			}else {
				newKelime = newKelime+'b';
			}
			
		}
		
		System.out.println(newKelime);
		
		
	}
	
}
