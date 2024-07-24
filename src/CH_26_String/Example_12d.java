package CH_26_String;

public class Example_12d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1,2,3,4,5,6,7,8,9};
		
		int largeNumber =a [0];
		int SecondLargeNumber = a[0];
		
		for(int i = 0; i<a.length;i++) {
			if(a[i]>largeNumber)
			{
				SecondLargeNumber = largeNumber;
				largeNumber =a [i];
			} else if(a[i]>SecondLargeNumber) {
				SecondLargeNumber=a[i];
			} }
		System.out.println("2nd largest number :-"+SecondLargeNumber);
		System.out.println("1st largest number :-"+largeNumber);
	}
}
