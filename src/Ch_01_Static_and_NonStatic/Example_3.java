package Ch_01_Static_and_NonStatic;

/*
  Static Member 
  They are class member.
  Static member will be executed once per class.
  Static member get loaded to memory once.
  In case of Static member,
  even if we call it for 10 time also it will not occupy extra space in memory. Since it is class member.
  
  Non Static Member
  They will get loaded as many as we create object.
  e.g. If we create 2 or more object in java.
  Now when I call this method. Then in heap area of memory it will occupy extra space.
 */

public class Example_3 {
	int a;
	static int b;
	
	public void test1() {
		System.out.println(a=21);
		System.out.println(b=51);
	}

	public static void test2() {
		System.out.println(b=3);
	}
	public static void main(String[] args) {
		/*
		 Static member are class member.
		 Even if static member is called 10 times then also it will only occupy extra space in memory.
		 Note => Always call static member directly or by class name
		 */
	   // Priority 1 = calling static member directly	
       test2();
       System.out.println(b);
       
       // Priority 2 = calling static member by class name.
       Example_3.test2();
       System.out.println(Example_3.b);
       
        /*
         Non static member will be loaded in heap area as many time we create Objects.
         If we create 10 objects than Non static member will get loaded to heap area in memory.
         */
       
       // calling static and non static method using object
       Example_3 obj = new Example_3();
       obj.test1();
       obj.test2();
       System.out.println(obj.a);
       System.out.println(obj.b);
       
	}

}
