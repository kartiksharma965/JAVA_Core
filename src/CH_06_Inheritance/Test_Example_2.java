package CH_06_Inheritance;
/* Scenario :- In Parent class we have defined methods (public, protected, private, default, static and final) and no variable.
 *             However in Child class there is no method and variable (public, protected, private, default, static and final).
 *             There is inheritance relationship between them.*/ 

public class Test_Example_2 extends Example_2{
	
	public int a = 8;
	protected int b = 16;
	private int c = 24;
	int d = 32;
	static int e = 40;
	final int f = 48;
	
	public static void main(String[] args) {
		
		System.out.println("## Scenario 1 :- using reference and object of Child class  ##");
	    /* Rule = All variables defined in Child class will be executed.
		        = All methods defined in Parent class will be executed.Except Private member (variable and method).*/
		Test_Example_2 obj = new Test_Example_2();
		System.out.println(obj.a);
		System.out.println(obj.b);
		System.out.println(obj.c); //  Private variable is defined in Child class.So, we can access it.
		System.out.println(obj.d);
		System.out.println(obj.e);
		System.out.println(obj.f);
		
		obj.test1();
		obj.test2();
		//obj.test3(); Private member of Parent class can not be inherit into Child class.
		obj.test4();
		obj.test5();
		obj.test6();
		
		System.out.println("## Scenario 2 :- using reference and object of Parent class  ##");
		/*  Rule = We can not call Private method from Parent class.
	             = However, rest all method are called from Parent class. 
	             = There are no variable defined in Parent class. So we can not call them using reference of parent class.*/
		Example_2 obj1 = new Example_2();
		/*
		 * Rule = There are no variable defined in Parent class. So we can not call them using reference of parent class.
		 
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		System.out.println(obj1.c); 
		System.out.println(obj1.d);
		System.out.println(obj1.e);
		System.out.println(obj1.f);
		*/
		obj1.test1();
		obj1.test2();
		//obj1.test3(); Private member of Parent class can not be inherit into Child class.
		obj1.test4();
		obj1.test5();
		obj1.test6();
		
		System.out.println("## Scenario 3 :- using referrence of Parent class and object of Child class  ##");
		/*  Rule = We can not call Private method from Parent class.
        = However, rest all method are called from Parent class. 
        = There are no variable defined in Parent class. So we can not call them using reference of parent class.*/
		 
		Example_2 obj2 = new Test_Example_2();
		/* Rule = There are no variable defined in Parent class. So we can not call them using reference of parent class.
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		// System.out.println(obj2.c); Private member of Parent class can not be inherit into Child class.
		System.out.println(obj2.d);
		System.out.println(obj2.e);
		System.out.println(obj2.f);*/
		
		obj2.test1();
		obj2.test2();
		//obj2.test3(); Private member of Parent class can not be inherit into Child class.
		obj2.test4();
		obj2.test5();  // Static method is strictly called from Parent class.
		obj2.test6();
		}
}
