package ornek1;

public class Kare implements Islem{

	int kenar;
	
	public Kare(int kenar) {
		this.kenar = kenar;
	}
	
	@Override
	public float cevreHesapla() {
		// TODO Auto-generated method stub
		
		
		
		return kenar*4;
	}

	@Override
	public float alanHesapla() {
		// TODO Auto-generated method stub
		return kenar*kenar;
	}

}
