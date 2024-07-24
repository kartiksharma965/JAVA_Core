package CH_25_String_Basic_Method;
/**
Immutable     ----- we cannot change.
Mutable       ----- we can change.

String        ----- immutable , cannot be changed.
StringBuffer  ----- mutable , can be changed.
StringBuilder ----- mutable,  can be changed.
 */
public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*** String is Immutable ***");
		// String        ----- immutable , cannot be changed.
		String s = "Shiv Shakti";
		s.concat("Kripa");
		System.out.println(s); // Shiv Shakti   
		// Note Immutable as original string value is not changed even after concatenation.
        //      => concat() method is used for concatenation in String class.
		
		System.out.println("*** StringBuffer is mutable ***");
		StringBuffer s1 = new StringBuffer("Bholaynath");
		s1.append("Kripa");
		System.out.println(s1); // Bholaynath Kripa
		// Note => Mutable as original string value is changed after concatenation.
		//      => append() method is used for concatenation in StringBuffer class.
		
		System.out.println("*** StringBuilder is mutable ***");
		StringBuilder s2 = new StringBuilder("Neelkanth");
		s2.append("Kripa");
		System.out.println(s2); // Neelkanth Kripa
		// Note Mutable as original string value is changed after concatenation. 
        //      => append() method is used for concatenation in StringBuilder class.
		
		
		

	}

}
