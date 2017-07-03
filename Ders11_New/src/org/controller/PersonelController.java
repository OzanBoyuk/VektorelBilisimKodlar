package org.controller;

import org.model.Akademik;
import org.model.Idari;
import org.model.Personel;

public class PersonelController implements Controller{

	public PersonelController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void kaydet(Personel personel) {

		if (personel instanceof Akademik) {
			System.out.println("Akademik personel kaydedildi.");
		}
		else if (personel instanceof Idari) {
			System.out.println("Idari personel kaydedildi.");

		}
		
	}

	@Override
	public void sil(Personel personel) {
		
		if (personel instanceof Akademik) {
			System.out.println("Akademik personel silindi.");
		}
		else if (personel instanceof Idari) {
			System.out.println("Idari personel silindi.");

		}
		
	}
	
	public Personel [] liste(Personel personel)
	{
		return new Personel[3];
	}
	
}
