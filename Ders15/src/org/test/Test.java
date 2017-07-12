package org.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.model.Kitap;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Kitap> kitapList = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean devamMi = true;
		
		while (devamMi) {
			Kitap kitap = new Kitap();
			
			System.out.println("Kitap id:");
			kitap.setId(sc.nextInt());
			
			System.out.println("Kitap ad�:");
			kitap.setAdi(sc.next());
			
			System.out.println("Kitap fiyat:");
			kitap.setFiyati(sc.nextInt());
			
			kitapList.add(kitap);
			
			System.out.println("Devam etmek i�in 1 e birimek i�in 2 ye bas�n�z :");
			
			if (!sc.next().equals("1") ) {
				devamMi = false;
			}
			
		}
		
		for (int i = 0; i < kitapList.size(); i++) {
			System.out.println("ID :" + kitapList.get(i).getId()+" "
					+"ADI :" + kitapList.get(i).getAdi()+" "
					+"F�YATI :" + kitapList.get(i).getFiyati());
		}
	}

}
