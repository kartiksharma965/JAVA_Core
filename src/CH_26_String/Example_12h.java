package CH_26_String;

import java.util.Arrays;

// check equality of 2 array
public class Example_12h {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {1,2,3,4,5};
		int b [] = {1,2,3,4,5};
		
		// Approach 1
		
		boolean status_1=Arrays.equals(a, b);
		
		if(status_1=true)
		{
			System.out.println("Array are equal");
		} else {
			System.out.println("Array are not equal");
		}
		
		// Approach 2
		
		boolean status= true;
		
		// first check total length of both arrays
		if(a.length==b.length)
		{
			for(int i = 0 ; i<a.length;i++) {
			if(a[i]!=b[i])
			{
				status= false;
			}}} 
		// In case length of array is not equal.
		else {
			status=false;
		}
	    // Now we are checking final status of array.
		if(status== true) 
			{
			System.out.println("Array are equal");
			}
			else {
				System.out.println("Array are not equal");
			}}
	}