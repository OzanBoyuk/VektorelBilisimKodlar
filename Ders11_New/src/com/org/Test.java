package com.org;

import org.controller.PersonelController;
import org.model.Akademik;
import org.model.Idari;
import org.model.Personel;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersonelController personelController = new PersonelController();
		
		//Akademik akademik = new Akademik();
		Personel akademik = new Akademik();
		personelController.kaydet(akademik);
		
		Idari idari = new Idari();
		personelController.kaydet(idari);
		
		personelController.liste(idari);
		
	}

}
