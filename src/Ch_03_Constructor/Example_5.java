package Ch_03_Constructor;
/*
 * JVM by default create 'Default constructor' even when it is not created in class.
 * Whenever we create object of any class. Basically we are creating object of default constructor.
 */
public class Example_5 {
	
	Example_5(){
	System.out.println("I am Default constructor from Example_5");
	}
	
	Example_5(int a){
	System.out.println("I am Integer constructor from Example_5");	
	}

	public static void main(String[] args) {
	
		Example_5 obj = new Example_5();
		Example_5 obj1 = new Example_5(2);
		

	}

}
