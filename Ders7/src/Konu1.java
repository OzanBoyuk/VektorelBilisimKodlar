/*14.06.2017 �ar�amba*/
public class Konu1 {

	/*--Referans veri tipleri = String,Arraylist
	 * String ��lemleri:
	 * 
	 * String isim = "JAVA";
	 * String isim = new String();
	 * 
	 * StringBuilder (Java 8 ile geldi.)
	 * 
	 * 
	 * */
	
	public static void main(String[] args) {
		String isim = "Java";
		
		
		System.out.println(isim);
		
		isim = isim.substring(1); // 1. indexten ve sonras�
		
		int uzunluk = isim.length();
		
		System.out.println(uzunluk);
		
		isim.trim(); //bastaki ve sondaki bosluklar� siler
		
		char c = isim.charAt(2);
		System.out.println(c);
		
		System.out.println(isim.codePointAt(1));
		
		System.out.println(isim.compareTo("va"));
		
		isim = isim.concat("Developer");
		System.out.println(isim);
		
		
		boolean isEsit = isim.equals("avaDeveloper");
		
		String isim1 =new String("Ahmet");
		String isim2 = new String("Ahmet");
		
		if (isim1.equals(isim2)) { //biri valuebiri hascode kars�last�r�r bunu arast�r.
			System.out.println("E�it");
		}else {
			System.out.println("E�it de�il");
		}
		
		if (isim1==isim2) {
			System.out.println("E�it");
		}else {
			System.out.println("E�it de�il");
		}
		
		
		String test = "Vektorel";
		String temp="";
		
		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) != 'e' ) {
				temp = temp + test.charAt(i);
			}
		}
		
		System.out.println(test);
		
		isim.startsWith("asd");
		
		isim.split("#"); //geriye string dizi d�nd�r�r.
		
		
	}
	
}
