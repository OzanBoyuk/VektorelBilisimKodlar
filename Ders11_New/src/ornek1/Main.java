package ornek1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Kare kare = new Kare(3);
		System.out.println("kare alan:" + kare.alanHesapla());
		System.out.println("kare cevre:" + kare.cevreHesapla());
		
		Cember cember = new Cember(3);
		System.out.println("cember alan:" + cember.alanHesapla());
		System.out.println("cember cevre:" + cember.cevreHesapla());
		
	}

}
