package Ch_03_Constructor;

/* If we pass parameter in Super() calling method then first parameterized constructor of parent class 
 * is called first then  default constructor of child class is invoked.
 */

public class Test_Example_2 extends Example_2 {
	
	Test_Example_2(){
	// First Integer parameterized Parent class constructor is invoked then child class default constructor.
	super(3);
	System.out.println("I am Default constructor from Child class Test_Example_2");
	}

	Test_Example_2(int a){
	// Firstly default parameterized Parent class constructor is invoked then child class integer parameter constructor.
	System.out.println("I am Integer constructor from Child class Test_Example_2");
	}
	public static void main(String[] args) {
	System.out.println("## Invoking Child class Default constructor ##");
	Test_Example_2 obj = new Test_Example_2();
	System.out.println("## Invoking Child class Integer constructor ##");
	Test_Example_2 obj1 = new Test_Example_2(3);
	}

}
