package polimorfizm;

public class BMW implements Araba{

	public BMW() {
		System.out.println("BMW nesnesi �retildi.");
	}
	
	@Override
	public void gazaBas() {
		System.out.println("BMW gaza bast�.");
		
	}
	
	@Override
	public void freneBas() {
		System.out.println("BMW frene bast�.");
		
	}
	
	public void yeni()
	{
		//bunu g�remez
	}
	
}
