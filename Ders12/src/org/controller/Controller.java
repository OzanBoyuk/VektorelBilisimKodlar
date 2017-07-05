package org.controller;

import org.model.Kaynak;

public interface Controller {

	public void kaydet(Kaynak kaynak);
	public void sil(Kaynak kaynak);
	public void listele(Kaynak kaynak[]);
	public void idYeGoreKaynakGetir(Kaynak kaynak);
	
}
