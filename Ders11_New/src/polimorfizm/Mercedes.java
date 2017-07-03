package polimorfizm;

public class Mercedes implements Araba{

	public Mercedes() {
		System.out.println("Mercedes nesnesi üretildi.");
	}
	
	@Override
	public void freneBas() {
		System.out.println("Mercedes frene bastý.");
		
	}
	
	@Override
	public void gazaBas() {
		System.out.println("Mercede gaza bastý.");
		
	}
}
