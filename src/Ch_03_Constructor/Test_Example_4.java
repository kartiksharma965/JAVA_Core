package Ch_03_Constructor;

public class Test_Example_4 extends Example_4{
	
	Test_Example_4(){
	// Firstly parent class string constructor is invoked.
	super("OHM NAMAH SHIWAY");
	System.out.println("I am Default constructor from Child class Test_Example_4");
	}
	
	Test_Example_4(int a){
	// Firstly by default constructor of parent class constructor is invoked.
	// There is no need to explicitly specify super() keyword
	System.out.println("I am Integer parameterized constructor from Child class Test_Example_4");
	}
	
	Test_Example_4(String a){
	// Firstly parent class integer constructor is invoked.
	super(3);
	System.out.println("I am String parameterized constructor from Child class Test_Example_4");
	}

	public static void main(String[] args) {
	System.out.println("## Invoking Child class Default constructor ##");
	Test_Example_4 obj = new Test_Example_4();
	System.out.println("## Invoking Child class Integer constructor ##");
	Test_Example_4 obj1 = new Test_Example_4(3);
	System.out.println("## Invoking Child class String constructor ##");
	Test_Example_4 obj2 = new Test_Example_4("ohm");

	}

}
