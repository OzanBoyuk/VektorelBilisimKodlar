
public class Classlar2 {

	{
		System.out.println("Bos blok çalıştırıldı.");
		
	}
	static
	{
		System.out.println("Static method çalıştırıldı.");
	}
	
	public Classlar2() {
		System.out.println("Constructor çalıştırıldı.");
	}
	
	public void method1(){
		System.out.println("Method1 çalıştırıldı.");
		
	}
	
	public static void main(String[] args) {
		
		Classlar2 obje = new Classlar2(); // new lemezsem sadece static blok calısır. Çünkü classtan bağımsızdır.
		obje.method1();
		//method1(); // direk bunu diyemem cunku main farklı bi methoddur izin vermez.
		
		
	}
}
