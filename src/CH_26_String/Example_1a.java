package CH_26_String;

public class Example_1a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 100;
		int b = 500;
		
		double c = 10.5;
		double d = 12.5;
		
		String x = "Hello";
		String y = "World";
		
		// Rule = Flow is always from left to right.
		System.out.println(a+b+c+d);
		System.out.println(x+y+a+b);   // important.
		System.out.println(x+y+(a+b)); // important.
		System.out.println(a+b+x+y+a+b);
		System.out.println(y+a+b+x+y+a+y+x+b+a);
		System.out.println("***  ***");
		System.out.println(c+d+x+y);
		System.out.println(x+y+c+d);   // important
		System.out.println(x+y+(c+d)); // important
		System.out.println(y+a+b+c+d+x+y+a);
	}
}
