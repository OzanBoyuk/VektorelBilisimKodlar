package org.model;
import org.adress.Adreess;
import org.tool.Author;

import com.sun.jndi.cosnaming.IiopUrl.Address;

public class Book {

	public String adi = "";
	public String ISBN = "" ;
	public Author  author=null;
	
	
	public void birlestir(){
	
		System.out.print("Yazar: " + author.yazarAdiDondur() + " " + author.dogumYili +  "\nKitap Adi :" + this.adi+" "+this.ISBN  +" Adress :"+ author.address[0].il);
		System.out.println("\n2. adress"+ author.address[1].il);
	}
	
}
