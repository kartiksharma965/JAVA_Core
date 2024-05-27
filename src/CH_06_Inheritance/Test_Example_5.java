package CH_06_Inheritance;

public class Test_Example_5 extends Example_5{
	
	public int a = 8;
	protected int b = 16;
	private int c = 24;
	int d = 32;
	static int e = 40;
	final int f = 48;
	
	public void test1() {
	System.out.println("I am Public method test1() from Child class (Test_Example_5)");
	}
	
	protected void test2() {
	System.out.println("I am Protected method test2() from Child class (Test_Example_6)");
	}
	
	private void test3() {
	System.out.println("I am Private method test3() from Child class (Test_Example_5)");
	}
	
	void test4() {
	System.out.println("I am Default method test4() from Child class (Test_Example_5)");
	}
	
	static void test5() {
	System.out.println("I am Static method test5() from Child class (Test_Example_5)");
	}
	
	/* Rule = Final method if defined in Parent class then we can not write required code for Child class 
     *        as compile time error occurs.
     * final void test6() {
	 * System.out.println("I am Final method test6() from Child class (Test_Example_5)");
	   } */
	
	public static void main(String[] args) {
		System.out.println("## Scenario 1 :- using reference and object of Child class  ##");
		//  Rule = We can override all method that are defined in Parent class with Child class.
		Test_Example_5 obj = new Test_Example_5();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c);
		System.out.println(obj.d);
		System.out.println(obj.e);
		System.out.println(obj.f);
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test4();
		obj.test5();
		obj.test6();
		
		System.out.println("## Scenario 2 :- using reference and object of Parent class  ##");
		/*  Rule = We can not call Private member from Parent class.
	             = However, rest all method are called from Parent class. */
		Example_5 obj1 = new Example_5();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		// System.out.println(obj1.c); We can not call Private member from Parent class.
		System.out.println(obj1.d);
		System.out.println(obj1.e);
		System.out.println(obj1.f);
		obj1.test1();
		obj1.test2();
		// obj1.test3(); We can not call Private member from Parent class.
		obj1.test4();
		obj1.test5();
		obj1.test6();
		
		System.out.println("## Scenario 3 :- using referrence of Parent class and object of Child class  ##");
		/* Rule = We can not call Private method from Parent class.
	            = Static method is strictly called from Parent class.*/
		Example_5 obj2 = new Test_Example_5();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		// System.out.println(obj2.c); We can not call Private member from Parent class.
		System.out.println(obj2.d);
		System.out.println(obj2.e);
		obj2.test1();
		obj2.test2();
		// obj2.test3(); We can not call Private member from Parent class.
		obj2.test4();
		obj2.test5();
		obj2.test6();		
	}
}
