package CH_04_Method_Overloading;

/*
 * Question) Is it possible to perform method overloading for Final method?
 * Answer = Yes.
 */

public class Example_6 {
	
	public static final void test() {
	System.out.println("I am from final method test()");
	}
	
	public static final void test(int a) {
	System.out.println("I am from overloaded final method test(int a)");
	}
	
	public static final void test(String a) {
	System.out.println("I am from overloaded final method test(String a)");
	}

	public static void main(String[] args) {
	System.out.println("## Invoking Final method ##");
	test();
	test(3);
	test("Ohm");
	}
}
