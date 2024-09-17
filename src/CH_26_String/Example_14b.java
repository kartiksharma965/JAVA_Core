package CH_26_String;

import java.util.Scanner;

// Fibonacci series 
// eg 1,2,3,5,8,13,21,34
public class Example_14b {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1 = 0; 
		int n2 = 1;
		int sum = 0;
		
		System.out.println(n1+ " "+n2); // 0 ,1
		
		for(int i= 2 ; i<10 ;i++) {
			sum=n1+n2; // 2+3
			// now swapping value of n1. n2, sum
			System.out.println(" "+sum); // 1 2 3 5 8 13 21 34
			n1=n2;// 2
			n2=sum;//3	
		}
	}

}
