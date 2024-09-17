package CH_26_String;

public class Example_1j {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "World";
	
		System.out.println("*** Before Swapping ***");
		System.out.println(a);
		System.out.println(b);
		
		// Step 1 append value of a and b.
		a=a+b;
		
		// Step 2 store initial String a , String b.
		/**a.length() =10, b.length()=5; 
		 * (0,5)
		 * Hence first 5 digit of "HelloWorld" 
		 * i.e. "Hello" is assigned to b. 
		 */
		b=a.substring(0,(a.length()-b.length()));
		
		
		// Step 3 store String b in String a.
		a=a.substring(b.length());
		
		System.out.println("*** After Swapping ***");
		System.out.println(a);
		System.out.println(b);
	}
}
