package CH_14_Final_Class_Method_Variable;

/**Rule of Final class

1. Final class cannot be extended by any other class.
2. Making a class , method and variable final help java to improve performance 
   because JVM get opportunity to make assumption and optimization.
3. All variable defined inside Interface are by default final.

Important Rule to remember

 Rule 1 = We use Final to prevent inheritance.

 Rule 2 = We use final to prevent method overloading.

 Rule 3 = All variable defined inside Interface are by default Final

 */

public class Example_1 {

	public void test1() {
		System.out.println("Parent class (Example_1) having public method as test1()");
	}

	protected void test2() {
		System.out.println("Parent class (Example_1) having protected method as test2()");
	}

	void test3() {
		System.out.println("Parent class (Example_1) having default method as test3()");
	}

	private void test4() {
		System.out.println("Parent  class (Example_1) having private method as test4()");
	}

	static void test5() {
		System.out.println("Parent class (Example_1) having static method as test5()");
	}

	final void test6() {
		System.out.println("Parent class (Example_1) having final method as test6()");
	}
}
