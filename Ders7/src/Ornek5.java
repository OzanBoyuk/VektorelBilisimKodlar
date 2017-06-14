import java.util.Scanner;

public class Ornek5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// girilen kelimenin ilk karakteriyle son 2 karakterini ayný yapma. 
		
		Scanner sc = new Scanner(System.in);
		
		String kelime = sc.nextLine();
		
		String kelime2 = kelime.substring(0,kelime.length()-2);
		kelime = kelime2 + kelime.charAt(0)+kelime.charAt(0);
		
		System.out.println(kelime);

	}

}
