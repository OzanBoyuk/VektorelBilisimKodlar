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
			
			System.out.println("Kitap adý:");
			kitap.setAdi(sc.next());
			
			System.out.println("Kitap fiyat:");
			kitap.setFiyati(sc.nextInt());
			
			kitapList.add(kitap);
			
			System.out.println("Devam etmek için 1 e birimek için 2 ye basýnýz :");
			
			if (!sc.next().equals("1") ) {
				devamMi = false;
			}
			
		}
		
		for (int i = 0; i < kitapList.size(); i++) {
			System.out.println("ID :" + kitapList.get(i).getId()+" "
					+"ADI :" + kitapList.get(i).getAdi()+" "
					+"FÝYATI :" + kitapList.get(i).getFiyati());
		}
	}

}
