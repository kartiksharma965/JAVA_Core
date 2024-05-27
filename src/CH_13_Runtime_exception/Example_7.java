package CH_13_Runtime_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Example_7 {
	
	/**  File not format Exception
	 When wrong path is provided then file not found exception occurs.
	 Since file is not present in defined path.*/
	
	public void test1() throws FileNotFoundException {
		FileReader file= new FileReader("c://hello.java");
		// In case wrong path is provided then 'file not found exception' occurs.
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		Example_7 obj = new Example_7();
		obj.test1();
	}
	
}
