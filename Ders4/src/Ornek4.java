
public class Ornek4 {

	/* bosluk karakter
	 * 0         1
	 * 1         1
	 * 2         1
	 * 3         1 mant��k bu
	 * */
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*	for (int i = 0; i < 4; i++) { // sat�r
			for (int j = 0; j < i; j++) { // s�tun
				System.out.print(" ");
			}
			System.out.println("*");
			
			
		}
		
		for (int i = 4; i > 0; i--) { // sat�r 
			for (int j = 0; j < i; j++) { // s�tun 
				System.out.print(" ");
			}
			System.out.println("*");
			
			
		}
		
		for (int i = 4; i > 0; i--) { // sat�r 
			for (int j = 0; j < 4 ; j++) { // s�tun 
				System.out.print(" ");
			}
			System.out.println("*");
			
			
		} */
		

		/*for (int i = 1; i < 4 ; i++) {
			
			for (int j = 1; j < 4-i; j++) {
				System.out.print(" ");
			}
			

			for (int j = 0; j < 2*i-1; j++) {
				System.out.print("*");
			}
			
			System.out.println();
			
		} */
			
		
		
		for (int i = 1; i < 6; i++) { //5 sat�r
			
			System.out.print("*");
			
			if (i==5) {
				System.out.println();
				
				for (int k = 4;k > 0; k--) { // sat�r 
					for (int l = 0; l < k; l++) { // s�tun 
						System.out.print(" ");
					}
					System.out.println("*");
					
					if (k==1) {
						for (int j = 0; j < 5; j++) {
							System.out.print("*");
						}
					}
					
				}
				
				
			}
		
		}
		
		System.out.println("\n�terasyon �ki");
		
		for (int i = 1; i < 6; i++) {
			
			System.out.print("*");
			
			for (int j = i; j < i; i++) {
				System.out.println(" ");
			}
			System.out.println("*");
			
		}
		
		
	
	
	
	
	}
	
	
	
	

}
