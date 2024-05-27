package CH_14_Final_Class_Method_Variable;
/**
Rule 1 = We cannot override final method .

Rule 2 = Final method if defined in parent class then in child class we can not write final method as compile time error occurs.
*/

public class Example_2 {
	
	public void test1() {
		System.out.println("Parent class (Example_2) having public method as test1()");
	}

	protected void test2() {
		System.out.println("Parent class (Example_2) having protected method as test2()");
	}

	void test3() {
		System.out.println("Parent class (Example_2) having default method as test3()");
	}

	private void test4() {
		System.out.println("Parent  class (Example_2) having private method as test4()");
	}

	static void test5() {
		System.out.println("Parent class (Example_2) having static method as test5()");
	}

	final void test6() {
		System.out.println("Parent class (Example_2) having final method as test6()");
	}

}
