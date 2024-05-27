package CH_13_Runtime_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Example_8 {
	
	/**  Class not found Exception
	 'Class.forName()' this will look for class in java file or offshore project.
	 Class should be present some where .
	 Class is class.
	 forName is method.*/
	
	
	public void test1() throws ClassNotFoundException {
		Class.forName("test");
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		Example_8 obj = new Example_8();
		obj.test1();
		}
	
}
