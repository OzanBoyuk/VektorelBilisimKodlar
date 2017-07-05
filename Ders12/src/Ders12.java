import java.util.Scanner;

import org.controller.KaynakController;
import org.model.Dergi;
import org.model.Kaynak;
import org.model.Kitap;
import org.model.Yazar;

public class Ders12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		KaynakController kaynakController = new KaynakController();
		
		Kitap kitap = new Kitap();
		
	
		System.out.println("Kitap Adi :" );
		String kitapAdi = sc.next();
		kitap.kaynakAdi=kitapAdi;
		
		System.out.println("Kitap Id :" + kitap.kitapId);
		String kitapId = sc.next();
		kitap.kitapId=kitapId;
		
		
		System.out.println("Kitap ISBN :" + kitap.ISNO);
		String kitapISBN = sc.next();
		kitap.ISNO=kitapISBN;
		
		
		Yazar yazari = new Yazar();
		kitap.yazar = yazari;
		
		System.out.println("Kitap Yazar Adi :" );
		String yazarAdi = sc.next();
		kitap.yazar.yazarAdi = yazarAdi;
		
		System.out.println("Kitap Yazar yaþý :");
		String yazarYasi = sc.next();
		kitap.yazar.yazaryasi = yazarYasi;
		
		kaynakController.kaydet(kitap);
		
		Kaynak [] kaynaklar = new Kaynak[1];
		kaynaklar[0] = new Kaynak();
		kaynaklar[0] = kitap;
		
		/*Dergi dergi = new Dergi();
		System.out.println("Dergi Adi :" + dergi.kaynakAdi);
		System.out.println("Dergi Id :" + dergi.dergiId);
		Yazar yazari2 = new Yazar();
		dergi.yazar = yazari2;
		System.out.println("Dergi Yazar Adi :" + dergi.yazar.yazarAdi);
		System.out.println("Dergi Yazar yaþý :" + dergi.yazar.yazaryasi);
		
		kaynakController.kaydet(dergi);
		kaynaklar[1] = new Kaynak();
		kaynaklar[1] = kitap;*/
		
		kaynakController.listele(kaynaklar);
	}

}
