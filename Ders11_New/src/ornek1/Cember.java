package ornek1;

public class Cember implements Islem {

	float yariCap ;
	
	public Cember(float yariCap) {
		this.yariCap = yariCap;
	}
	
	@Override
	public float cevreHesapla() {
		// TODO Auto-generated method stub
		return (float) ((3.14)*2*yariCap);
	}

	@Override
	public float alanHesapla() {
		// TODO Auto-generated method stub
		return (float) (3.14*yariCap*yariCap);
	}

}
