package CH_26_String;

import java.util.Random;
import java.util.Scanner;

// Generate random number.
public class Example_1n {

	public static void main(String[] args) {
		// Appraoch 1 -- Random
		Random rand= new Random();
		int rand_int=rand.nextInt(1000); // it will generate random number range (0-999)
		System.out.println(rand_int);
		
		double rand_doub=rand.nextDouble();
		System.out.println(rand_doub);
		
		// Approach 2 -- Math
		System.out.println(Math.random());
		
		/** Approach 3 -- Apache common lang Api.
		 https://commons.apache.org/
		
		String ranNum=RandomStringUtils.randomNumeric(10);
		System.out.println(ranNum)
		
		String ranStr=RandomStringUtils.randomAlphabetic(15);
		System.out.println(ranStr)
		*/
	}

}
