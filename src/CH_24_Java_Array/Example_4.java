package CH_24_Java_Array;

public class Example_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] [] = new int [4] [2] ;
		
		a[0] [0] =12;
		a[0] [1] =13;
		
		a[1] [0] =14;
		a[1] [1] =15;
		
		a[2] [0] =16;
		a[2] [1] =17;
		
		a[3] [0] =18;
		a[3] [1] =19;
		
		// printing number of rows in array.
		System.out.println("Number of rows :- "+a.length);
		
		//printing number of columns in array.
		System.out.println("Number of Columns :- "+a[0].length);
		
		System.out.println("*** Using For loop ***");
		// read values from array
		for(int i =0; i<a.length;i++) // i=0, i=1, i=2, i=3    i=4(executed 4 times)
		{
		for(int j=0; j<a[0].length;j++) // j=0, j=2   j=2(executed 2 times)
		{
			System.out.println(a[i][j]);
		}
		}
		
		System.out.println("*** Using Enhanced for loop ***");
		for(int row[] :a) 
		{
			for(int columnValue:row) {
				System.out.println(columnValue);
			}
		}

	}

}
