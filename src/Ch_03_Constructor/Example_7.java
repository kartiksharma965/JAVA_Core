package Ch_03_Constructor;

/* Rules
 * A) We can not create two 'Default Constructor' as compile time error occurs.
 * B) We can not create two 'Parameterized Constructor' as compile time error occurs.
 * Note => However, We can create two constructor having same argument but different data type.
 * 
 * Eg Example_7(int a) and Example_7(String a) 
 */

public class Example_7 {
	
	Example_7(){
		System.out.println("I am Default Constructor from Example_7");
	}
	
	Example_7(int a){
		System.out.println("I am Integer Constructor from Example_7");
	}
	
	Example_7(String a){
		System.out.println("I am String Constructor from Example_7");
	}
	/* 
	Rule = Compile time error will occur if we duplicate code (Default constructor, Integer constructor, String Constructor)
	
	Example_7(){
		System.out.println("I am Default Constructor from Example_7");
	}
	
	Example_7(int a){
		System.out.println("I am Integer Constructor from Example_7");
	}
	
	Example_7(String a){
		System.out.println("I am String Constructor from Example_7");
	}
	 
	 */
	
	public static void main(String[] args) {
		
		System.out.println("## Invoking Default Constructor ##");
		Example_7 obj = new Example_7();
		System.out.println("## Invoking Integer Constructor ##");
		Example_7 obj1 = new Example_7(3);
		System.out.println("## Invoking String Constructor ##");
		Example_7 obj2 = new Example_7("OHM");

	}

}
