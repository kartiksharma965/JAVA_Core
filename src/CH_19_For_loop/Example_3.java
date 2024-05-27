package CH_19_For_loop;

import java.util.ArrayList;
import java.util.List;

public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List a = new ArrayList<>();
		a.add(9);
		a.add(9.9);
		a.add(true);
		a.add('r');
		a.add("ram");
		
		System.out.println("Size of arraylist a ="+a.size());
		System.out.println("Entire records of arraylist a ="+a);
		System.out.println("*** for each loop ***");
		for (Object ob :a) {
			System.out.println(ob);
		}
		

	}

}
