package CH_24_Java_Array;

import java.util.Arrays;

/* SingleDimensionalArray1` 

Approach 1

 Steps to follow
1) Declare an array.
2) add values into array.
3) Find size of an array.
4) read single value from an array.
5) read multiple values from an array.
6) for loop.
7) for each loop.
 */

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Approach1
		//1) Declare an array.
		int a []= new int [5];
		//2) Adding the value to array.
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;

		//System.out.println(a); // incorrect output  , should not used.

		//3) Find size of an array.
		System.out.println("a array size is ="+a.length);

		//4) read single value from an array.
		System.out.println("*** read single value from an array ***");
		System.out.println("a array index 0 value is ="+a[0]);
		System.out.println("a array index 1 value is ="+a[1]);
		System.out.println("a array index 2 value is ="+a[2]);
		System.out.println("a array index 3 value is ="+a[3]);
		System.out.println("a array index 4 value is ="+a[4]);

		//5) read multiple values from an array
		System.out.println("*** reading multiple values of an array ***");
		System.out.println(Arrays.toString(a)); // [10,20,30,40,50]

		//6) for loop
		System.out.println("*** for loop in ascending order ***");
		for(int i=0 ; i<a.length;i++)
		{
			System.out.println(a[i]);
		}

		//7) enhanced for loop or for each loop
		System.out.println("*** for each loop in ascending order ***");
		for(int value:a) {
			System.out.println(value);
		}
		
		System.out.println("*** Using loop descending order ***");
		for(int i= a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
}
