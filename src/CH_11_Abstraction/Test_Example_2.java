package CH_11_Abstraction;

public class Test_Example_2 extends Example_2{
	
	int a = 12;
	int b = 144;
	
	// Method defined in Test_Example_2 class
	public void test1() {
		System.out.println("test1() non abstract method that is defined in Test_Example_2");
	}
    
	// we are implementing all unimplemented abstract method of abstract class
	@Override
	void test2() {
	System.out.println("We are implementing abstract method of abstract class (Example_2)");
	}
	
	void test3() {
		System.out.println("test3() method that is only defined in Test_Example_2 ");
		}
	public static void main(String[] args) {
	/*Rule = We can not create reference and object of abstract class 
	         as compile time error (CTE) is displayed.
	 
	 Example_2 obj = new Example_2; // CTE.
	 */
	/*Rule = We can create reference of abstract class and object of child class.
	        We can access all variable and method of abstract class
	 */
     System.out.println("*** Scenario of abstract class reference and child class object ***");
     Example_2 obj = new Test_Example_2();
     /* Rule = Variable always depends upon reference.
              
         In below case variable values from parent class (Example_2) is always called. 
      */
     System.out.println(obj.a);
     System.out.println(obj.b);
     /*Note => In case if we comment out variable a and b  in parent class 
      *       then as result runtime error occurs. 
     */
     /* Rule = Method call @ compile time depend on reference.
             However method call @ runtime depend upon object
      
        In below case methods will be called from child class
      */
     
     obj.test1();
     obj.test2();
      
     System.out.println("*** Scenario of reference and object of child class");
     Test_Example_2 obj1 = new Test_Example_2();
     /* Rule = Variable always depends upon reference.
     
     In below case variable values from child class (Test_Example_2) is always called. 
     */
     System.out.println(obj1.a); 
     System.out.println(obj1.b);
     /* Rule = Method call @ compile time depend on reference.
     However method call @ runtime depend upon object

       In below case methods will be called from child class
      */
      obj1.test1();
      obj1.test2();
      obj1.test3();
     
     
	}


}
