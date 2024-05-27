package CH_13_Runtime_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Example_4 {
	
	/**  Illegal state exception
	 This exception is thrown in order to indicate that a method has been passed an illegal or in appropriate argument */
	
	public void test1() {
		String s ="Hello World";
		Scanner scn= new  Scanner(s);
		System.out.println(scn.nextLine());
		scn.close();
		/** we have closed scanner class.We are trying to access method after closing.
		    Hence we are getting Illegal state exception.  */
		System.out.println(scn.nextLine());
	}
	
	public static void main(String[] args) {
		Example_4 obj = new Example_4();
		obj.test1();
	}
	
}
