package CH_15_Finally_Block;

public class Example_4 {
	
	public void test1() {
		try {
			System.out.println("*** Inside try method ***");
			int [] a = new int [5];
			a[5]=55; // ArrayIndexoutOfBound
		} catch(NullPointerException e) {
			System.out.println("*** Inside catch block ***");
		} finally {
			System.out.println("Finally block will be executed even when exception is not handled in catch block");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Example_4 obj = new Example_4();
		obj.test1();
	}

}
