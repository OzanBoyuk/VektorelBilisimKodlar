
public interface Test extends Test2 {

	//static veya final variable
	//BOs methodlar tanımlanabilir.
	//default ile içi dolu methodlar Java( ile geldi
	//private kullanılmaz , protected kullanılabilir.
	
	public void ekranaYazdir(String mesaj);
	
	default void defaultMethod()
	{
		System.out.println("Default method");
	}

	public void test2method();
	
	
}
