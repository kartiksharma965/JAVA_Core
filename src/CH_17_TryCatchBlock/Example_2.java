package CH_17_TryCatchBlock;

public class Example_2 {


	public void test1() {
		// Scenario = Nested Inner try block will be executed sequentially.

		try { //First inner try block will be executed first.
			try {
				int []a= new int [5];
				a[5]=30;
			} catch (ArrayIndexOutOfBoundsException a) {
				System.out.println(a);
				a.printStackTrace();
				System.out.println("Exeption of first inner try block is working");
			}
			//Second inner try block will be executed secondly.
			try {
				int a[]= new int [5];
				a[5]=30/0;
			} catch (ArithmeticException a) {
				System.out.println(a);
				System.out.println("Exception of second inner try block is working");
			}
		} catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}


	//Scenario = forcefully throwing null pointer exception in first try block .Hence below exception will be handled by outer catch block.

	public void test2() {
		try { 
			int a[]= new int[5];
			a[5]=31/0;
		} catch(ArithmeticException a) {
			System.out.println("Exeption of first inner try block is working for Arithmetic Exception ");
			/* forcefully throwing null pointer exception 
	    Hence below exception will be handled by outer catch block*/
			throw new NullPointerException ("I am forcefully applying null pointer exception");
		}
		// Second nested try block will not be executed as forced exception occurs.  
		try {
			int [] a = new int [5];
			a[5]=31;
		} catch(ArrayIndexOutOfBoundsException a) {
			System.out.println("Exeption of Second inner try block is working for Array index out of bound");
		}
		catch(Exception e) {
			System.out.println("Parent class exception will handle any exception");
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_2 obj = new Example_2();
		System.out.println("*** Scenario 1 ***");
		obj.test1();
		System.out.println("*** Scenario 2 ***");
		obj.test2();

	}

}
