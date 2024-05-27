package CH_15_Finally_Block;

public class Example_3 {
	
	void test1() {
		try {
			int a[]= new int[5];
			a[5]=55;
		}finally {
			System.out.println("I belong to finally block");
		}
	}

	public static void main(String[] args) {
		Example_3 obj= new Example_3();
		obj.test1();

	}

}
