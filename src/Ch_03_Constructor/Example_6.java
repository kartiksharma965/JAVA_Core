package Ch_03_Constructor;
/*
 Question) In below script if we comment (remove) Default constructor then what happen?
 Answer => If we explicitly specify parameterized constructor to Class then JVM will not keep by Default constructor.
           When we try to create object of default constructor then as result compile time error occurs.
           Note => Default Constructor code is not written.  
 */
public class Example_6 {
	/*
	Example_6(){
		System.out.println("I am Default constructor from Example_6");
	}
	*/
	
	Example_6(int a){
		System.out.println("I am Integer constructor from Example_6");
	}

	public static void main(String[] args) {
	    /* Rule = If we create object of default constructor then as result compile time error occurs.
	     * Example_6 obj = new Example_6();
	     * 
	     * Solution = Remove above code of Integer constructor.
	     */
		
		

	}

}
