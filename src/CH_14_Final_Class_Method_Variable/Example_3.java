package CH_14_Final_Class_Method_Variable;
/**
 Rule 1 = If a variable is not final than its value can be reassigned successfully. 
 
 Rule 2 = Final variable cannot be reassigned to other value if we do so then compile time error is displayed.
 
 Rule 3 = Final value must initialized . If it is not initialized then compile time error is  displayed.
 
 Rule 4 = When we try to reinitialize value of final variable(already initialized) through constructor  then compile time error occur.
 
 Rule 5 = If Final variable is not initialized then we can initialize through constructor of class.
 */

public class Example_3 {

// Rule 1 = If a variable is not final than its value can be reassigned successfully. 
	
	int a =8;
	void test1() {
	a=88;
	System.out.println("Value of nonstatic variable A after reassigning through anymethod = "+a);
	}
	
// Rule 2 = Final variable cannot be reassigned to other value if we do so then compile time error is displayed.

	final int b =9;
	void test2() {
	// b=99; compile time error occurs if we try to reassign value of final variable.
	}
	
	
/* Rule 3 = Final value must initialized . If it is not initialized then compile time error is  displayed.
    final int c; // compile time error occurs.
  */  
	final int c =7;
	
	/*
	 Rule 4 = When we try to reinitialize value of final variable(already initialized) through constructor  then compile time error occur.

	Example_3(){
		c=77;//// compile time error occurs if we try to reinitialize value of final variable through constructor.
	}
	*/
	/*
	 Rule 5 = If Final variable is not initialized then we can initialize through constructor of class.
	  * @param args
	  */
	final int d;
	
	Example_3(){
		d=108;
		System.out.println("Value of final variable d after initialize through constructor of class");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Example_3 obj = new Example_3();
	System.out.println("Calling non static variable a ="+obj.a);
	obj.test1();
	System.out.println("Calling a non static variable a after its value is already assigned="+obj.a);
    System.out.println("Calling final variable b="+obj.b);
    System.out.println("Calling final variable c="+obj.c);
    System.out.println("Calling final variable d="+obj.d);
    
	}

}
