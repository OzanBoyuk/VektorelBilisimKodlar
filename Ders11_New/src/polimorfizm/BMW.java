package polimorfizm;

public class BMW implements Araba{

	public BMW() {
		System.out.println("BMW nesnesi üretildi.");
	}
	
	@Override
	public void gazaBas() {
		System.out.println("BMW gaza bastý.");
		
	}
	
	@Override
	public void freneBas() {
		System.out.println("BMW frene bastý.");
		
	}
	
	public void yeni()
	{
		//bunu göremez
	}
	
}
