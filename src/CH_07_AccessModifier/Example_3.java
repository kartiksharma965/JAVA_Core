package CH_07_AccessModifier;
/*
 * Accessing of modifier Example_1 (Parent class) and Example_2 (Child class) class having Inheritance relationship.
 * 
 * Rule = Private member can not be called in other class. Compile time error occurs.
 */

public class Example_3 extends Example_1{

	public static void main(String[] args) {
		
		System.out.println("## Scenario 1 :- using reference and object of Child class  ##");
		// Rule = Private member can not be called from Parent Class.
		Example_3 obj1 = new Example_3();
		System.out.println(obj1.a);
		System.out.println(obj1.b);
		//System.out.println(obj1.c); Private member can not be called from Parent Class.
		System.out.println(obj1.d);
		
		obj1.test1();
		obj1.test2();
		//obj1.test3(); Private member can not be called from Parent Class.
		obj1.test4();
		
		System.out.println("## Scenario 2 :- using reference and object of Parent class  ##");
		// Rule = Private member can not be called from Parent Class.
		Example_1 obj = new Example_1();
		System.out.println(obj.a);
		System.out.println(obj.b);
		// System.out.println(obj.c); Private member can not be called from Parent Class.
		System.out.println(obj.d);
		obj.test1();
		obj.test2();
		// obj.test3(); Private member can not be called from Parent Class.
		obj.test4();
		
		System.out.println("## Scenario 3 :- using referrence of Parent class and object of Child class  ##");
		// Rule = Private member can not be called from Parent Class.
		Example_1 obj2 = new Example_3();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		// System.out.println(obj2.c); Private member can not be called from Parent Class.
		System.out.println(obj2.d);
		
		obj2.test1();
		obj2.test2();
		// obj2.test3(); Private member can not be called from Parent Class.
		obj2.test4();
	}
}
