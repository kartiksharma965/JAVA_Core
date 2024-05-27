package CH_13_Runtime_exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Example_2 {
	
	/**  Array Index out of Bond Exception
	 When we try to access array more then size declared the we get error. */
	
	public void test1() {
		int a[] = new int[5];
		System.out.println(a[6]);
	}
	
	public static void main(String[] args) {
		Example_2 obj = new Example_2();
		obj.test1();
	
	}
	
}
