package CH_14_Final_Class_Method_Variable;
/*
 * This scenario define below mentioned points 

   a) Rule = Final method if defined in parent class that we can not write required code for child class as compile time error occurs.

   b) If we create object and reference of child class. 
	  Rule = We can override all method that are defined in parent class with child class

   c) If we create object and reference of parent.
	  Rule = We cannot call private method from parent class reference and object.
      Rule = Rest all method are called from parent class.


   d) If we create reference of parent class and object of child class.
	  Rule = We cannot call private method from parent class reference and object of child class.
	  Rule = Static method is strictly called from parent class. 

 */
public class Test_Example_2 extends Example_2{

	public void test1() {
		System.out.println("Child class (Test_Example_2) having public method as test1()");
	}

	protected void test2() {
		System.out.println("Child class (Test_Example_2) having protected method as test2()");
	}

	void test3() {
		System.out.println("Child class (Test_Example_2) having default method as test3()");
	}

	private void test4() {
		System.out.println("Child class (Test_Example_2) having private method as test4()");
	}

	static void test5() {
		System.out.println("Child class (Test_Example_2) having static method as test5()");
	}

	/* Rule 1 = Final method if defined in parent class that we can not write required code for child class as compile time error occurs.
   example
   final void test6() // Compile time error occurs if we try to write final method code in child class.
   {
		System.out.println("Child class (Test_Example_2) having final method as test6()");
	}

	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("***  Scenario of reference and object of child class  ***");
		/*Rule = We can override all method that are defined in parent class with child class.
		 * However final method will be called from parent class
		 */
		Test_Example_2 obj1 = new Test_Example_2();
		obj1.test1();
		obj1.test2();
		obj1.test3();
		obj1.test4();
		obj1.test5();
		obj1.test6();

		System.out.println("***  Scenario of reference and  object of parent class  ***");
		/*If we create object and reference of parent.
	  Rule = We cannot call private method from parent class reference and object.
      Rule = Rest all method are called from parent class.
		 */
		Example_2 Obj3 = new Example_2();
		Obj3.test1();
		Obj3.test2();
		Obj3.test3();
		Obj3.test5();
		Obj3.test6();

		System.out.println("***  Scenario of reference of Parent class and  object of child class  ***");
		/*If we create reference of parent class and object of child class.
	  Rule = We cannot call private method from parent class reference and object of child class.
	  Rule = Static method is strictly called from parent class. 
		 */
		Example_2 obj2 = new Test_Example_2();
		obj2.test1();
		obj2.test3();
		obj2.test5();
		obj2.test6();

	}

}
