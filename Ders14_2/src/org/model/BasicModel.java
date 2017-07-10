package org.model;

public class BasicModel {

	private int id;
	private String ad;
	
	public BasicModel() {
		// TODO Auto-generated constructor stub
	}
	
	public BasicModel(int id,String adi) {

		this.id=id;
		this.ad=adi;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAd() {
		return ad;
	}
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	
	
}
