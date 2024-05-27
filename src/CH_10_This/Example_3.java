package CH_10_This;

public class Example_3 {
	
	int a = 9;
	static int b = 99;
	
	void test1() {
	System.out.println("I am from Non static method test1()");
	/*  Rule = this() keyword is available for Non static member
	 *         egUsing this() keyword calling Non static member ( a and test2()). */
	 System.out.println(this.a);
	 this.test2();
	 // Rule = Inside Non static method we call Static member.
	 System.out.println(this.b);
	 
	}
	
	void test2() {
	System.out.println("I am from Non static method test2()");
	}
	
	void test3(Example_3 ob) {
	// It will display 'Package Name' then class name. eg "CH_10_This.Example_3".
	System.out.println(ob.getClass().getName());
	System.out.println("I am from Non static method test3(Example_3 obj)");	
	}
	
	void test4() {
	// Rule = We need to specify this() keyword in argument to access test4(obj) method.
	test3(this);
	}
	
	static void test5() {
	// Rule = compile time error occurs if we try to write 'this()' keyword inside static method.
	System.out.println("I am from Static method test5()");
	System.out.println(b);
	}

	public static void main(String[] args) {
	System.out.println("##  Invoking Default construtor  ##");
	Example_3 obj = new Example_3();
	System.out.println("##  Invoking Non Static member through child class object  ##");
	System.out.println(obj.a);
	obj.test1();
	obj.test3(obj);
	obj.test4();
	System.out.println("##  Invoking Static member directly  ##");
	System.out.println(b);
    test5();
	}

}
