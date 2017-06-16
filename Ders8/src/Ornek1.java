/*16.06.2017 Cuma*/

public class Ornek1 {

	public static void main(String[] args) {
		
		String metin = "Java, Sun Microsystems mühendislerinden James Gosling tarafýndan "+
				"geliþtirilmeye baþlanmýþ açýk kodlu, nesneye yönelik, zeminden baðýmsýz, yüksek verimli," +
				" çok iþlevli, yüksek seviye, adým adým iþletilen (yorumlanan-interpreted) bir dildir."+
				"Java, Sun Microsystems'den James Gosling tarafýndan geliþtirilen bir programlama dilidir ";
		
		
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
