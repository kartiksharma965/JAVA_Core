package CH_06_Inheritance;
/* Scenario :- In Parent class there are no methods and  methods.
 *             However in Child class there is defined variables and methods (public, protected, private, default, static and final).
 *             There is inheritance relationship between them.*/ 

public class Test_Example_4 extends Example_4{
	
	public int a = 8;
	protected int b = 16;
	private int c = 24;
	int d = 32;
	static int e =40;
	final int f = 48;
	
	
	public void test1() {
	System.out.println("I am Public method test1() from Child class (Test_Example_4)");
	}
	
	protected void test2() {
	System.out.println("I am Protected method test2() from Child class (Test_Example_4)");
	}
	
	private void test3() {
	System.out.println("I am Private method test3() from Child class (Test_Example_4)");
	}
	
	void test4() {
	System.out.println("I am Default method test4() from Child class (Test_Example_4)");
	}
	
	static void test5() {
	System.out.println("I am Static method test5() from Child class (Test_Example_4)");
	}
	
	final void test6() {
	System.out.println("I am Final method test6() from Child class (Test_Example_4)");
	}
	
    public static void main(String[] args) {
		
		System.out.println("## Scenario 1 :- using reference and object of Child class  ##");
	    /* Rule = Private member of Parent class can not be inherit into Child class..*/
		Test_Example_4 obj = new Test_Example_4();
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
		/*  Rule = No method or variable can be called from Parent class since parent class is blank*/
		Example_4 obj1 = new Example_4();
		
		
		System.out.println("## Scenario 3 :- using referrence of Parent class and object of Child class  ##");
		/*  Rule = No method or variable can be called from Parent class since parent class is blank*/
		Example_4 obj2 = new Test_Example_4();
	
		}
}
