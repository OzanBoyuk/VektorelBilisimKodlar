package com.test1;
import com.test2.ExampleC;

/*21.06.2017 �ar�amba*/
public class Ders10 {
//T�m class lar Object s�n�f�ndan miras al�r.
	public static void main(String[] args) {
		
		ExampleA example = new ExampleA();
		example.method2(); // public oldugu i�in g�r�r
		
		ExampleB exampleB = new ExampleB();
		exampleB.method2(); //exampleB. deyince c�kan methodlar Object s�n�f�ndan gelen mirastan dolay�d�r.

		ExampleC exampleC = new ExampleC();
		exampleC.method3(); // protected ama g�r�yo neden? ��nk� cag�rd�g� s�n�fla A ayn� paket i�erisinde
	
	}
}
