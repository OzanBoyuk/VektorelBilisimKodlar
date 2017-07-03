package polimorfizm;

public class Main {

	public static void main(String[] args) {
		
		//BMW bmw = new BMW(); // normalde
		
		Araba araba = new BMW(); // polimorfizm
		araba.freneBas();
		araba.gazaBas();
		
		
		araba = new Mercedes();
		
		araba.freneBas();
		araba.gazaBas();
	}
	
}
