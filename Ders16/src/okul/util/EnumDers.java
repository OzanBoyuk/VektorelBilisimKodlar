package okul.util;

public enum EnumDers {

	MATEMATIK(1,"Matematik",3,1),
	KIMYA(2,"Kimya",2,1),
	YAZILIMMIMARI(3,"Yazýlým Mimarý",4,3),
	AGSISTEM(4,"AGSISTEM",3,2),
	OTOMATA(5,"OTOMATA",4,3);
	
	private int id;
	private String adi;
	private int kredisi;
	private int donem;
	
	
	
	private EnumDers(int id, String adi, int kredisi, int donem) {
		this.id = id;
		this.adi = adi;
		this.kredisi = kredisi;
		this.donem = donem;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdi() {
		return adi;
	}
	public void setAdi(String adi) {
		this.adi = adi;
	}
	public int getKredisi() {
		return kredisi;
	}
	public void setKredisi(int kredisi) {
		this.kredisi = kredisi;
	}
	public int getDonem() {
		return donem;
	}
	public void setDonem(int donem) {
		this.donem = donem;
	}
	

	
	
	


	
	
}
