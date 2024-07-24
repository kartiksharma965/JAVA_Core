package CH_26_String;

public class Example_10_b {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("*** Case using third variable t ***");
		// Case 1 using third variable t.
		int a = 5;
		int b = 10;
		int t;
		t=a;
		a=b;
		b=t;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println("*** Case 2 using + operator ***");
		int c =5;
		int d =10;
		c=c+d;
		d=c-d;
		c=c-d;
		System.out.println(c);
		System.out.println(d);
		
		System.out.println("*** Case 3 using * operator ***");
		int e =5;
		int f =10;
		e=e*f;
		f=e/f;
		e=e/f;
		System.out.println(e);
		System.out.println(f);
		
		System.out.println("*** Case 4 using ^ operator ***");
		int g =5;
		int h =10;
		g=g^h;
		h=g^h;
		g=g^h;
		System.out.println(g);
		System.out.println(h);
		
	

	}

}
