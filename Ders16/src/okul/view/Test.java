package okul.view;

import java.util.Scanner;

import okul.model.Bolum;
import okul.util.Utilsim;

public class Test {

	public static void main(String[] args) {
		
		Initializer initializer = new Initializer();
		
		Scanner sc = new Scanner(System.in);

		for (Bolum bolum : Utilsim.bolumList) {
			
			System.out.println("Bolum ýd: "+bolum.getId() + " Bolum Adý :" +bolum.getAd());
			
		}
		
	}

}
