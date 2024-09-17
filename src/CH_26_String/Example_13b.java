package CH_26_String;

import java.util.Scanner;
// prime number
public class Example_13b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter the number :");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		for (int i = 2; i<=number ; i++)
		{
			for (int j = 2 ; j <= i ; j++) 
			{
				if(i==j)
				{
					System.out.println(i);
				}
				if(i%j==0)
				{
					break;
				}}}}

}
