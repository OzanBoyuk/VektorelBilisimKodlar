package com.test;


import org.model.Icecek;
import org.model.Menu;
import org.model.Yiyecek;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Menu yiyecek = new Yiyecek();
		Yiyecek yiyecek = new Yiyecek();
		yiyecek.adi="Mantý";
		yiyecek.fiyat="20TL";
		yiyecek.porsiyon =2;
		yiyecek.kaydet(yiyecek);
		//yiyecek.sil(yiyecek);
		
		Menu icecek = new Icecek();
		icecek.adi="Kola";
		icecek.fiyat="10 TL";
		icecek.kaydet(icecek);
		//icecek.sil(icecek);
		
	}

}
