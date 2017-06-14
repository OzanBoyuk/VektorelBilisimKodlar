import java.util.Scanner;

/*09.06.2017 Cuma */
public class Ornek1 {

	public static void main(String[] args) {
		
		
		Scanner sc =new Scanner(System.in);
		
	
		
		int dizi [] = new int[5] ;


		for (int i = 0; i < dizi.length; i++) {
			System.out.println(i+" enter number of index :");
			dizi[i] = sc.nextInt();
		}
		
		int max = 0 ;
		int temp = 0 ;
		
		/**
		 * 1. Dizinin ilk elemaný en küçük kabul edilir
		 * 2. 
		 * 
		 * /
		 */
		
		for (int i = 0; i < dizi.length-1; i++) {
			for (int j = i+1; j < dizi.length; j++) {
				if (dizi[i]>dizi[j] ) {
					temp = dizi[i];
					dizi[i]=dizi[j];
					dizi[j]=temp;
				}
			}
		}
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.println(""+dizi[i]);
		}
	}
	
}
