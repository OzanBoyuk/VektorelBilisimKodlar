
public class Ders11 implements Test{//ister Test ten Test2 yi extends et ister Test,Test2 þeklinde yaz

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ders11 ders = new Ders11();
		
		ders.ekranaYazdir("merhaba arayüz");
		ders.defaultMethod();
		ders.test2method();
		
		
	}

	@Override
	public void ekranaYazdir(String mesaj) {
		// TODO Auto-generated method stub
		System.out.println(mesaj);
	}

	@Override
	public void test2method() {
		// TODO Auto-generated method stub
		
	}

	

	

}
