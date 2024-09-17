package CH_26_String;

import java.util.Scanner;

// Count sum of digit in number.
public class Example_1m {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int number =sc.nextInt();
		int reminder=0;
	    int sum = 0;
	    
	    while(number>0)
	    {
	    	reminder= number%10;
	    	sum=sum+reminder;
	    	number=number/10;
	    }
	    
	    System.out.println("Sum of digit of number :- "+sum);
	    
	}

}
