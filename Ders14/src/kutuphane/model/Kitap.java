package kutuphane.model;

public class Kitap extends BaseModel{

	
	private String ISBN;
	private String turu;
	
	public Kitap( String iSBN, String turu) {
		super();
	
		ISBN = iSBN;
		this.turu = turu;
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
