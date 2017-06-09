import java.util.Scanner;

/*Kabarcýk,merge veya quick sort ödev*/
public class DiziKaydirma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc =new Scanner(System.in);
		
		int dummy[] = new int[5];
	
		for (int i = 0; i < dummy.length; i++) {
			System.out.println(i+" Enter Number:");
			dummy[i] = sc.nextInt();
		
			
			if (dummy[i] %3 ==0 && i!=0) {
			
				int swap = dummy[0];
				dummy[0] = dummy[i];
				
				
				int dummy2[] = new int[i];
				dummy2[0] = swap;
				
				for (int j = 1; j < dummy2.length; j++) {
					dummy2[j]=dummy[j];
				}
				
				for (int k = 1; k <= dummy2.length; k++) {
					dummy[k]=dummy2[k-1];
				}
			}
			
		}
		
		
		
		for (int i = 0; i < dummy.length; i++) {
			System.out.print(""+dummy[i]);
		}
		
		sc.close();
		
	}
	
}
