package CH_04_Method_Overloading;

/*
 * Question) Is it possible to perform method overloading for static method?
 * Answer =  Yes.
 */

public class Example_5 {
	
	public static void test() {
	System.out.println("I am from static method test()");
	}
	
	public static void test(int a) {
	System.out.println("I am from overloaded static method test(int a)");
	}
	
	public static void test(String a) {
	System.out.println("I am from overloaded static method test(String a)");
	}

	public static void main(String[] args) {
	System.out.println("## Invoking static methods directly ##");
	test();
	test(3);
	test("OHM");
	System.out.println("## Invoking static methods by class name ##");
	Example_5.test();
	Example_5.test(6);
	Example_5.test("OHM");
	}

}
