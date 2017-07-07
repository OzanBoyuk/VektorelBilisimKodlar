import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Scanner;



import javafx.scene.transform.Scale;

public class Ornek2 {

	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		Kitap kitap = new Kitap();
		System.out.println("Kitap id:");
		kitap.setId(sc.nextInt());
		System.out.println("Kitap adý:");
		kitap.setKitapAdi(sc.next());
		Yazar yazar = new Yazar();
		kitap.setYazar(yazar);
		
		System.out.println("Yazar adý:");
		kitap.getYazar().setYazarAdi(sc.next());
		System.out.println("Yazar soyadý:");
		kitap.getYazar().setYazarSoyadi(sc.next());
		
		File file = new File("C:\\kitap.txt");
		
		if (!file.exists()) {
			file.createNewFile();
		}
		
		FileWriter flWriter = new FileWriter(file);
		//BufferedWriter bfReader = new BufferedWriter(flWriter);
		
		flWriter.write(""+kitap.getId());
		flWriter.write(kitap.getKitapAdi());
		flWriter.write(kitap.getYazar().getYazarAdi());
		flWriter.write(kitap.getYazar().getYazarSoyadi());
		
		flWriter.close();
		
		Field field [] = Yazar.class.getDeclaredFields();
		
		for (int i = 0; i < field.length; i++) {
			System.out.println(field[i].getName().toUpperCase()+"" + field[i].getType().getName());
		}
		
				
	}
	
}
