/*16.06.2017 Cuma*/

public class Ornek1 {

	public static void main(String[] args) {
		
		String metin = "Java, Sun Microsystems m�hendislerinden James Gosling taraf�ndan "+
				"geli�tirilmeye ba�lanm�� a��k kodlu, nesneye y�nelik, zeminden ba��ms�z, y�ksek verimli," +
				" �ok i�levli, y�ksek seviye, ad�m ad�m i�letilen (yorumlanan-interpreted) bir dildir."+
				"Java, Sun Microsystems'den James Gosling taraf�ndan geli�tirilen bir programlama dilidir ";
		
		
		String [] dizi = metin.split(" ");
		
		for (int i = 0; i < dizi.length; i++) {
			
			if (dizi[i].toUpperCase().contains("JAVA")) {
				dizi[i] = "xxxx";
			}else {
				continue;
			}
			
			}
			
		for (int i = 0; i < dizi.length; i++) {
					
				System.out.println(dizi[i]);
		}
		
	}
	
}
