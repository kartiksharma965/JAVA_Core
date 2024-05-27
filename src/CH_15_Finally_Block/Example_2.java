package CH_15_Finally_Block;

/** Rule
   Final block is used to execute very important piece of code.
   The code that we always want to execute.
   Irrespective anything that happen to program finally block will get executed.
   
   Note = This is mainly used when we want to stop database or JDBC connection 
     then we can write in finally block.
 */

public class Example_2 {
	
	void test1() {
		try {
			int a[]= new int[5];
			a[4]=55/0;
		} catch(Exception e) {
			System.out.println("Arthematic exception occurs here");
		} finally {
			System.out.println("I am from finally block from java");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_2 obj = new Example_2();
		obj.test1();
	}
}
