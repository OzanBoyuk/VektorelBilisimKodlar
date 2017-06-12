
public class Ornek1 {

	public static void main(String[] args) {
		
		int i=0;
		
		while (i<5) {
			
			int j=0;
			
			while (j<5) {
				if (i==j) {
					System.out.println("*");
				}else {
					System.out.println(" ");
				}
				j++;
			}
			System.out.println();
			i++;
			
		}
		
	}
	
}
