package com.test;

public class Personel {

	public String adi = "";
	public String soyadi = "";
	public int sicilNo= 0;

	public Adres adres [] ;
	
	public Personel() {
		// TODO Auto-generated constructor stub
	}
	
	public Personel(int arg) {
		
		adres = new Adres[arg];
	}



	public String getAdi() {
		return adi;
	}



	public void setAdi(String adi) {
		this.adi = adi;
	}



	public String getSoyadi() {
		return soyadi;
	}



	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}



	public int getSicilNo() {
		return sicilNo;
	}



	public void setSicilNo(int sicilNo) {
		
		this.sicilNo = sicilNo;
	}



	public int maasHesapla()
	{
		return (int) ( Math.random()*1000 );
	}
}
