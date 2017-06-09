import java.util.Scanner;

public class Ornek3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int dizi[][] = new int [3][3];
		
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 ; j++) {
				dizi[i][j] = sc.nextInt();
			}
		}
		
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 ; j++) {
				if (i==j) {
					dizi[i][j]=0;
				}else{
					if (i<=j) {
						int temp = dizi[i][j];
						dizi[i][j] = dizi[j][i];
						dizi[j][i] =  temp;
					}
				
				}
			}
		}
		
		int sayac=0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3 ; j++) {
				
				if (sayac%3==0) {
					System.out.println();
				}
				sayac++;
				System.out.print(""+dizi[i][j]);
			}
		}
		
	}
	
}
