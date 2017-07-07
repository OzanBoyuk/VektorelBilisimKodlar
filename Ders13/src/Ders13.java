import java.io.File;
import java.io.IOException;

public class Ders13 {

	public static void main(String[] args) throws IOException {
		
		String path="C:\\Users\\vektorel\\Desktop\\File1\\test.txt";
		File file = new File(path);
		System.out.println(file.canExecute()); //verilen dosya uzant�s� �al��t�r�labilir mi
		
		System.out.println(file.exists());//dosya var m�
		System.out.println(file.createNewFile());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.isDirectory());
		//file.delete();
		System.out.println(file.getName());
		System.out.println(file.getParentFile());
		System.out.println(file.listFiles());
		System.out.println(file.lastModified());
		System.out.println(file.getParent());
		System.out.println(file.list());
		
		//file.list(); // dizin i�indeki dizinlerin ve dosyalar�n isimlerini verir
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		
	}
	
}
