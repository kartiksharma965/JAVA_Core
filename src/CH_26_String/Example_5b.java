package CH_26_String;

import java.util.Scanner;

/** Palindrom number
 */

public class Example_5b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :-");
		int number = sc.nextInt();
		int original_number = number;
		int reminder = 0;
		int reverse = 0;
		
		while(number!=0){
			reminder = number%10;
			number = number/10;
			reverse=reverse*10+reminder;	
		}
		
		//System.out.println("Reverse number :-"+reverse);
		if(original_number==reverse) {
			System.out.println("This is Palindrom number :- "+reverse);
		} else {
			System.out.println("This is not a Palindrom number :- "+reverse);
		}
	}
}
		/** 
		// Logic 2
		int num = sc.nextInt();
		int orig_num=num;
		int rev = 0;
		while(num!=0) {
			rev=rev*10 + num%10;
			num=num/10;
	     **/


	
