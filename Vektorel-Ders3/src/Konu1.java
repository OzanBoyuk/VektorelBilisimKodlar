import java.util.Scanner;

public class Konu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Koþul Ýfadeleri
		/*
		 * if
		 * switch
		 * 
		 * */
		
		//System.out.println("Hello");
		
		Scanner scanner = null;
		
		boolean deger = true;
		
		while (deger) {
			
			scanner = new Scanner(System.in); //java.util.Scanenr
			int number = scanner.nextInt();
			
			
			if (number == -1) {
				break ;
			} else {
				if (number>5) {//çift týklayarak blok sonunu görebiliriz.
					System.out.println(number+ " beþten büyük veya eþittir.");
				}else if(number == 5 ) {
					System.out.println(number+ " beþe eþittir.");
				}else {
					System.out.println(number+ " beþten küçüktür.");
				}
			}
			
	
			
		}
		
		System.out.println("Program bitti.");
		
		
		// < > <= >= != !(deðili) true ise false
		
		
		
		
		
		scanner.close();
		
		
	}
	
	

}
