package CH_04_Method_Overloading;
/*
 * Rule = Method overloading by changing 'Sequence of argument'.
 */
public class Example_3 {
	
void test() {
System.out.println("I am from method test()");
}

void test(int a) {
System.out.println("I am from method test(int a)");
}

void test(int a, double b) {
System.out.println("I am from method test(int a, double b)");
}

void test(double a, int b) {
System.out.println("I am from method test(double a, int b)");
}
	public static void main(String[] args) {
	System.out.println("##  Invoking all overloaded method created by changing 'Sequence of argument'  ##");
	Example_3 obj = new Example_3();
	obj.test();
	obj.test(3);
    obj.test(3, 3.3);
	obj.test(3.3, 3);
	}
}
