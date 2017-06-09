
public class Konu3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Array tanýmý
		
		int  dizi [] = new int [5];
		int [] dizi2 = new int [3];
		
		dizi[0] = 5 ;
		dizi[1] = 10;
		dizi[2] = 15;
		dizi[3] = 20;
		dizi[4] = 25;
		
		//System.out.println(dizi[4]);
		
		int cokBoyutlu[][] = new int [2][5];
		
		cokBoyutlu[0][0] = 1 ;
		cokBoyutlu[0][1] = 2 ;
		cokBoyutlu[0][2] = 3 ;
		cokBoyutlu[0][3] = 4 ;
		cokBoyutlu[0][4] = 5 ;
		
		cokBoyutlu[1][0] = 1 ;
		cokBoyutlu[1][1] = 2 ;
		cokBoyutlu[1][2] = 3 ;
		cokBoyutlu[1][3] = 4 ;
		cokBoyutlu[1][4] = 5 ;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("["+i+"]["+j+"]= "+ cokBoyutlu[i][j]);
			}
			System.out.println();
			
		}
		
		
		
		int []cokBOyutlu2[] = new int [2][5];
		int [][] cokBoyutlu3 = new int [2][5];
		
		//////iki satýr var ama sutun sayýsý belli deðil
		int cokBoyutlu4[][] = new int [2][];
		cokBoyutlu4[0] = new int[2]; // ilk satýrý 2 ye böldüm
		cokBoyutlu4[0][0] = 17 ;
		cokBoyutlu4[0][0] = 15 ;
		
		cokBoyutlu4[1] = new int [3]; // ikinci satýrý 3 e böldüm
		cokBoyutlu4[1][0] = 3 ;
		cokBoyutlu4[1][0] = 6 ;
		cokBoyutlu4[1][0] = 9 ;
		
		
		char [][] cDizisi = new char [3][2];
		
		cDizisi[0][0] = 'a' ;
		cDizisi[0][1] = 'b' ;
		
		cDizisi[1][0] = 'c' ;
		cDizisi[1][1] = 'd' ;
		
		
		cDizisi[2][0] = 'e' ;
		cDizisi[2][1] = 'f' ;
		
		System.out.println("\n");
		System.out.print(cDizisi[0][0]);
		System.out.println(cDizisi[0][1]);
		
		System.out.print(cDizisi[1][0]);
		System.out.println(cDizisi[1][1]);
		
		System.out.print(cDizisi[2][0]);
		System.out.print(cDizisi[2][1]);
		
		
		int dizi8[][][] = new int [3][][];
		dizi8[0] = new int[2][];
		dizi8[0][0] = new int[3] ;
		
		
		
		
		
		
	}

}
