package org.test;

import org.controller.BilgisayarKontroller;
import org.model.Bilgisayar;
import org.model.Laptop;

public class Test {

	public static void main(String[] args) {
		
		BilgisayarKontroller bilgisayarKontroller = new BilgisayarKontroller();
		
		Laptop laptop = new Laptop();
		laptop.setIslemciGucu("1200");
		laptop.setMarka("Casper");
		laptop.setBoyut("12inç");
		laptop.setRenk("Siyah");
		laptop.setKameraTipi("Bluetooth");
		
	
		
		bilgisayarKontroller.kaydet(laptop);
		bilgisayarKontroller.listele(laptop);
		
		System.out.println();
		
		Laptop laptop2 = new Laptop();
		laptop2.setIslemciGucu("1500");
		laptop2.setMarka("Asus");
		laptop2.setBoyut("15inç");
		laptop2.setRenk("Sarý");
		laptop2.setKameraTipi("Kablolu");
		laptop2.setDokunmatik(false);
		
		bilgisayarKontroller.kaydet(laptop2);
		bilgisayarKontroller.listele(laptop2);
	}
	
}
