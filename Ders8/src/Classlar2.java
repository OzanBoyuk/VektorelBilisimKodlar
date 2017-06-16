
public class Classlar2 {

	{
		System.out.println("Bos blok çalýþtýrýldý.");
		
	}
	static
	{
		System.out.println("Static method çalýþtýrýldý.");
	}
	
	public Classlar2() {
		System.out.println("Constructor çalýþtýrýldý.");
	}
	
	public void method1(){
		System.out.println("Method1 çalýþtýrýldý.");
		
	}
	
	public static void main(String[] args) {
		
		Classlar2 obje = new Classlar2(); // new lemezsem sadece static blok calýsýr. Çünkü classtan baðýmsýzdýr.
		obje.method1();
		//method1(); // direk bunu diyemem cunku main farklý bi methoddur izin vermez.
		
		
	}
}
