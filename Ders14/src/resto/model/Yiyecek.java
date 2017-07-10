package resto.model;

public class Yiyecek extends BasicModel{

	private int porsiyon=0;
	private String turu="";
	
	public int getPorsiyon() {
		return porsiyon;
	}
	public void setPorsiyon(int porsiyon) {
		this.porsiyon = porsiyon;
	}
	public String getTuru() {
		return turu;
	}
	public void setTuru(String turu) {
		this.turu = turu;
	}
	
	
}
