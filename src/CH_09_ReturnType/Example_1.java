package CH_09_ReturnType;
/*
 * Return Type = Output return by method is called as Return Type.
 * 
 * String is sequence of character. It is specified by double quote (" ").
 * Character is single character. It is specified by single quote (' ').
 */

public class Example_1 {

	void test1() {
		System.out.println("I am method 'test1()' ");
	}
	
	int test2() {
		System.out.println("I am method 'int test2()' ");
		return 3;
	}
	
	double test3() {
		System.out.println("I am method 'double test3()' ");
		return 3.3;
	}
	
	char test4() {
		System.out.println("I am method 'char test4()' ");
		return 'k';
	}
	
	String test5() {
		System.out.println("I am method 'String test5()' ");
		return "OHM";
	}
	
	boolean test6() {
		System.out.println("I am method 'boolean test6()' ");
		return true;
	}
	
	Example_1 test7() {
		System.out.println("I am method 'Example_1 test7()'");
		return new Example_1();
	}
	public static void main(String[] args) {
		System.out.println("##  Invoking all Return type methods  ##");
	 	Example_1 obj = new Example_1();
	 	obj.test1();
	 	obj.test2();
	 	obj.test3();
	 	obj.test4();
	 	obj.test5();
	 	obj.test6();
	 	obj.test7();
	}
}
