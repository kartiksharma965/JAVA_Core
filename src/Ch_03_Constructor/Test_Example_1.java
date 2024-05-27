package Ch_03_Constructor;
/*
 * By Default constructor has in build Super() calling statement.
 */

public class Test_Example_1 extends Example_1{
	
	Test_Example_1(){
		/*
		 * Super(); this method is provided by default by Java.
		 * Firstly Super() statement will invoke parent class default constructor.
		 * Secondly then it will invoke child class default constructor.
		 */
		System.out.println("I am Default constructor from Child class Test_Example_1");
	}
	
	Test_Example_1(int a){
		/*
		 * Super(); this method is provided by default by Java.
		 * Firstly Super() statement will invoke parent class default constructor.
		 * Secondly then it will invoke child class default constructor.
		 */
		System.out.println("I am Integer constructor from Child class Test_Example_1");
	}

	public static void main(String[] args) {
		System.out.println("## Invoking Child class Default constructor ##");
		Test_Example_1 obj = new Test_Example_1();
		System.out.println("## Invoking Child class Integer constructor ##");
		Test_Example_1 obj1 = new Test_Example_1(3);
	}
}
