import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class InputExample {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\example.txt");
		File output = new File("C:\\output.txt");
				
		FileInputStream fileInputStream = new FileInputStream(file);
		FileOutputStream fileOutputStream = new FileOutputStream(output);
		
		if (!output.exists()) {
			output.createNewFile();
		}
		
		int c=0;
		
		while ((c=fileInputStream.read())!=-1) {
			System.out.print( (char) c);
			fileOutputStream.write(c);
		}
		
		
		fileInputStream.close();
		
		
	}
	
}
