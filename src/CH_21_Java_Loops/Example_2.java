package CH_21_Java_Loops;

public class Example_2 {

	/** Jumping statement  */

	public static  void test1() {
		System.out.println("*** Scenario 1 : test1() ***");
		for (int i=1; i<=10;i++) {
			if (i==5) {
				break; // i=5 then it will come out of loop.
			}
			System.out.println(i); // Output 1,2,3,4
		}
	}


	public static  void test2() {
		System.out.println("*** scenario 2 : test2() ***");
		for (int i=1; i<=10 ;i++) {
			if (i==5) {
				continue;
			}
			System.out.println(i);
		} }

	public static void test3() {
		System.out.println("*** scenario 3 : test3() ***");

		for (int i =1 ; i<=10 ; i++) {

			if (i==1||i==3||i==5||i==7||i==9) {
				System.out.println(i);	
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
	}

}
