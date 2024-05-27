package CH_15_Finally_Block;
/*
Garbage collector = Garbage collector will collect all object having no reference then 
destroy them to free memory space.

Rule = Finalize() method will be called before Garbage collector.
       This Finalize method will perform some clean up just before garbage collector.
*/
public class Example_1 {
	
	public void finalize() {
		System.out.println("finalize() method will be called before Garbage collector.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_1 obj1= new Example_1();
		Example_1 obj2= new Example_1();
		Example_1 obj3= new Example_1();
		Example_1 obj4= new Example_1();
		Example_1 obj5= new Example_1();
		Example_1 obj6= new Example_1();
		obj1= null;
		obj2= null;
		obj3= null;
		obj4= null;
		obj5= null;
		obj6= null;
		
		// Calling garbage collector manually.finalize method is called before garbage collector.
		System.gc();
		
		
	}

}
