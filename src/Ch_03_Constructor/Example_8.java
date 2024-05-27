package Ch_03_Constructor;

public class Example_8 {
	
	// Global variable
	int a, b, c;
	
	Example_8(){
	System.out.println("I am Default constructor from Example_8");	
	}
	
	Example_8(int a){
	//Runtime value of variable a is assigned accordingly to global variable a.
	this.a=a;
	System.out.println("I am Integer constructor from Example_8 having value of int a");
	}
	
	Example_8(int a , int b){
	// Runtime values of variable a and b is assigned accordingly to global variable a and b.
	this.a=a;
	this.b=b;
	System.out.println("I am Integer parametarized constructor from Example_8 having value of int a and int b");
	}
	
	Example_8(int a, int b, int c){
	// Runtime values of variable a,b and c is assigned accordingly to global variables a,b and c.
	this.a=a;
	this.b=b;
	this.c=c;
	System.out.println("I am Integer parametarized constructor from Example_8 having value of int a, int b and int c");
	}
	
	void display() {
	System.out.println("Value of a ="+a);
	}
	
	void display_1() {
	System.out.println("Value of a and b ="+a+";"+b);
	}
	
	void display_2() {
	System.out.println("Value of a , b and c ="+a+";"+b+";"+c);
	}
	
	void sum() {
	int d =a+b;
	System.out.println("Sum of variable a and b ="+d);
	}
	
	void sum_1() {
	int f =a+b+c;
	System.out.println("Sum of variable a , b and c ="+f);
	}
	
	public static void main(String[] args) {
	System.out.println("## Invoking Default constructor ##");
	// Rule = Value of Default constructor is not initialized as result 0(zero) is displayed.
	Example_8 obj =new Example_8();
	obj.display();
	obj.display_1();
	obj.display_2();
	obj.sum();
	obj.sum_1();
	
	System.out.println("## Invoking Integer constructor with single value a as 3 ##");
	Example_8 obj1 = new Example_8(3);
	// Rule = Value (3) is initialized  for Integer constructor as result value(3) is displayed
	obj1.display();
	obj1.display_1();
	obj1.display_2();
	obj1.sum();
	obj1.sum_1();
	
	System.out.println("## Invoking Integer constructor with two value a, b as 3, 6  ##"); 
    Example_8 obj2 = new Example_8(3,6);
    // Rule = Value (3,6) is initialized for Integer constructor as result value (3,6) is displayed.
    obj2.display();
    obj2.display_1();
    obj2.display_2();
    obj2.sum();
    obj2.sum_1();
    
    System.out.println("## Invoking Integer constructor with three value a, b ,c as 3, 6,9  ##"); 
    Example_8 obj3 = new Example_8(3,6,9);
    // Rule = Value (3,6,9) is initialized for Integer constructor as result value (3,6,9) is displayed.
    obj3.display();
    obj3.display_1();
    obj3.display_2();
    obj3.sum();
    obj3.sum_1();

	}

}
