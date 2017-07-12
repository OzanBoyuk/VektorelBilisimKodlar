package kutuphane.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


import kutuphane.dao.BasicModelImp;
import kutuphane.model.BasicModel;
import kutuphane.model.Dergi;
import kutuphane.model.Kitap;

public class Test {

	public static void main(String[] args) {
		
		BasicModelImp baseModel = new BasicModelImp();
		
		List<BasicModel> liste ;
		
		Scanner sc = new Scanner(System.in);
		
		
		boolean devamMi = true;
		
		while (devamMi) {
			
			Kitap kitap = new Kitap();
			
			System.out.println("Kitap id:");
			kitap.setId(sc.nextInt());
			
			System.out.println("Kitap adý:");
			kitap.setAd(sc.next());
			
			System.out.println("Kitap fiyat:");
			kitap.setFiyat(sc.nextInt());
			
			baseModel.kaydet(kitap);
			
			
			Dergi dergi = new Dergi();
			
			System.out.println("Dergi id:");
			dergi.setId(sc.nextInt());
			
			System.out.println("Dergi adý:");
			dergi.setAd(sc.next());
			
			System.out.println("Dergi sayi:");
			dergi.setSayi(sc.nextInt());
			
			baseModel.kaydet(dergi);
			
			
			
			System.out.println("Devam etmek için 1 e birimek için 2 ye basýnýz :");
			
			
			
			
			
			if (!sc.next().equals("1") ) {
				devamMi = false;
			}
			
		}
		
		
		liste = baseModel.listele();
		
		for (int i = 0; i < liste.size(); i++) {
			
			if (liste.get(i) instanceof Kitap) {
				System.out.println("Kitap id : "+liste.get(i).getId());
			}else if (liste.get(i) instanceof Dergi) {
				System.out.println("Dergi id : "+liste.get(i).getId());
			}
			
		}

	}

}
