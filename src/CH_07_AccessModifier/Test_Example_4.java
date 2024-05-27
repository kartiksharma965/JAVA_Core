package CH_07_AccessModifier;

public class Test_Example_4 {

	public static void main(String[] args) {
	
	Example_4 obj = new Example_4();
	obj.setAge(37);
	obj.setName("Kartik Sharma");
	
	System.out.println("My name is  = "+obj.getName());
	System.out.println("My age is = "+obj.getAge());
	}
}
