package CH_08_Inheritance_Test_Different_Package;

import CH_07_AccessModifier.Example_1;

public class AccessModifier_without_Inheritance_DifferentPackage {

	public static void main(String[] args) {
		System.out.println("## Scenario 1 :- using reference and object of Parent class  ##");
        /* Rule = We can access Public member from different classes and package. */
		Example_1 obj = new Example_1();
		System.out.println(obj.a);
		obj.test1();		
	}
}
