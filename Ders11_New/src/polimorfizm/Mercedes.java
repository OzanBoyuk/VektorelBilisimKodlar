package polimorfizm;

public class Mercedes implements Araba{

	public Mercedes() {
		System.out.println("Mercedes nesnesi �retildi.");
	}
	
	@Override
	public void freneBas() {
		System.out.println("Mercedes frene bast�.");
		
	}
	
	@Override
	public void gazaBas() {
		System.out.println("Mercede gaza bast�.");
		
	}
}
