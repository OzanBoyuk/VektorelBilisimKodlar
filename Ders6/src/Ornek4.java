import java.util.Scanner;

public class Ornek4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int i=0;
		int dizi[] = new int [5];
		
		do {
			System.out.println("Bir sayi giriniz :");
			dizi[i] = sc.nextInt();
			i++;
		} while (i<dizi.length);
		
		int j = dizi.length-1;
		
		while (j>=0) {
			System.out.println(dizi[j]);
			j--;
		}
		
	}
}
