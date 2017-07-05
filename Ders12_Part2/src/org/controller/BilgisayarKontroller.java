package org.controller;

import org.model.BasicModel;
import org.model.Laptop;

import com.sun.xml.internal.ws.org.objectweb.asm.Label;

public class BilgisayarKontroller implements Controller{

	private Laptop [] laptoplar = new Laptop[100];
	
	private  int index = 0;
	
	@Override
	public void kaydet(BasicModel basicModel) {
		
		if (basicModel instanceof Laptop) {
			
			Laptop laptop = (Laptop) basicModel;	
			
			laptoplar[index] = laptop;
			
		}
		
	}

	@Override
	public void listele(BasicModel basicModel) {
		
	if (basicModel instanceof Laptop) {
		
		String dok="";
		
			
			for (int i = 0; i < laptoplar.length; i++) {
				if (laptoplar[i] != null) {
					
					if (laptoplar[i].isDokunmatik()==true) {
						dok = "Dokunmatik";
					}
					else {
						dok = "Dokunmatik deðil.";
					}
					
					System.out.println("Ýslemci gücü :"+laptoplar[i].getIslemciGucu() + "\n"
							+"Ýslemci gücü :"+ laptoplar[i].getMarka() + "\n"
							+"Ýslemci gücü :"+laptoplar[i].getIslemciGucu() + "\n"
							+"Boyut :"+laptoplar[i].getBoyut() + "\n"
							+"Renk :"+laptoplar[i].getRenk() + "\n"
							+"Dokunmatik durumu:"+ dok + "\n"
							+"Kamera tipi :"+laptoplar[i].getKameraTipi() + "\n");
				}
				
				
			}
			
			
		}
		
	
		
	}
	
	

}
