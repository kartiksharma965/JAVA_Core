package CH_05_Method_Overridding;

/*
 * Rules
 * 
 * a) Final method if defined in Parent class then we can not write required code for Child class 
 *    as compile time error occurs.
 * 
 * b) If we create reference and object of Child class.
 *    Result = We can override all method that are defined in Parent class with Child class.
 *   
 * c) If we create reference and object of Parent class.
 *    Result = We can not call Private method from Parent class.
 *           = However, rest all method are called from Parent class.
 *           
 * d) If we create reference of Parent class and object Child class.
 *    Result = We can not call Private method from Parent class.
 *           = Static method is strictly called from Parent class.  
 */
public class Test_Example_2 extends Example_2{
	
	public void test1() {
	System.out.println("I am Public method test1() from Child class (Test_Example_2)");
	}
	
	protected void test2() {
	System.out.println("I am Protected method test2() from Child class (Test_Example_2)");
	}
	
	private void test3() {
	System.out.println("I am Private method test3() from Child class (Test_Example_2)");
	}
	
	static void test4() {
	System.out.println("I am Static method test4() from Child class (Test_Example_2)");
	}
	/*
	 * Rule = Final method if defined in Parent class then we can not write required code for Child class 
     *        as compile time error occurs.
	final void test5() {
	System.out.println("I am Final method test5() from Child class (Test_Example_2)");
	}
	*/
	
	public static void main(String[] args) {
	
	System.out.println("## Scenario 1 :- using reference and object of Child class  ##");
	//  Rule = We can override all method that are defined in Parent class with Child class
	
	Test_Example_2 obj = new Test_Example_2();
	obj.test1();
	obj.test2();
	obj.test3();
	obj.test4();
	
	
	System.out.println("## Scenario 2 :- using reference and object of Parent class  ##");
	/*  Rule = We can not call Private method from Parent class.
             = However, rest all method are called from Parent class. */
	
	Example_2 obj2 = new Example_2();
	obj2.test1();
	obj2.test2();
	obj2.test4();
	obj2.test5();
	/* obj2.test3(); We can not call Private method from  Parent class. */
	
	System.out.println("## Scenario 3 :- using referrence of Parent class and object of Child class  ##");
	/* Rule = We can not call Private method from Parent class.
            = Static method is strictly called from Parent class.*/
	Example_2 obj3 = new Test_Example_2();
	obj3.test1();
	obj3.test2();
	obj3.test4(); // Rule = Static method is strictly called from Parent class.
	obj3.test5();
	/* obj2.test3(); We can not call Private method from  Parent class. */
	
	
	
	
	

	}

}
