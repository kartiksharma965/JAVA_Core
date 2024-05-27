package CH_11_Abstraction;
/* Rule = Create a normal class and extend abstract class abstract
 * Observe as result method that were not implemented in interface previously will be display.
 */

public class Test_Example_3_Absctract_Class_A_extension extends Test_Example_3_Absctract_Class_A{

	@Override
	public void test1() {
	System.out.println("Remaining methods are called from Test_Example_3_Absctract_Class_A_extension");
	}

	@Override
	public void test2() {
	System.out.println("Remaining methods are called from Test_Example_3_Absctract_Class_A_extension");
	}
 
	public static void main(String[] args) {
		// reference of Abstract class and object of child class.
	Test_Example_3_Absctract_Class_A obj = new Test_Example_3_Absctract_Class_A_extension();
	obj.test1();
	obj.test2();
	obj.test3();
	}

	}

