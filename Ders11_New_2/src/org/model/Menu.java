package org.model;

import org.controller.Controller;

public class Menu implements Controller{

	public String adi;
	public String fiyat;
	@Override
	public void kaydet(Menu menu) {
		
		if (menu instanceof Yiyecek) {
			System.out.println(((Yiyecek) menu).porsiyon+  " porsiyon " +menu.adi+" " + menu.fiyat);
			//System.out.println("Icecek kaydedildi.");
			
		}
		
		if (menu instanceof Icecek) {
			
			System.out.println(menu.adi+" " + menu.fiyat);
			//System.out.println("Icecek kaydedildi.");
		}
		
	}
	@Override
	public void sil(Menu menu) {
		
		if (menu instanceof Yiyecek) {
			System.out.println("Yiyecek silindi.");
		}
		
		if (menu instanceof Icecek) {
			System.out.println("Icecek silindi.");
		}
		
	}
	
}
