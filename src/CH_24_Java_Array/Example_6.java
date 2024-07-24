package CH_24_Java_Array;

import java.util.Arrays;

// Object type array
public class Example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Object [] ob = new Object [5] ;
		ob[0] = 100;
		ob[1] ='R';
		ob[2] = "Shree Ram";
		ob[3] = true;
		ob[4] = 100.100;
		
		System.out.println(Arrays.toString(ob));
		
		for( Object o :ob) {
			System.out.println(o);
		}
	}

}
