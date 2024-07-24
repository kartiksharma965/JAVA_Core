package CH_23_Type_Casting;
/* Type Casting PrimitiveValues
 
a)  Upcasting - converting value from smaller --> larger
   eg a) int --->long.
      b) float ---> double

b)  Downcasting - converting value from larger --> smaller
   eg a) long --> int
      b) double --> float
 */

public class Example_1 {

	public static void test1() {
		System.out.println("*** Upcasting scenarios starts ***");
		
		//case 1
		int int_value =100;
		long long_value=int_value;
		System.out.println(long_value);
		
		//case 2
		int i =100;
		double d = i;
		System.out.println(d);
		
		System.out.println("*** Upcasting scenarios ends ***?");
	}
	
	public static void test2() {
		System.out.println("*** Downcasting scenario starts ***");
		
		// case 1
		long long_value=10000;
		int i= (int) long_value;
		System.out.println(i);
		
		// case 2
		double d = 10.32;
		int j = (int) d;
		System.out.println(j);
		
		System.out.println("*** Downcasting scenarios ends ***");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		test1();
		test2();
	}

}
