/*
 * 05.07.2017 Sal� Encaps�lation (Kaps�lleme)
 */
public class Ders12_2 {

	public static void main(String[] args) {
		
		Yazar yazar = new Yazar();
		yazar.setAdi("Ozan");
		yazar.setSoyadi("B�Y�K");
		yazar.setId(1);
		
		System.out.println(yazar.getId() + " "+yazar.getAdi()+" " + yazar.getSoyadi());
		
	}
	
}
