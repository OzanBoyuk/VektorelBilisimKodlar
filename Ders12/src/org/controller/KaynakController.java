package org.controller;

import org.model.Dergi;
import org.model.Kaynak;
import org.model.Kitap;

public class KaynakController implements Controller {

	@Override
	public void kaydet(Kaynak kaynak) {
		if (kaynak instanceof Kitap) {
			System.out.println("Kitap kaydedildi.");
		}else if (kaynak instanceof Dergi) {
			System.out.println("Dergi kaydedildi.");

		}
		
	}

	@Override
	public void sil(Kaynak kaynak) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void listele(Kaynak kaynak []) {

		for (int i = 0; i < kaynak.length; i++) {
			
			if (kaynak[i] instanceof Kitap) {
				
				Kitap kitap = (Kitap)kaynak[i];
				System.out.println("Kitap Id :" + kitap.kitapId);
				System.out.println("Kitap Adi :" + kitap.kaynakAdi);
				System.out.println("Kitap Yazar :" + kitap.yazar.yazarAdi);
				System.out.println("Kitap Yazar yaþý :" + kitap.yazar.yazaryasi);
			}
		}
		
	}

	@Override
	public void idYeGoreKaynakGetir(Kaynak kaynak) {
		// TODO Auto-generated method stub
		
	}

}
