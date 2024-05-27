package CH_11_Abstraction;

public class Test_Example_1 extends Example_1{

	/*Rule =  By default this method has 'Default' access modifier.  */
	@Override
	void test2() {
		// TODO Auto-generated method stub
		
	}

	/*Rule = We can increase access of any member of parent class.
	  eg public from default is allowed.
	 */
	@Override
	public void test3() {
		// TODO Auto-generated method stub	
	}
	
	/*Rule = We can decrease access of any member of parent class.
	  eg private from default is not allowed.If we do so then compile time error occurs.
	  public void test3() { // CTE
	}
	 */

}
