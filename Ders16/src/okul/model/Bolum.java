package okul.model;

public class Bolum extends BasicModel{

	private int fakulte;

	
	public Bolum() {
		// TODO Auto-generated constructor stub
	}
	
	
	
	public Bolum(int id,String adi,int fakulte) {
		super(id,adi);
		this.fakulte = fakulte;
	}

	public int getFakulte() {
		return fakulte;
	}

	public void setFakulte(int fakulte) {
		this.fakulte = fakulte;
	}
	
	
	
}
