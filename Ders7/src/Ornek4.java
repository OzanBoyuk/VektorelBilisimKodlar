import java.util.Scanner;

public class Ornek4 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String kelime = sc.nextLine();
		
		System.out.println(kelime.charAt(kelime.length()-1)+""+ kelime.substring(0, kelime.length()-1));
		
	}
	

}
