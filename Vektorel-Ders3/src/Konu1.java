import java.util.Scanner;

public class Konu1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ko�ul �fadeleri
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
				if (number>5) {//�ift t�klayarak blok sonunu g�rebiliriz.
					System.out.println(number+ " be�ten b�y�k veya e�ittir.");
				}else if(number == 5 ) {
					System.out.println(number+ " be�e e�ittir.");
				}else {
					System.out.println(number+ " be�ten k���kt�r.");
				}
			}
			
	
			
		}
		
		System.out.println("Program bitti.");
		
		
		// < > <= >= != !(de�ili) true ise false
		
		
		
		
		
		scanner.close();
		
		
	}
	
	

}
