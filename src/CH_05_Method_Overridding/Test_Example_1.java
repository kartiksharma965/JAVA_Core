package CH_05_Method_Overridding;

public class Test_Example_1 extends Example_1{
	
	public void test2() {
	System.out.println("I am test2() method from Child class (Test_Example_1)");
	}
	
	public void test3() {
	System.out.println("I am test3() method from Child class (Test_Example_1)");
	}

	public static void main(String[] args) {
		
	System.out.println("## Scenario 1 :- using reference and object of Child class  ##");
	Test_Example_1 obj = new Test_Example_1();
	obj.test1();
	obj.test2();
	obj.test3();
	
	System.out.println("## Scenario 2 :- using reference and object of Parent class  ## ");
	Example_1 obj2 = new Example_1();
	obj2.test1();
	obj2.test2();
	/*
	 test3() method can not be displayed using Parent class reference as this method test3() does not belong to Parent class.
	 obj1.test3(); // compile time error
	 */
	
	System.out.println("## Scenario 3 :- using referrence of Parent class and object of Child class  ##");
	Example_1 obj1 = new Test_Example_1();
	obj1.test1();
	obj1.test2();
	/*
	 test3() method can not be displayed using Parent class reference as this method test3() does not belong to Parent class.
	 obj1.test3(); // compile time error
	 */
	
	}
}
