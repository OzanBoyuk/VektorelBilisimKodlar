import java.util.Scanner;

public class Ornek2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		String kelime = sc.nextLine();
		
		String sub1 = kelime.substring(0,kelime.length()/2);
		String sub2 = kelime.substring(kelime.length()/2,kelime.length());
		
		System.out.println(sub2+""+sub1);
		
		
		sc.close();
	}
	
}
