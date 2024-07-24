package CH_25_String_Basic_Method;

import java.util.Arrays;

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {20,10,40,30,60,50};
		int b[] = a;
		
		System.out.println(Arrays.toString(a)); // [20, 10, 40, 30, 60, 50]
		
		Arrays.sort(a); // mutable - can be changed as array is sorted.
		
		System.out.println(Arrays.toString(a)); // [10, 20, 30, 40, 50, 60]
		System.out.println(Arrays.toString(b)); // [10, 20, 30, 40, 50, 60]
		
		

	}

}
