package CH_24_Java_Array;

import java.util.Arrays;

/** SingleDimensionalArray1` 
Approach 2
Steps to follow
1) Declare and add values into new array.
2) Find size of an array.
3) read single value from an array.
4) read multiple values from an array.
5) for loop.
6) for each loop.
 */
public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1) Declare and add values into new array.
		int a[] =  {10,20,30,40,50,60,70};
		
		// 2) Find size of an array.
		System.out.println("a array size is ="+a.length);
		
		// 3) read single value from an array.
		System.out.println("*** read single value from an array ***");
		System.out.println("a array index 0 value is ="+a[0]);
		System.out.println("a array index 1 value is ="+a[1]);
		System.out.println("a array index 2 value is ="+a[2]);
		System.out.println("a array index 3 value is ="+a[3]);
		System.out.println("a array index 4 value is ="+a[4]);
		System.out.println("a array index 5 value is ="+a[5]);
		
		// 4) read multiple values from an array
		System.out.println("*** reading multiple values of an array ***");
		System.out.println(Arrays.toString(a));
		
		// 5) for loop
		System.out.println("*** for loop in ascending order ***");
		for (int i=0; i<a.length; i ++) {
			System.out.println(a[i]);
		}
		
		// 6) enhanced for loop or for each loop
		System.out.println("*** for each loop ***");
		for(int value :a) {
			System.out.println(value);
		}
		
		// 7) for loop in descending order.
		System.out.println("*** Using loop descending order ***");
		for(int i= a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
