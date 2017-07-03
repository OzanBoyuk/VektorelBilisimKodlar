package hocacozumu;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kare kare = new Kare();
		
		float alan = kare.alanHesapla(new int[]{3});// int kenar[] = new int[1]; kenar[0] = 3; ile ayný
		float cevre = kare.cevreHesapla(new int[]{3});
		
		System.out.println("Kare alaný = "+String.valueOf(alan));
		System.out.println("Kare cevresi = "+String.valueOf(cevre));
		
	}

}
