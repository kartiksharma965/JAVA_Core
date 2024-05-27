package CH_13_Runtime_exception;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.util.Scanner;

public class Example_1 {
	
	/**  Arithmetic Exception = When we try divide any number by zero then we get Arithmetic exception. */
	
	public void test1() {
		int a =9/0;
	}
	
	
	public static void main(String[] args) {
		Example_1 obj = new Example_1();
		obj.test1();
	}
	
}
