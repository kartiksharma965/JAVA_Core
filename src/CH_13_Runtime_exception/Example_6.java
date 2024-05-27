package CH_13_Runtime_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Example_6 {

	/**  Number format Exception
	 When we try to 'parse a number' which is not compatible then we get this error. */ 

	static String s1="test";
	public void test1() {
		int t =Integer.parseInt(s1);
		//We are parsing string value to integer. Hence number format error is displayed.
	}

	public static void main(String[] args) {
		Example_6 obj = new Example_6();
		obj.test1();	
	}

}
