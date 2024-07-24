package CH_26_String;

import java.util.Scanner;

public class Example_5c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :-");
		int number=sc.nextInt();
		int original_number = number;
		int reminder  =0;
		int cube = 0;
		while(number!=0) {
			reminder = number%10;
			number = number/10;
			cube= cube+(reminder*reminder*reminder);
		}
		
		System.out.println(" Number cube is :- "+cube);
		
		if(original_number == cube) {
			System.out.println("This is Armstrong number :- "+cube);
		} else{
			System.out.println("This is not Armstrong number :- "+cube);
		}
	}
}
