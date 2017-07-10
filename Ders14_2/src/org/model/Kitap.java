package org.model;

public class Kitap extends BasicModel{

	private String ISBN;
	private String turu;
	
	private Yazar yazar;
	
	

	public Kitap() {
		// TODO Auto-generated constructor stub
	}
	
	public Kitap(int id,String adi,String iSBN, String turu, Yazar yazar) {
		super(id,adi);
		ISBN = iSBN;
		this.turu = turu;
		this.yazar = yazar;
	}
	public Yazar getYazar() {
		return yazar;
	}
	public void setYazar(Yazar yazar) {
		this.yazar = yazar;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTuru() {
		return turu;
	}
	public void setTuru(String turu) {
		this.turu = turu;
	}
	
	
	
}
