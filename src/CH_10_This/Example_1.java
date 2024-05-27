package CH_10_This;
/* Rule 
 * a) The scope of these local variable will only be limited to main() method.
 * b) We must create object of class to access global variable and non static method.*/

public class Example_1 {
	
	int a = 9;
	int age = 99;
	
	static int b = 21 ;
	static int length = 2121;
	
	void display() {
	int a = 6;
	int age = 66;
	System.out.println("Inside display() method local value of a = "+a);
	System.out.println("Inside display() method local value of age = "+age);
	}

	public static void main(String[] args) {
    /* Rule 
     * a) The scope of these local variable (i, j) will only be limited to main() method.
     * b) Inside method we must call local variable directly.*/
	System.out.println("##  Inside main() method calling local variables directly  ##");	
	int a = 5;
	int age = 55;
	System.out.println("Inside main() method local value of a = "+a);
	System.out.println("Inside main() method local value of age = "+age);
	
	System.out.println("##  Creating object of class to acess global variable and non static method  ##");
    Example_1 obj =new Example_1();
    System.out.println("Global variable value of i = "+obj.a);
    System.out.println("Global variable value of age = "+obj.age);
    obj.display();
    System.out.println("##  Directly calling Global static variable  ##");
    System.out.println(b);
    System.out.println(length);
	}
}
