package CH_06_Inheritance;

public class Example_1 {
	
	public int a = 5;
	protected int b = 10;
	// Rule = Private member of Parent class can not be inherit into Child class.
	private int c = 15;
	int d = 20;
	static int e = 25;
	final int f = 30;
	
	public void test1() {
	System.out.println("I am Public method test1() from Parent class (Example_1)");
	}
	
	protected void test2() {
	System.out.println("I am Protected method test2() from Parent class (Example_1)");
	}
	
	private void test3() {
	System.out.println("I am Private method test3() from Parent class (Example_1)");
	}
	
	void test4() {
	System.out.println("I am Default method test4() from Parent class (Example_1)");
	}
	
	static void test5() {
	System.out.println("I am Static method test5() from Parent class (Example_1)");
	}
	
	final void test6() {
	System.out.println("I am Final method test6() from Parent class (Example_1)");
	}

}
