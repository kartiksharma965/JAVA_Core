package CH_11_Abstraction;
/* Rule = When abstract class implement interface then we can implement 
 *        selected method based on our requirement.
 *        So out of 3 method we are only defining test3() in abstract class.
 *        Remaining 2 methods will be defined in class .*/

public abstract class Test_Example_3_Absctract_Class_A  implements Example_3_Interface{

	public void test3() {
	System.out.println("Only single method test3() is implemented in abstract class (Test_Example_3_Absctract_Class_A )");
	}
	
}
