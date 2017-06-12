import java.util.Scanner;

import sun.applet.Main;

public class Ornek5 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int dizi[] = new int[5];
		
		for (int i = 0; i < dizi.length; i++) {
			dizi[i] = sc.nextInt();
		}
		
		for (int i = 0; i < dizi.length; i++) {
			if (i==dizi.length-1) {
				System.out.print(""+dizi[i]);
			}else {
				System.out.print(""+dizi[i]+",");
			}
		}
		
		for (int i = 0; i < dizi.length; i++) {
			for (int j = i+1; j < dizi.length; j++) {
				if (dizi[i] < dizi[j]) {
					continue;
				}else{
					int swap = dizi[i];
					dizi[i] = dizi[j];
					dizi[j] = swap;
					
				}
			}
		}
		
		System.out.println();
		for (int i = 0; i < dizi.length; i++) {
			
			if (i==dizi.length-1) {
				System.out.print(""+dizi[i]);
			}else {
				System.out.print(""+dizi[i]+",");
			}
		}
	}

}
