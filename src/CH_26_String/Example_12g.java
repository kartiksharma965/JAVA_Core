package CH_26_String;
// sum of Array
public class Example_12g {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Declaring array in literal format.
		int a [] =  {1,2,3,4,5,6,7,8,9};
		int sum=0;
		int sum1=0;
		
		// using for loop
		for(int i = 0 ; i<a.length;i++)
		{
			sum= sum + a [i];
		}
		
		System.out.println(" Sum of array element :- "+sum);
		
		// using for each loop
		
		for(int value:a)
		{
			sum1=sum1+value;
		}
		System.out.println(" Sum of array  :- "+sum1);
	}

}
