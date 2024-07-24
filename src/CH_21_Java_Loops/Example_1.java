package CH_21_Java_Loops;
/*
 * Scenario For loop demo
 */
public class Example_1 {
	
	
	public static  void test1() {
		System.out.println("*** printing number is ascending order ***");
		for (int i=1; i<=10;i++) {
			System.out.println(i);
		}
	}
	
	
	public static  void test2() {
		System.out.println("*** scenario 1 : Printing even number from 1 to 10");
		for (int i=2; i<=10 ;i+=2) {
			System.out.println(i);
		}
		
		System.out.println("*** scenario 2 : Printing even number from 1 to 10");
		
		for (int i =1 ; i<=10 ; i++) {
			
			if (i % 2 ==0 ) {
			System.out.println(i);	
			}
		}
	}

	
	public static void test3() {
		System.out.println("*** printing number in descending order ***");
		
		for (int i=10 ; i>=0;i--) {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
	}
		
}
