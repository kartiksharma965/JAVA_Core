package CH_24_Java_Array;

public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a [] [] = { {10, 11} ,{12,13} , {14,15} ,{16,17} };
		
		a[2] [0] =24; // replacing 14 value to 24.
		
		//enhanced for loop
		
		for(int row [] :a) {
			for(int columnValue:row) {
				System.out.println(columnValue);
			}
		}
	}

}
