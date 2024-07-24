package CH_21_Java_Loops;
/** DoWhile Loop
 * note => Even is statement is false still it will be executed once.
 */

public class Example_4 {

	public static void test1() {
		System.out.println("*** Scenario 1 : test1() ***");
        // output => It is ascending order 1 to 10.
		int i =1;
		do {
			System.out.println(i);
			i++;
		} while (i<=10);

	}

	public static void test2() {
		System.out.println("*** Scenario 2 : test2() ***");
		// output => It is in descending order 10 to 1.
		int i=10;
		do {
			System.out.println(i);
			i--;
		} while(i>=1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();

	}

}
