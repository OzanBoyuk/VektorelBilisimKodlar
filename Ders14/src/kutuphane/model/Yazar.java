package kutuphane.model;

public class Yazar extends BaseModel{


	private String soyadi;
	private String dogumYil;
	private String merkezi;
	
	public String getSoyadi() {
		return soyadi;
	}
	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}
	public String getDogumYil() {
		return dogumYil;
	}
	public void setDogumYil(String dogumYil) {
		this.dogumYil = dogumYil;
	}
	public String getMerkezi() {
		return merkezi;
	}
	public void setMerkezi(String merkezi) {
		this.merkezi = merkezi;
	}
	
	
	
	
}
