package org.model;

public class Yazar extends BasicModel {

	private String soyadi;
	private int yil;
	private String memlketi;
	
	public Yazar() {
		// TODO Auto-generated constructor stub
	}
	
	public Yazar(int id,String adi,String soyadi,int yil,String memleketi) {
		super(id,adi);
		this.soyadi=soyadi;
		this.yil=yil;
		this.memlketi=memleketi;
	}
	
	
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public int getYil() {
		return yil;
	}
	public void setYil(int yil) {
		this.yil = yil;
	}
	public String getMemlketi() {
		return memlketi;
	}
	public void setMemlketi(String memlketi) {
		this.memlketi = memlketi;
	}
	
	
	
}
