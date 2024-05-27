package CH_18_Iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
Rule => Under ListIterator if we first use hasPrevious() and Previous() method then as result this code will not work.*/

public class Example_4 {

	public static void main(String[] args) {
	List<Integer> a = new ArrayList<Integer>();
	a.add(10);
	a.add(20);
	a.add(30);
	a.add(40);
	a.add(50);
	a.add(60);
	System.out.println("Size of ArrayList a ="+a.size());
	System.out.println("Entire records of Arraylist a ="+a);
	
	
	System.out.println("*** first use hasPrevious() and previous() method ***");
	/** Rule => Under ListIterator if we first use hasPrevious() and Previous() method then 
	  as result this code will not work.*/
	ListIterator itr=a.listIterator();
	while(itr.hasPrevious()) {
		System.out.println(itr.previous());
	}
	
	System.out.println("*** Later using hasNext() and Next() ***");
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	}

}
