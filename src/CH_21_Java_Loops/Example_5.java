package CH_21_Java_Loops;
/**
  Difference between Do while and while loop
  
  In case condition is false than Do while will execute once.
  However While loop will not execute.
 */
public class Example_5 {
	
	public static void test1() {
		System.out.println("*** Scenario 1 : test1() ***");
        // output => While loop will not execute as condition is false.
		int i =10;
		while (i<=5)// condition is false.
		{
			System.out.println(i);
			i++;
		};

	}

	public static void test2() {
		System.out.println("*** Scenario 2 : test2() ***");
		// output => Do while will still execute once even when condition is false.
		int i=10;
		do {
			System.out.println(i);
			i--;
		} while(i<5);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1();
		test2();

	}

}
