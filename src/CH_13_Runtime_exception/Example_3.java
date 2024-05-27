package CH_13_Runtime_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Example_3 {
	
	/**  Out of Memory Exception
	 When we are creating array of type long. The Size that we give is long  will not take then we get error. */
	
	public void test1() {
		long a[]= new long [1000000000];
	}
	
	
	public static void main(String[] args) {
		Example_3 obj = new Example_3();
		obj.test1();
	}
	
}
