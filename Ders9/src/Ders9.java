import java.util.Scanner;

import org.adress.Adreess;
import org.model.Book;
import org.tool.Author;

/*19.06.2017 Pazartesi*/
/**
 * 
 * @author vektorel
 *
 */
/**
 * Student classý yarat
 * adý,soyadý ,nosu
 * 1.adýný yazdýran method
 * 2.nosunu döndür
 *
 */
public class Ders9 {

	
	
	public static void main(String[] args) {
		
/*		Student student = new Student("Ozan","Böyük",7578);
	
		student.adiYazdir();
		System.out.println("Öðrencinin Nosu : "+student.noDondur());*/
		
		Scanner sc =new  Scanner(System.in);
		
		Book book = new Book();
		System.out.println("Kitap adý girin : ");		
		book.adi = sc.next();
		System.out.println("ISBN adý girin : ");	
		book.ISBN= sc.next();
		
		Author author = new Author();
		System.out.println("Yazar adý girin : ");
		author.yazarAdi = sc.next();
		System.out.println("Dogum yili girin : ");
		author.dogumYili = sc.next();
		
		
		book.author = author;
		
		Adreess address []  = new Adreess[2];
		System.out.println("1. Adress girin : ");
		address[0] = new Adreess();
		address[0].il = sc.next();
		address[1] = new Adreess();
		System.out.println("2. Adress girin : ");
		address[1].il = sc.next();
		
		
		author.address = address;
			
		book.birlestir();
		
		
		
	}
	
}
