package CH_07_AccessModifier;
/*
 * Accessing of modifier Example_1 and  Example_2 class are having no Inheritance relationship.
 * 
 * Rule = Private member can not be called in other class. Compile time error occurs.
 */

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example_1 obj = new Example_1();
		System.out.println("##  Invoking object of Example_1 class having no inheritance relationship  ##");
		System.out.println(obj.a);
		System.out.println(obj.b);
		// System.out.println(obj.c); Private member can not be called from Parent Class.
		System.out.println(obj.d);
		
		obj.test1();
		obj.test2();
		// obj.test3(); Private member can not be called from Parent Class.
		obj.test4();

	}

}
