package CH_26_String;

import java.util.LinkedHashSet;

// Remove duplicate records.
public class Example_11_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = { 2,2, 3,3, 4,4, 5,6,7,8,9};
		
		LinkedHashSet<Integer> hs = new LinkedHashSet<Integer>();
		
		for(int i = 0 ; i< a.length ; i++) {
			hs.add(a[i]);
		}
		
		for (int number :hs) {
			System.out.println(number+ "");
		}

	}

}
