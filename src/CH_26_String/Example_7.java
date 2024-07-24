package CH_26_String;
/**
 * Removing white space 
 * 
 * replaceAll(\\s ,"");
 */
public class Example_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "        Java       Program         Java      OOP            ";
		System.out.println("Before removing white spaces :- "+s);
		s=s.replaceAll("\\s", "");
		System.out.println("After removing white spaces :- "+s);
	}
}
