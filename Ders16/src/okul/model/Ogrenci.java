package okul.model;


import java.util.ArrayList;
import java.util.List;

public class Ogrenci extends BasicModel{

	private String tcNo;
	private String soyadi;
	private int ogrNo;
	private int sinif;
	private int bolum;
	private List<Ders> dersListesi = new ArrayList<>();
	
	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Ogrenci(int id, String ad, String tcNo, String soyadi, int ogrNo,int sinif,int bolum) {
		super(id, ad);
		this.tcNo = tcNo;
		this.soyadi = soyadi;
		this.ogrNo = ogrNo;
		this.sinif=sinif;
		this.bolum=bolum;
	}
	
	
	
	public int getSinif() {
		return sinif;
	}



	public void setSinif(int sinif) {
		this.sinif = sinif;
	}



	public int getBolum() {
		return bolum;
	}



	public void setBolum(int bolum) {
		this.bolum = bolum;
	}



	public String getTcNo() {
		return tcNo;
	}
	public void setTcNo(String tcNo) {
		this.tcNo = tcNo;
	}
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public int getOgrNo() {
		return ogrNo;
	}
	public void setOgrNo(int ogrNo) {
		this.ogrNo = ogrNo;
	}
	public List<Ders> getDersListesi() {
		return dersListesi;
	}
	public void setDersListesi(List<Ders> dersListesi) {
		this.dersListesi = dersListesi;
	}
	
	
	
}
