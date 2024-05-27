package CH_12_Interface;

public class Test_InterfaceAandB implements Interface_A, Interface_B {

	int e =16;
	int f=21;

	void test3() {
		System.out.println("test3() specifically belong to Test_InterfaceAandB class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *Rule=  We cannot create object of Interface. If we try to do so then as result compile time error occurs.Hence commenting it.
		 *InterfaceA ob = new InterfaceA();
		 *InterfaceB ob1 = new InterfaceB();
		 */

		// Rule = We can only create reference of interface and can only access variable and method of this interface only.
		System.out.println("*** We are using reference of InterfaceA ***");

		Interface_A obj = new Test_InterfaceAandB();
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.test1();

		// Rule = We can only create reference of interface and can only access methods and variable of this interface only.
		System.out.println("*** We are using reference of InterfaceB ***");

		Interface_B obj1= new Test_InterfaceAandB();
		System.out.println(obj1.c);
		System.out.println(obj1.d);
		obj1.test2();

		//Rule = using reference and object of Testclass we can access all method and variable of InterfaceA , InterfaceB and Testclass.
		System.out.println("*** We are using reference and object of TestInterfaceAB() ***");
		Test_InterfaceAandB obj2 = new Test_InterfaceAandB();
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		System.out.println(obj2.c);
		System.out.println(obj2.d);
		System.out.println(obj2.e);
		System.out.println(obj2.f);
		obj2.test1();
		obj2.test2();
		obj2.test3();

	}

	@Override
	public void test1() {
		System.out.println("test1() is now implemented in Test_InterfaceAandB class");
	}

	@Override
	public void test2() {
		System.out.println("test2() is now implemented in Test_InterfaceAandB class");
	}

}
