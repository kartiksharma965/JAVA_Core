package CH_26_String;
// Even or odd number in array.
public class Example_12a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};
		
		for(int i = 0 ; i<=a.length-1;i++)
		{
			if (a[i]%2 == 0)
			{
				System.out.println("Even number :- "+a[i]);
			} else {
				System.out.println("Odd number :- "+a[i]);
			}
		}
	}

}
