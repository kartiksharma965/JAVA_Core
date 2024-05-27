package CH_08_Inheritance_Test_Different_Package;

import CH_06_Inheritance.Example_1;

public class Test_Inheritance_DifferentPackage extends Example_1{

	public static void main(String[] args) {
		System.out.println("## Scenario 1 :- using reference and object of Child class  ##");
		/* Rule = In this scenario we can only access only Public and Protected members 
		 *        from different classes and package having Inheritance relationship.  */
		Test_Inheritance_DifferentPackage obj = new Test_Inheritance_DifferentPackage();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.test1();
		obj.test2();
		
		System.out.println("## Scenario 2 :- using reference and object of Parent class  ##");
        /* Rule = We can access Public member from different classes and package. */
		Example_1 obj1 = new Example_1();
		System.out.println(obj1.a);
		obj1.test1();
		
		System.out.println("## Scenario 3 :- using referrence of Parent class and object of Child class  ##");
		/* Rule = We can access Public member from different classes and package. */
		Example_1 obj2 = new  Test_Inheritance_DifferentPackage();
		System.out.println(obj2.a);
		obj2.test1();
	}
}
