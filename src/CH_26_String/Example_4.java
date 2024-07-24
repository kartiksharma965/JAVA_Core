package CH_26_String;

import java.util.Scanner;

/** Palindrome String
 */

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String :-");
		
		String str = sc.next();
		String org_str = str;
		String rev ="";
		
		for(int i = str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}
		
		System.out.println("Reverse string "+rev);
		
		if(org_str.equals(rev)) {
			System.out.println(org_str+" is Palindrom number");
		} else {
			System.out.println(org_str+" is not a Palindrom number");
		}

	}

}
