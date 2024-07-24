package CH_24_Java_Array;

public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] [] = { {10,20}, {30,40}, {50,60},{70,80}, {90,100} };

		// 1) read single value from an array
		System.out.println("*** read single value from an array ***");
		System.out.println(a[0][0]);
		System.out.println(a[1][0]);

		// 2) Find size of an array
		System.out.println("number of rows in 2D array ="+a.length); // return number of rows in 2D array	
		System.out.println("number of columns in specific row ="+a[0].length); // returns number of columns in specific row

		// 3) reading data from 2D array
		System.out.println("*** reading data from 2d array ***");
		for(int i=0;i<=a.length-1;i++) // rows of 2d array
		{
			for(int j=0;j<=a[i].length-1;j++ ) // columns of 2d array
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

		System.out.println("*** for each loop ***");
		for(int arr[]:a)
		{
			for(int x:arr)
			{
				System.out.print(x+"   ");
			}
			System.out.println();	
	    }
	}
}
