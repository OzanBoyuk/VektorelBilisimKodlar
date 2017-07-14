package okul.model;

public class Ders extends BasicModel{

	private int kredisi;
	private int donem;
	
	
	public Ders() {
		// TODO Auto-generated constructor stub
	}
	
	public Ders(int id, String ad, int kredisi, int donem) {
		super(id, ad);
		this.kredisi = kredisi;
		this.donem = donem;
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
