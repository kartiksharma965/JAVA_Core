package CH_16_Throws;

import java.io.IOException;

public class Example_2 {

	void test1() throws IOException {
		throw new IOException("I am from throws IO Exception");
	}
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Example_2 obj = new Example_2();
		// Since we are calling test1() so we have to declare IOException for main method as well.
		obj.test1();

	}

}
