package Ch_01_Static_and_NonStatic;

/*
Rule

1. We can only use Static members inside static method.
   We can not use Non static member. Non static members requires object for calling.
   Static member does not depend on object. So we can not call non static member.
   
2. We can use both static member  and non static member inside non-static method.
   Using object we can use both static member and non-static member.
*/

public class Example_2 {
	
	int a;
	static int b;
	
	// Rule => we can use both static member and non static member inside non static method
	public void test1() {
	// we can use both static member and non static member inside non static method
		System.out.println(a = 11);
		System.out.println(b=21);
		
		test2();
		test3();
		test4();
	}
	
	// Rule = We can only use static members inside static method.
	public static void test2() {
		System.out.println(b=24);
		test4();
		
	// Rule = non static members can not be used in static method.Since compile time error occurs.
	/* System.out.println(a); compile time error occurs.
		//test1(); , test3();  // compile time error occurs.	
		 
	 */
	}
	
   public void test3() {
	   System.out.println("test3() is Non static method");
   }
   
   public static void test4() {
	   System.out.println("test4() is Static method");
   }

	public static void main(String[] args) {
	
		System.out.println("##              Static member             ## ");
		
		System.out.println("## By class name we can call 'static members ##");
		// Rule= current  value of global static variable b is 0 (zero).
		System.out.println(Example_2.b);
		Example_2.test2();
		System.out.println("## We can directly call 'static members' ##");
		// Rule =  Now value of static variable b is 24. Since variable b already assigned as 24 in above step
		test2();
		
		System.out.println("##              Non Static member         ##");
		
		System.out.println("## We need to create object of class to access 'non static member' ##");
		Example_2 obj = new Example_2();
		// Rule= current value of global Non static variable a is 0 (zero).
		System.out.println(obj.a);
		obj.test1();
		// Rule =  Now value of Non static variable a is 11. Since variable a already assigned as 11 in above step
		System.out.println(obj.a);
	}

}
