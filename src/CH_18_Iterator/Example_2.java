package CH_18_Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List a = new ArrayList<>();
		a.add(7);
		a.add(7.7);
		a.add(true);
		a.add('r');
		a.add("ram");
		a.add(7);
		a.add(7.7);
		a.add(true);
		a.add('r');
		a.add("ram");

		System.out.println("Entire record of Arraylist a ="+a);

		Iterator itr=a.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			itr.remove();
		}
		System.out.println("After using remove method value of Arraylist a ="+a);
	}
}
