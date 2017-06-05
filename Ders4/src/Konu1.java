/*05.06.2017 Çarþamba Konu:Döngüler*/
public class Konu1 {

	//ctrl+shift+f kodu düzenler
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * -----Loops *for *while *do-while
		 * 
		 * for(int i=0; i<10 && k>10 ; i++)
		 * {
		 *  //Code blocks
		 * }
		 * 
		 * foreach----->syntax ý yok onun yerine 
		 * 
		 * for(Object obje : liste){
		 * 
		 * }
		 * 
		 * 
		 */
		

		for (int i = 0; i < 10; i++) {
			System.out.print(i+1);
		}

		System.out.println("\nFor ile dizi yazdirma");
	
		int dizi [] = {2,5,6,7,8 }; //init
		
		
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(dizi[i]);
		}
		
		System.out.println("\nFor each ile dizi yazdirma");
		
		for (Integer diziElemani : dizi) {
			System.out.print(diziElemani);
		}
	}

}
