package Ch_03_Constructor;
/*
 * this() keyword will invoke default constructor.
 */

public class Test_Example_3 extends Example_3{
	
	public Test_Example_3() {
	super("Ohm");
	System.out.println("I am Default constructor from Child class Test_Example_3");
	}
	
	public Test_Example_3(int a) {
	//this() keyword will invoke default constructor (Test_Example_3())
	this();
	System.out.println("I am Integer constructor of Child class Test_Example_3");
		
	}

	public static void main(String[] args) {
    System.out.println("## Invoking Child class Integer constructor ##");
    Test_Example_3 obj = new Test_Example_3(3);

	}

}
