package CH_04_Method_Overloading;
/*
 * Method Overloading by changing 'Type of Argument'
 */

public class Example_2 {
	
	void test() {
	System.out.println("I am from method test()");
	}
	
	void test(int a) {
	System.out.println("I am from method test(int a)");
	}
	
	void test(int a, int b) {
	System.out.println("I am from method test(int a, int b)");
	}
	
	void test(int a, int b, int c) {
	System.out.println("I am from method test(int a, int b, int c)");
	}
	
	void test (double a) {
	System.out.println("I am from method test(double a)");
	}
	
	void test(double a, double b) {
	System.out.println("I am from method test(double a, double b)");
	}
	
	void test(double a, double b, double c) {
	System.out.println("I am from method test(double a, double b, double c)");
	}

	public static void main(String[] args) {
	System.out.println("##  Invoking all overloaded method created by changing 'Type of argument'  ##");
	Example_2 obj = new Example_2();
	obj.test();
	obj.test(3);
	obj.test(3,3);
	obj.test(3,3,3);
	obj.test(6.6);
	obj.test(6.6, 6.6);
	obj.test(6.6, 6.6, 6.6);
	}

}
