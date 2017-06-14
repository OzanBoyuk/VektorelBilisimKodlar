import java.util.Scanner;

public class Ornek3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		int kenar1 = sc.nextInt();
		int kenar2 = sc.nextInt();
		int kenar3 = sc.nextInt();
		
		
		 		
 		if(((kenar1+kenar2>kenar3)&&(kenar1-kenar2<kenar3))||
 				((kenar3+kenar1>kenar2)&&(kenar3-kenar1<kenar2))||
 			((kenar2+kenar3>kenar1)&&(kenar3-kenar2<kenar1)))
 			System.out.println("bu üçgendir");
 		
 		else System.out.println("bu ücgen değildir");
	}

}
