package CH_26_String;

import java.util.Scanner;

// Count number of digit in number.
public class Example_1l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int number =sc.nextInt();
	    int count=0;
	    
	    while(number>0)
	    {
	    	number= number/10;
	    	count++;
	    }
	    System.out.println("Number of digit :-"+count);

	}

}
