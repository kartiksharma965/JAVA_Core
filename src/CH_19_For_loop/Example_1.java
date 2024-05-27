package CH_19_For_loop;

import java.util.ArrayList;
import java.util.List;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List a = new ArrayList<>();
		a.add(9);
		a.add(9.9);
		a.add('c');
		a.add("ram");
		a.add(true);
		
		System.out.println("Size of ArrayList a ="+a.size());
		System.out.println("Entire records of ArrayList a ="+a);
		System.out.println("*** For loop in incremental order ***");
        for(int i =0; i<a.size(); i++) {
        	System.out.println(a.get(i));
        }
        System.out.println("*** For loop in decremental order ***");
        for(int i= a.size()-1; i>=0; i--) {
        	System.out.println(a.get(i));
        }
	}

}
