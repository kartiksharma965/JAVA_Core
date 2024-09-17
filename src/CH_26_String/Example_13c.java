package CH_26_String;

import java.util.Scanner;
/** Prime number
 * The number which is divisible by 1 and itself.
 * eg 2,3,5,7,11, 13,17,19,23, 29 etc
 * @author kkumar97
 *
 */

public class Example_13c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println("Enter the number");
		//Scanner sc = new Scanner(System.in);
		//int number=sc.nextInt();
		int number=3;
		int count = 0;
		
		if (number>1)
		{
			for(int i=1; i<=number; i++)
			{
				if (number%i==0) // if number is divisible by number than increment value of count.
				{
					count++;
				}
				
				if(count==2)
				{
					System.out.println("Prime number");
				}
				else {
					System.out.println("Not a Prime number");
				}}}
		else {
			System.out.println("Not a prime number");		
		}	
}
}