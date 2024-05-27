package CH_13_Runtime_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Example_5 {

	/**  Null Pointer exception
	 When we try to perform action on class, variable or object that is not initialized then we get error. */

	// S1 value is not initialized. Hence s1 hold Null value.
	static String s1; 
	public void test1() {
		System.out.println(s1.concat("Shreedhar"));
		// Hence null point exception will occurs.
	}

	public static void main(String[] args) {
		Example_5 obj = new Example_5();
		obj.test1();
	}

}
