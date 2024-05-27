package CH_06_Inheritance;
/* Scenario :- In Parent class there are no methods and defined variables (public, protected, private, default, static and final).
 *             However in Child class there is no variables and methods (public, protected, private, default, static and final).
 *             There is inheritance relationship between them.*/ 

public class Test_Example_3 extends Example_3{
	
	
	
	public void test1() {
	System.out.println("I am Public method test1() from Child class (Test_Example_3)");
	}
	
	protected void test2() {
	System.out.println("I am Protected method test2() from Child class (Test_Example_3)");
	}
	
	private void test3() {
	System.out.println("I am Private method test3() from Child class (Test_Example_3)");
	}
	
	void test4() {
	System.out.println("I am Default method test4() from Child class (Test_Example_3)");
	}
	
	static void test5() {
	System.out.println("I am Static method test5() from Child class (Test_Example_3)");
	}
	
	final void test6() {
	System.out.println("I am Final method test6() from Child class (Test_Example_3)");
	}
	
    public static void main(String[] args) {
		
		System.out.println("## Scenario 1 :- using reference and object of Child class  ##");
	    /* Rule = Private member of Parent class can not be inherit into Child class..*/
		Test_Example_3 obj = new Test_Example_3();
		System.out.println(obj.a);
		System.out.println(obj.b);
		//System.out.println(obj.c); //  Private variable is defined in Child class.So, we can access it.
		System.out.println(obj.d);
		System.out.println(obj.e);
		System.out.println(obj.f);
		
		obj.test1();
		obj.test2();
		obj.test3(); // Private variable is defined in Child class.So, we can access it.
		obj.test4();
		obj.test5();
		obj.test6();
		
		System.out.println("## Scenario 2 :- using reference and object of Parent class  ##");
		/*  Rule = We can not call Private method from Parent class.
	             = However, rest all variables are called from Parent class. 
	             = There are no methods defined in Parent class. So we can not call them using reference of parent class.*/
		Example_3 obj1 = new Example_3();
		
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		// System.out.println(obj1.c); Private member of Parent class can not be inherit into Child class.
		System.out.println(obj1.d);
		System.out.println(obj1.e);
		System.out.println(obj1.f);
		
		
		/* Rule = No methods are defined in Parent class. Hence they can not be called using Parent Object.
		obj1.test1();
		obj1.test2();
		//obj1.test3(); Private member of Parent class can not be inherit into Child class.
		obj1.test4();
		obj1.test5();
		obj1.test6(); */
		
		System.out.println("## Scenario 3 :- using referrence of Parent class and object of Child class  ##");
		/*  Rule = We can not call Private method from Parent class.
        = However, rest all variables are called from Parent class. 
        = There are no methods defined in Parent class. So we can not call them using reference of parent class.*/
		Example_3 obj2 = new Test_Example_3();
		
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		// System.out.println(obj2.c); Private member of Parent class can not be inherit into Child class.
		System.out.println(obj2.d);
		System.out.println(obj2.e);
		System.out.println(obj2.f);
		
		/*Rule = There are no methods defined in Parent class. So we can not call them using reference of parent class.
		
		obj2.test1();
		obj2.test2();
		//obj2.test3(); Private member of Parent class can not be inherit into Child class.
		obj2.test4();
		obj2.test5();  // Static method is strictly called from Parent class.
		obj2.test6();
		*/
		}
}
