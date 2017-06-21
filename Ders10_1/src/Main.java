
public class Main {

	public static void main(String[] args) {

		Araba araba = new Araba();
		araba.freneBas();
		araba.gazaBas();
		araba.vitesAt();

		BMW bmw = new BMW();
		bmw.zenonYaz();
		bmw.freneBas();
		bmw.gazaBas();
		bmw.vitesAt();

		Mercedes mercedes = new Mercedes();
		mercedes.cruiseKontrolCalistir();
		mercedes.freneBas();
		mercedes.gazaBas();
		mercedes.vitesAt();
	}

}
