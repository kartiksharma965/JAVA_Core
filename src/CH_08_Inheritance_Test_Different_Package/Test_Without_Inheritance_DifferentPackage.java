package CH_08_Inheritance_Test_Different_Package;

import CH_06_Inheritance.Example_1;

public class Test_Without_Inheritance_DifferentPackage {

	public static void main(String[] args) {
		System.out.println("## Scenario 1 :- using reference and object of Parent class  ##");
        /* Rule = We can access Public member from different classes and package. */
		Example_1 obj1 = new Example_1();
		System.out.println(obj1.a);
		obj1.test1();
	}
}
