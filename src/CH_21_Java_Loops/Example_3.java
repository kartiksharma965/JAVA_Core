package CH_21_Java_Loops;

public class Example_3 {
	
	public static  void test1() {
		System.out.println("*** Scenario 1 : test1() ***");
		// output => printing from 1.....10.
		
		int i=1; // initialization
		while(i<=10) // condition
		{
			System.out.println(i);
			i++; // incrementing 
		}  }


	public static  void test2() {
		System.out.println("*** scenario 2 : test2() ***");
		 // output => print "OHM NAMAH SHIWAY"  10 times.
		int i=1; // initialization  
		while(i<=10) // condition
		{
			System.out.println("OHM NAHAH SHIWAY");
			i++; // incrementing
		} }

	public static void test3() {
		System.out.println("*** scenario 3a : test3() ***");
		// output => print even number from 1 to 10.
        int i=2; // initialization
         while(i<=10) // condition
         {
        	 System.out.println(i);
        	 i+=2; // increment
         }
		
         System.out.println("*** scenario 3b : test3() ***");
 		// output => print even number from 1 to 10.
         int j=1; // initialization
          while(j<=10) // condition
          {
         	 if (j%2==0) {
         		 System.out.println(j);
         	 }
         		 j++;
          }
	}
	
	public static void test4() {
		System.out.println("*** scenario 4 : test4() ***");
		// output => print odd number from 1 to 10.
		int i=1;
		while(i<=10) {
			if(i%2!=0) {
				System.out.println(i);
			}
			i++;
		}
	}
	
	public static void test5() {
		System.out.println("*** scenario 5 : test5() ***");
		// output => print in decrementing order number from 10 to 1.
		int i=10;
		while(i>=1) {
			System.out.println(i);
			i--;
		}
	}
	
	public static void test6() {
		System.out.println("*** scenario 6 : test6() ***");
		/* In below scenario there is no initialization no increment
		 * while (1==1) is true
		 * so loop will keep executing. So we need to forcefully stop execution.
		example
		while(1==1){
		System.out.println("hello");
		 */
		while(1==1) {
			System.out.println("Hello");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
		test4();
		test5();
		test6();
		

	}

}
