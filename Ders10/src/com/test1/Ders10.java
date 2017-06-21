package com.test1;
import com.test2.ExampleC;

/*21.06.2017 Çarþamba*/
public class Ders10 {
//Tüm class lar Object sýnýfýndan miras alýr.
	public static void main(String[] args) {
		
		ExampleA example = new ExampleA();
		example.method2(); // public oldugu için görür
		
		ExampleB exampleB = new ExampleB();
		exampleB.method2(); //exampleB. deyince cýkan methodlar Object sýnýfýndan gelen mirastan dolayýdýr.

		ExampleC exampleC = new ExampleC();
		exampleC.method3(); // protected ama görüyo neden? Çünkü cagýrdýgý sýnýfla A ayný paket içerisinde
	
	}
}
