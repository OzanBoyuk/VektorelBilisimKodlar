package com.test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int maas = 0;

		Personel personel = new Personel();
		personel.adi = "Ozan";

		Akademik akademik = new Akademik();
		akademik.unvan = "Mühendis";
		System.out.println("Akademik unvan:" + akademik.unvan);
		akademik.dersAc();
		akademik.adi = "Ali";
		System.out.println("Adademik adı :" + akademik.adi );
		maas = akademik.maasHesapla();
		System.out.println(maas+"\n");
		
		Idari idari = new Idari();
		idari.kayitYap();
		maas = idari.maasHesapla();
		System.out.println(maas);
		
		Personel personel2 = new Personel(3);
		//personel2.adres = new Adres[3]; eski hali
		personel2.adi = "Ahmet";
		personel2.adres[0] = new Adres();
		personel2.adres[0].city = "Trabzon";
		
	
		personel2.adres[1] = new Adres();
		personel2.adres[1].city = "Ankara";
		
		
		personel2.adres[2] = new Adres();
		personel2.adres[2].city = "Bolu";
		
		System.out.println("\nAd:" +personel2.adi+"\n"+ "Adres1:"+personel2.adres[0].city+"\n"+"Adres2:"+personel2.adres[1].city
				+"\n"+"Adres3:"+personel2.adres[2].city);
		
		Akademik akademik2 = new Akademik(2);
		//personel2.adres = new Adres[3]; eski hali
		akademik2.adi = "Osman";
		akademik2.adres[0] = new Adres();
		akademik2.adres[0].city = "Sakarya";
		
	
		akademik2.adres[1] = new Adres();
		akademik2.adres[1].city = "Adana";
		
		System.out.println("\nAkademik: \nAd:" +akademik2.adi+"\n"+ "Adres1:"+akademik2.adres[0].city+"\n"+"Adres2:"+akademik2.adres[1].city
				);
		
		
		Scanner sc = new Scanner(System.in);
		
		Akademik akademik3;
		System.out.println("Akademisyenin kac adresi olsun:");
		akademik3 = new Akademik(sc.nextInt());
	
		
		System.out.println("Akademisyen adı :");
		akademik3.adi = sc.next();

		
		for (int i = 0; i < akademik3.adres.length; i++) {
			
			System.out.println("Akademisyenin "+(i+1)+". adresi:");	
			akademik3.adres[i] = new Adres();
			akademik3.adres[i].city = sc.next();
			
		
		}
		
		System.out.println("\nAkademik: \nAd:" +akademik3.adi+"\n"+ "Adres1:"+akademik3.adres[0].city+"\n"+"Adres2:"+akademik3.adres[1].city
		);

	}

}
