
public class Classlar2 {

	{
		System.out.println("Bos blok �al��t�r�ld�.");
		
	}
	static
	{
		System.out.println("Static method �al��t�r�ld�.");
	}
	
	public Classlar2() {
		System.out.println("Constructor �al��t�r�ld�.");
	}
	
	public void method1(){
		System.out.println("Method1 �al��t�r�ld�.");
		
	}
	
	public static void main(String[] args) {
		
		Classlar2 obje = new Classlar2(); // new lemezsem sadece static blok cal�s�r. ��nk� classtan ba��ms�zd�r.
		obje.method1();
		//method1(); // direk bunu diyemem cunku main farkl� bi methoddur izin vermez.
		
		
	}
}
