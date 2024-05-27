package CH_14_Final_Class_Method_Variable;
/**
Rule 1 =  We cannot establish inheritance relationship with final class . If try then compile time error occurs.
                             or
 if we try to extend parent class of final type in child class. Then as a result compile time error occurs. refer below code

public class TestFinalClass extends Final_Class {
}

 */

public class Test_Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Rule 2 = We can only access final class through object and reference of final class in other class.
            Note we are not establishing inheritance relationship between them. 
		 */
		Example_1 obj = new Example_1();
		obj.test1();
		obj.test2();
		obj.test3();
		obj.test5();
		obj.test6();
		/* Rule 3 = Private method from Parent class can not be inherited into child class.
		obj.test4();
		 */

	}

}
