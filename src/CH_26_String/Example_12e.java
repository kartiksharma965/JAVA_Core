package CH_26_String;

import java.util.Arrays;

// Smallest and largest number 1D array
public class Example_12e {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int number[] = {-10,-9,-8,-7 ,4 , 5, 6,8,9,12,15,18};
		int minimum = number[0];
		int maximum = number[0];
		
		for(int i = 0 ; i <number.length;i++)
		{
			if(number[i]>maximum)
			{
				maximum=number[i];
			} else if (number[i]<minimum)
			{
				minimum=number[i];
			}
		}
		System.out.println("Given Array : - "+Arrays.toString(number));
		System.out.println("Minimum number :- "+minimum);
		System.out.println("Maximum number :- "+maximum);

	}

}
