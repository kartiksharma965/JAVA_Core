package CH_17_TryCatchBlock;
/**  Inside try block we can write one more try and catch block.Again I have multiple catch block
 *   Whenever there exception in internal try then it will go to internal catch.
 *   Note = Internal try will not go to external catch.
 */

public class Example_3 {


	public void test1() {
		// Scenario = We are able to handle internal try block using internal catch block.

		try {
			try {
				int []a = new int [5];
				a[5]=30/0;
			} catch(Exception e) {
				System.out.println("I am from inner try block of test1()");
				e.printStackTrace();
			}
		}
		catch (ArithmeticException e) {
			System.out.println("****Outer Arithemet exception is solved****");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("****Outer Array Index out of bound exception is solved***");
		} catch(NullPointerException a) {
			System.out.println("****Outer Null Pointer Exception is solved***");
		}System.out.println("****Rest of code is running successfully for test1() method***");
	}

	public void test2() {
		// Scenario = We are forcefully throwing error through internal catch . This will be handled by outer catch block.

		try {
			try {
				int []a = new int [5];
				// array index out of bond error message should be displayed
				a[5]=30/2;
			} catch(Exception e) {
				System.out.println("I am from inner try block of test1()");
				e.printStackTrace();
				// We are forcefully throwing null pointer exception . Hence outer null point exception will execute
				throw new NullPointerException ("*** I am forceble Nullpointer exception that will be solved by outter catch ***");
			}
		}
		catch (ArithmeticException e) {
			System.out.println("****Outer Arithemet exception is solved****");
			e.printStackTrace();
		} catch (ArrayIndexOutOfBoundsException a) {
			System.out.println("****Outer Array Index out of bound exception is solved***");
		} catch(NullPointerException a) {
			System.out.println("****Outer Null Pointer Exception for test2() method ***");
		}System.out.println("****Rest of code is running successfully for test2() method***");
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_3 obj = new Example_3();
		System.out.println("*** Scenario 1 ***");
		obj.test1();
		System.out.println("*** Scenario 2 ***");
		obj.test2();

	}

}
