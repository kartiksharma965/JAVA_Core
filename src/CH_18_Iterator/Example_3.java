package CH_18_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* List Iterator
=>	List Iterator has additional method of hasPrevious () and previous().
=>	first always use hasnext () and next () method. After that use hasPrevious() and previous().

Rule=> Under ListIterator if we first use hasPrevious() and Previous() method then as result this code will not work. */


public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(40);
		a.add(50);
		a.add(60);
		
		System.out.println("Size of A arraylist a="+a.size());
		System.out.println("Entire record of A arraylist ="+a);
		
		System.out.println("*** Scenario of listIterator ***");
		ListIterator itr=a.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("*** Scenario of Backword direction using hasPrevious and previous method ***");
		while(itr.hasPrevious()) {
			System.out.println(itr.previous());
		}

	}

}
