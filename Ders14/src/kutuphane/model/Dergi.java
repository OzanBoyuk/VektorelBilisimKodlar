package kutuphane.model;

public class Dergi extends BaseModel{

	
	private String yayinSayisi;
	private String turu;
	private String yil;


	public String getYayinSayisi() {
		return yayinSayisi;
	}
	public void setYayinSayisi(String yayinSayisi) {
		this.yayinSayisi = yayinSayisi;
	}
	public String getTuru() {
		return turu;
	}
	public void setTuru(String turu) {
		this.turu = turu;
	}
	public String getYil() {
		return yil;
	}
	public void setYil(String yil) {
		this.yil = yil;
	}
	
	public Dergi( String yayinSayisi, String turu, String yil) {
	
		
		this.yayinSayisi = yayinSayisi;
		this.turu = turu;
		this.yil = yil;
	}
	
	
	
}
