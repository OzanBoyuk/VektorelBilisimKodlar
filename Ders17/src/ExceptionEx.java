
public class ExceptionEx {

	public static void main(String[] args) {
		
		
		int sonuc=0;
		int sayi1 = 2 ;
		int sayi2 = 1;
		
		try {
			
			if (sayi2 == 0) {
				throw new MyException("Hata : Payda sýfýr olamaz.");
			}
			else {
				sonuc = sayi1/sayi2;
			}
			
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Sonuc :" +  sonuc);
	}
	
}
