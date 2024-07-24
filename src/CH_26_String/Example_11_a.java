package CH_26_String;

import java.util.LinkedHashSet;

// Duplicate string
public class Example_11_a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str  = "Hello Shivvoom";
		char[] a=str.toCharArray();
		LinkedHashSet<Character> hs = new LinkedHashSet<Character>();
		
		for (int i = 0; i<a.length;i++) {
			hs.add(a[i]);
		}
		
		for(char ch :hs) {
			System.out.println(ch+ " ");
		}

	}

}
