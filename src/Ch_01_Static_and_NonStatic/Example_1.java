package Ch_01_Static_and_NonStatic;

/*
 Rule
 
 We need to create object of class to access 'non static member' (non static method and variable).
 By class name we can call 'static members' (static method and variables).
 We can directly call 'static members' (static method and variables).
 */
public class Example_1 {
	// non static variables
	int a = 21;
	int b =24;
	
	// static variables
	static int c = 108;
	static int d = 125;
	
	// non static methods
	public void test1() {
		System.out.println("Non static method test1()");
	}
	
	public void test2() {
		System.out.println("Non static method test2()");
	}
	
	// static methods
	public static void test3() {
		System.out.println("Static method test3()");
	}
	
	public static void test4() {
		System.out.println("Static method test4()");
	}
	
	public static void main(String[] args) {
		Example_1 obj= new Example_1();
		
		// Rule = We need to create object of class to access 'non static member'.
		System.out.println("## We need to create object of class to access 'non static member' ##");
		obj.test1();
		obj.test2();
		System.out.println(obj.a);
		System.out.println(obj.b);
		
		// Rule = By class name we can call 'static members'.
		
		System.out.println("## By class name we can call 'static members ##");
		Example_1.test3();
		Example_1.test4();
		System.out.println(Example_1.c);
		System.out.println(Example_1.d);
		
		// Rule = We can directly call 'static members'.
		
		System.out.println("## We can directly call 'static members' ##");
		test3();
		test4();
		System.out.println(c);
		System.out.println(d);
		
	}

}
