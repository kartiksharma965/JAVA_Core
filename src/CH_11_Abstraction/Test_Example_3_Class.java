package CH_11_Abstraction;
/*Rule = When a normal class implement interface then it has to 
implement all unimplemented method of interface.
*/

public class Test_Example_3_Class implements Example_3_Interface{

	@Override
	public void test1() {
	System.out.println("test1() method is implemented in Test_Example_3");
	}

	@Override
	public void test2() {
	System.out.println("test2() method is implemented in Test_Example_3");
	}

	@Override
	public void test3() {
	System.out.println("test3() method is implemented in Test_Example_3");
	}
	

	
	public static void main(String[] args) {
		
		Example_3_Interface obj = new Test_Example_3_Class();
		obj.test1();
		obj.test2();
		obj.test3();	
	}
	

}
