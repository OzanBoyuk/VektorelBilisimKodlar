import java.awt.Desktop;
import java.awt.Frame;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Ornek {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\vektorel\\Desktop\\File1");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Kelime gir:");
		String aranacak = sc.next();
		
		File [] fileDizisi ;
		fileDizisi=file.listFiles();
		
		//System.out.println(fileDizisi[0].getName());
		
	
	    
		
		for (int i = 0; i < fileDizisi.length; i++) {
			if (fileDizisi[i].getName().equals(aranacak) ) {
				
				File file2 = new File(file.getAbsolutePath()+"\\"+aranacak);
				
				Desktop desktop = Desktop.getDesktop();
		        if(file2.exists()) {
		        	desktop.open(file2);
		        }
		        
		        
		      
				
			}
		}
		
		sc.close();
		
	}
	
}
