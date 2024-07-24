package CH_26_String;

import java.util.Arrays;
/**
 *  Program :- Reverse String.
 *  
 *  String class does not have reverse() method.
 *  StringBuilder and StringBuffer class have reverse() method.
 */

public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		test4();
	}


	public static void test1() {
		// Methods 1:- used Length() , charAt();

		String s = "Selenium";
		String rev=""; // empty string.

		for(int i = s.length()-1; i>=0 ;i--) 
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(" Reverse string :="+rev);
	}

	public static void test2() {
		// Method 2:- By converting string to char array.

		String s ="Selenium";
		String rev=""; // empty string.

		char a[] = s.toCharArray(); // Converting string to character array.
		System.out.println(Arrays.toString(a)); // display all records of Array(a).

		for(int i=a.length-1;i>=0;i--) {
			rev=rev+a[i];
		}
		System.out.println("Reverse String :="+rev);	
	}

	public static void test3() {
		StringBuffer s = new StringBuffer("Selenium");
		System.out.println(s.reverse());
	}

	public static void test4() {
		StringBuilder s = new StringBuilder("Selenium");
		System.out.println(s.reverse());
	}

}
