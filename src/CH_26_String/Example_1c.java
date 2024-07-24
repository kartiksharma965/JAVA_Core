package CH_26_String;

// String Manipulation

public class Example_1c {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("*** Scenario of trim() and replace() ***");
		String str = "    Welcome to      Beautiful      World      of      God   ";
		System.out.println(str.trim());
		System.out.println(str.replace(" ", ""));
		System.out.println(str.trim().replace("  ", " "));
		
		String date ="20_5_2018";
		System.out.println(date.replace('_', '/'));
		
		System.out.println("*** Scenario of split  ***");
		
		System.out.println("*** Case 1 split ***");
		String str1 = "Welcome_to_Beautiful_World_of_God";
		String a[] =str1.split("_");
		for(int i=0 ;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("*** Case 2 split ***");
		String str2 = "Welcome to Beautiful World of God";
		String a1[]=str2.split(" ");
		for(int i =0 ; i<a1.length;i++) {
			System.out.println(a1[i]);
		}
		
		System.out.println("*** Scenario of concatenate ****");
		String b ="Welcome";
		System.out.println(b.concat("World"));
		System.out.println(b.concat("World").concat("of"));
		System.out.println(b.concat("World").concat("of").concat("God"));
		
	}

}
