package CH_06_Inheritance;

/* Scenario = In Parent class we have defined variable (public, protected, private, default, static and final) and Methods (same as method).
 *             However, In Child class there in no method and variable.
 *             There is inheritance relationship between them. */

public class Test_Example_1 extends Example_1 {

	public static void main(String[] args) {
		
	System.out.println("## Scenario 1 :- using reference and object of Child class  ##");
    /* Rule = All variables and methods defined in Parent class will be executed.
	        = Except Private member (variable and method). */
	        
	Test_Example_1 obj = new Test_Example_1();
	System.out.println(obj.a);
	System.out.println(obj.b);
	// System.out.println(obj.c); Private member of Parent class can not be inherit into Child class.
	System.out.println(obj.d);
	System.out.println(obj.e);
	System.out.println(obj.f);
	
	obj.test1();
	obj.test2();
	// obj.test3(); Private member of Parent class can not be inherit into Child class.
	obj.test4();
	obj.test5();
	obj.test6();
	
	System.out.println("## Scenario 2 :- using reference and object of Parent class  ##");
	/*  Rule = We can not call Private method from Parent class.
             = However, rest all method are called from Parent class. */
	Example_1 obj1 = new Example_1();
	System.out.println(obj1.a);
	System.out.println(obj1.b);
	// System.out.println(obj1.c);  Private member of Parent class can not be inherit into Child class.
	System.out.println(obj1.d);
	System.out.println(obj1.e);
	System.out.println(obj1.f);
	
	obj1.test1();
	obj1.test2();
	// obj1.test3(); Private member of Parent class can not be inherit into Child class.
	obj1.test4();
	obj1.test5();
	obj1.test6();
	
	System.out.println("## Scenario 3 :- using referrence of Parent class and object of Child class  ##");
	/* Rule = We can not call Private method from Parent class.
            = Static method is strictly called from Parent class.*/
	Example_1 obj2 = new Test_Example_1();
	System.out.println(obj2.a);
	System.out.println(obj2.b);
	// System.out.println(obj2.c); Private member of Parent class can not be inherit into Child class.
	System.out.println(obj2.d);
	System.out.println(obj2.e);
	System.out.println(obj2.f);
	
	obj2.test1();
	obj2.test2();
	// obj2.test3(); Private member of Parent class can not be inherit into Child class.
	obj2.test4();
	obj2.test5();
	obj2.test6();
	}

}
