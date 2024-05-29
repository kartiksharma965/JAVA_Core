package CH_21_String;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 21;
		int b = 32;
		
		if(a>b) {
			System.out.println("a is greater than b");
		} else {
			System.out.println("b is greater than a");
		}

		int c = 52;
		int d = 52;
		
		if (c==d) {
			System.out.println("c and d are equal");
		} else {
			System.out.println("c and d are npt equal");
		}
		
		int a1 = 100;
		int b1 = 200;
		int c1 = 300;
		
		// nested if else condition
		
		if (a1>b1 & a1>c1) {
			System.out.println("a1 is greatest");
		} else if (b1>c1) {
			System.out.println("b1 is greatest");
		}else {
			System.out.println("c1 is greatest");
		}
	}

}
