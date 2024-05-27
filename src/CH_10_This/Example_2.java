package CH_10_This;
/* Rule of this() keyword
 * a) this() is used to differentiate between local variable and global variable.
 * b) this() is used to call current class constructor.
 * c) this() can be used as method argument. This refer to current class.
 * d) Using this() we can call non static member.
 * e) this() will be available for non static member.
 * f) In Non static method using this() we can call static variable.
 * g) this() can not be used inside static method as compile time error occurs.
 */

public class Example_2 {
	
	int a, b, c;
	
	Example_2() {
	System.out.println("I am from Default constructor Example_2()");
	}
	
	Example_2(int a) {
	// Rule = this() keyword is used to call current class default constructor.
	this();	
	System.out.println("Inital value of global variable a ="+this.a);
	// Rule = In below scenario we are assigning runtime value to global variable.
	this.a=a;
	System.out.println("I am from Integer constructor of Example_2(int a)");
	}
	
	Example_2(int a, int b) {
	// Rule = this(int a) keyword is used to invoke integer constructor.
	this(3);
	this.a = a;
	this.b = b;
	System.out.println("I am from Integer constructor of Example_2(int a, int b)");
	}
	
	Example_2(int a, int b , int c){
	// Rule = this(int a, int b) keyword is used to invoke integer constructor.
	this(6,6);
	this.a = a;
	this.b = b;
	this.c = c;
	System.out.println("I am from Integer constructor of Example_2(int a, int b, int c)");
	}
	
	void display() {
	System.out.println("Inside display() method value of a ="+a);
	System.out.println("Inside display() method value of b ="+b);
	System.out.println("Inside display() method value of c ="+c);
	}
	public static void main(String[] args) {
	System.out.println("##  Invoking Integer constructor Example(int a, int b, int c)  ##");
	Example_2 obj = new Example_2(3,6,9);
	obj.display();
	}
}
