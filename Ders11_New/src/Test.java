
public interface Test extends Test2 {

	//static veya final variable
	//BOs methodlar tan�mlanabilir.
	//default ile i�i dolu methodlar Java( ile geldi
	//private kullan�lmaz , protected kullan�labilir.
	
	public void ekranaYazdir(String mesaj);
	
	default void defaultMethod()
	{
		System.out.println("Default method");
	}

	public void test2method();
	
	
}
