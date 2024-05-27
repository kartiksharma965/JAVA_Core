package CH_07_AccessModifier;
/*
 * Scenario :- Class can having access modifier (Public, Protected, Private and Default)
 * 
 * Rules
 * Within same class we can access all Access modifier (Public, Protected, Private and Default).
 * In same class there is no restriction because these are member of class.
 * method and variable are member of class.
 */

public class Example_1 {
	
	public int a = 9;
	protected int b = 99;
	private int c = 999;
	int d = 9999;
	
	public void test1() {
	System.out.println("I am Public method from Parent class (Example_1)");
	}
	
	protected void test2() {
	System.out.println("I am Protected method from Parent class (Example_1)");
	}
	
	private void test3() {
	System.out.println("I am Private method from Parent class (Example_1)");
	}
	
	void test4() {
	System.out.println("I am Default method from Parent class (Example_1)");
	}
	
	public static void main(String[] args) {
	System.out.println("##  Invoking default constructor  ##");
	Example_1 obj = new Example_1();
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
	System.out.println(obj.d);
	obj.test1();
	obj.test2();
	obj.test3();
	obj.test4();
	}
}
