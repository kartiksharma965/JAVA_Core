package Ch_02_SIB_and_IIB;

/*
  SIB block only consider Static member.
  
  IIB block consider both Static member and Non-Static member.
 */

public class Example_3 {
	
	static int a;
	int b;
	
	public static void test1() {
		System.out.println("I belong to static method test1()");
	}
	
	public void test2() {
		System.out.println("I belong to non static method test2()");
	}
	
	static {
		// Rule = SIB block only consider Static member
		a=10;
		System.out.println(a);
		test1();
		/*
		// In we try to call Non static member then as result we get compile time error.
		b=21;
		test2()
		 */
		System.out.println("I belong to SIB block");	
	}
	
	{
		// Rule = IIB block consider both Static member and Non Static member.
		a=21;
		b=32;
		System.out.println(a);
		System.out.println(b);
		test1();
		test2();
		System.out.println("I belong to IIB block");		
	}

	public static void main(String[] args) {
		
		System.out.println("## SIB block will be executed automatically ##");
		
		System.out.println("## Created Object 1 ##");
		Example_3 obj = new Example_3();

	}

}
