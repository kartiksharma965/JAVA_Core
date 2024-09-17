package CH_26_String;

import java.util.Scanner;

public class Example_2c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :-");
		int number = sc.nextInt();
		// logic 1
		int reminder =0;
		int reverse =0;
		while(number!=0) {
			reminder = number%10;
			number= number/10;
			reverse = reverse*10+reminder;
		}

		System.out.println(" Reminder number :-"+reverse);
	}
}

        /** Logic 2
        int number=sc.nextInt();
        int rev = 0;
        while(number!=0) {
	    rev= rev*10+number%10;
        number=number/10;
        }
        System.out.println("Reverse number :- "+rev);
        */
