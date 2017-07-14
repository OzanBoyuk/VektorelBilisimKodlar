import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import okul.model.Ders;
import okul.model.Ogrenci;

//
public class Ders16 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		

		HashMap<Ogrenci, List<Ders>> ogrenciDers = new HashMap<>();
		
		List<Ders> dersler = new ArrayList<>();
		
		boolean devamMi=true;
		
		while (devamMi) {
			
			
			Ogrenci ogr = new Ogrenci();///Ogrenciler
			
			System.out.println("Ogrenci id gir :");
			ogr.setId(sc.nextInt());
			
			System.out.println("Ogrenci adi gir : ");
			ogr.setAd(sc.next());
			
			System.out.println("Ogrenci soyadi gir :");
			ogr.setSoyadi(sc.next());
			
			System.out.println("Ogrenci tc gir :");
			ogr.setTcNo(sc.next());
			
			System.out.println("Ogrenci No gir :");
			ogr.setOgrNo(sc.nextInt());
			
			System.out.println("Ders girmek için 1 e bas:");
			if (sc.next().equals("1")) {
				
				boolean devamMi2=true;
				while (devamMi2) {
					Ders ders = new Ders(); ///Dersler
					
					System.out.println("Ders id gir:");
					ders.setId(sc.nextInt());
					
					System.out.println("Ders adi gir : ");
					ders.setAd(sc.next());
					
					System.out.println("Ders kredi gir :");
					ders.setKredisi(sc.nextInt());
					
					dersler.add(ders);
					
					System.out.println("Ders eklemeye devam etmek için 1 ' e bas : ");
					if (!sc.next().equals("1")) {
						devamMi2=false;
					}
				}
				
				ogrenciDers.put(ogr, dersler);
				
			}
			
			
			
			
		}
		
		
	}

}
