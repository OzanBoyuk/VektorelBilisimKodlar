package hocacozumu;

public class Kare extends IslemImp{

	@Override
	public float alanHesapla(int... params) {
		
		return params[0]*params[0];
	}
	
	@Override
	public float cevreHesapla(int... params) {
		// TODO Auto-generated method stub
		return 4*params[0];
	}
	
	@Override
	public void sonucuYazdir(String sonuc) {
		// TODO Auto-generated method stub
		System.out.println(sonuc);
	}
	
}
