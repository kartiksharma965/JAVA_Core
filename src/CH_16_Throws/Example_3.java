package CH_16_Throws;

import java.io.IOException;

public class Example_3 {
	
	public void test1() throws IOException {
		throw new IOException("I am from throws IO Exception");
	}
	
	void test2() throws IOException {
		System.out.println("I am running from test2()");
		// Since we are calling test1() method. So we have to declare IOException for test2() method
		test1();
	}

	public static void main(String[] args) throws IOException {
		Example_3 obj = new Example_3();
		obj.test2();
		// TODO Auto-generated method stub

	}

}
