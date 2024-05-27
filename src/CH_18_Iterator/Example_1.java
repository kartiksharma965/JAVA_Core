package CH_18_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/** Iterator = It is basically a interface that has three method .
=>	These method are ‘hasnext’ , ‘next’ and ‘remove’.
=>	hasnext will check whether there is data or not in collection framework.
=>	Next will return the data and move the pointer to next element.
=>	Remove will remove data from collection framework. Or remove from collection of object.
 */

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List a = new ArrayList<>();
		a.add(9);
		a.add(9.9);
		a.add('c');
		a.add("ram");
		a.add(true);
		// Incase of Arraylist duplicate value can be added 
		a.add(9);
		a.add(9.9);
		a.add('c');
		a.add("ram");
		a.add(true);
		
		System.out.println("Entire records of A arraylist ="+a);
		
		System.out.println("*** Using Iterator interface we are iterating value of arraylist ***");
		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}	
	}
}
