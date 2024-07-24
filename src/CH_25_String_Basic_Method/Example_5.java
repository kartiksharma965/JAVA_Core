package CH_25_String_Basic_Method;
/**
String comparison

==        used for comparing objects.
equals()  used for comparing values of objects.
 */

public class Example_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*** Case 1 ***");
		String s1 = "Welcome";
		String s2 = "Welcome";
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("*** Case 2 ***");
		String s3 = new String ("Welcome");
		String s4 = new String ("Welcome");
		
		System.out.println(s3==s4); // false as == is used for comparing objects.
		System.out.println(s3.equals(s4)); //true as equals() is used for comparing values.
		
		System.out.println("*** Case 3 ***");
		String s5 = "Welcome";
		String s6 = new String ("Welcome");
		
		System.out.println(s5==s6); // false as == is used for comparing objects.
		System.out.println(s5.equals(s6)); //true as equals() is used for comparing values.
		
		System.out.println("*** Case 4 ***");
		String s7 = "Hello";
		String s8 = new String ("Hello");
		String s9 =s8;
		
		System.out.println(s7==s8);// false as == is used for comparing objects.
		System.out.println(s7.equals(s8)); //true as equals() is used for comparing values.
		
		// Important to learn
		System.out.println(s8==s9); //true  // here objects are same
		System.out.println(s8.equals(s9)); //true  here values of objects are same

	}
}
