package CH_04_Method_Overloading;
/*
 * Method overloading by changing 'Number of argument'.
 */

public class Example_1 {

	void test1() {
	System.out.println("I am from method test1()");
	}
	
	void test1(int a) {
	System.out.println("I am from method test1(int a)");
	}
	
	void test1(int a, int b) {
	System.out.println("I am from method test1(int a, int b)");
	}
	
	void test1(int a, int b, int c) {
	System.out.println("I am from method test1(int a, int b, int c)");
	}
	public static void main(String[] args) {
	System.out.println("## Invoking all overloaded method created by changing 'Number of Argument' ##");
	Example_1 obj = new Example_1();
	obj.test1();
	obj.test1(3);
	obj.test1(3,3);
	obj.test1(3,3,3);

	}

}
