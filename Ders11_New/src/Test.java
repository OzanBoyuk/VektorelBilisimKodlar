
public interface Test extends Test2 {

	//static veya final variable
	//BOs methodlar tanýmlanabilir.
	//default ile içi dolu methodlar Java( ile geldi
	//private kullanýlmaz , protected kullanýlabilir.
	
	public void ekranaYazdir(String mesaj);
	
	default void defaultMethod()
	{
		System.out.println("Default method");
	}

	public void test2method();
	
	
}
