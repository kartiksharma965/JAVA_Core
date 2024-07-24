package CH_26_String;

import java.util.Scanner;

/** Program :- Count the number of words in String.
 * 
 * eg S= "Welcome to Java";
 * if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) 
 * 
 * (s.charAt(i)==' ') means there is space after any character. eg character(e) there is space.
 * (s.charAt(i+1)!=' ') means then (character+1) after e must not be blank. eg character(t) is not having space.
 */

public class Example_9 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the String");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();  // Welcome to Java
		
		int count = 1;
		
		for(int i=0;i<s.length()-1;i++) {
			
			if((s.charAt(i)==' ')&&(s.charAt(i+1)!=' ')) 
			{
				count++;
			}
		}
		System.out.println("Number of words in string :-"+count);
		
	}

}
