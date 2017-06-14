import java.util.Scanner;

public class Ornek1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * if less than 50 print F
		 * if bigger than 50 and less than 70 print C
		 * if bigger 70 and less than 80 print B
		 * if bigger 80 and less than 100 print A
		 * if bigger than 100 print error process
		 * 
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);

		boolean deger = true;
			
			while (deger) {
				
				scanner = new Scanner(System.in); //java.util.Scanenr
				int point = scanner.nextInt();
				
				
				
				if(point  == -1) {
					break;
				} else {

					if (point>=0 && point < 50) {
						System.out.println("F");
					}else if (point >= 50 && point < 70 ) {
						System.out.println("C");
					}else if (point >= 70 && point < 80) {
						System.out.println("B");
					}else if (point >= 80 && point < 90) {
						System.out.println("A");
					}else if (point >= 90 && point <= 100) {
						System.out.println("A+");
					}else{
						System.out.println("Hatali girdi.");
						
					}
					
				}
				
			
			
			}
			
		System.out.println("Program bitti.");
	
		scanner.close();
		
	}

}
