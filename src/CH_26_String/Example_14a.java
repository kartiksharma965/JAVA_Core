package CH_26_String;

import java.util.Scanner;

/**
 * Factorial 
 * A factorial is number that multiplies a number by every number below it.
 *  5!
 *  5*4*3*2*1 =120
 */
public class Example_14a {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the number :-");
		Scanner sc = new Scanner(System.in);
		int number=sc.nextInt();
		
		long factorial =1;
		/** Approach 1
		for(int i=1 ; i<=number ;i++) {
			factorial=factorial*i;
		}
		*/
		
		// Approach 2
		
		for (int i= number; i>=1; i--) {
			factorial= factorial*i;
		}
		 
		
		System.out.println("Factorial of number is :- "+factorial);

	}

}
