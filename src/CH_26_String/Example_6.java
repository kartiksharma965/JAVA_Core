package CH_26_String;
/**
 * CountCharacter Occurance
 * @author kkumar97
 *
 */

public class Example_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Java Programing Java oops";
		
		int totalCount=s.length();
		
		// we are replacing character a with blank value then finding length of it.
		int totalCoun_after_Rmoving_a=s.replace("a","").length();
		
		int count = totalCount - totalCoun_after_Rmoving_a;
		
		System.out.println("Number occurance of a is :-"+count);

	}

}
