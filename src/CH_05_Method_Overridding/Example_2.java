package CH_05_Method_Overridding;

public class Example_2 {
	
	public void test1() {
	System.out.println("I am Public method test1() from Parent class (Example_2)");
	}
	
	protected void test2() {
	System.out.println("I am Protected method test2() from Parent class (Example_2)");
	}

	private void test3() {
	System.out.println("I am Private method test3() from Parent class (Example_2)");	
	}
	
	static void test4() {
	System.out.println("I am Static method test4() from Parent class (Example_2)");
	}
	
	final void test5() {
	System.out.println("I am Final method test5() from Parent class (Example_2)");
	}
}
