package CH_22_Wrapper_Class;

public class Example_2 {
	
	public static void test1() {
		//Scenario 1:  String ---> int, double, boolean, char (not possible)**");
		System.out.println("*** test1() starts ***");
		System.out.println("*** String conversion into int, double, boolean,  char (not possible) ***");
		String s ="Welcome"; // can  not convert to number.
		// int 
		String s1 = "10";
		String s2 = "20";
		int sum=Integer.parseInt(s1)+Integer.parseInt(s2);
		System.out.println(sum);
		// double
		String s3 ="10.2";
		String s4 ="12.3";
		double sum1=Double.parseDouble(s3)+Double.parseDouble(s4);
		System.out.println(sum1);
		// boolean
		String s5 = "true";
		boolean b1=Boolean.parseBoolean(s5);
		System.out.println(b1);
		
		// Rule => String can not be converted to char
		System.out.println("*** test1() ends ***");
	}
	
	
	public static void test2() {
		System.out.println("*** test2() starts ***");
		System.out.println("*** int, double, boolean, char conversion into String ***");
		// int
		int a=100;
		String s =String.valueOf(a);
		System.out.println("string int value is ="+s);
		
		// double
		double b=100.11;
		String s1 =String.valueOf(b);
		System.out.println("string double value is ="+s1);
		
		// boolean
		boolean c= true;
		String s2 =String.valueOf(c);
		System.out.println("string boolean value is ="+s2);
		// char
		char d = 'o';
		String s3=String.valueOf(d);
		System.out.println("string char value is ="+s3);

		System.out.println("*** test2() ends ***");
	}
	
	public static void test3() {
		System.out.println("*** test3() starts ***");
		System.out.println("*** int converting to double ***");
		int a=100;
		double b =a;
		System.out.println("int value after converting into double is ="+b);
		
		System.out.println("*** double converting to int  ***");
		double a1=100.33;
		int  b1 =(int)a1;
		System.out.println("double value after converting into int is ="+b1);
		System.out.println("*** test3() ends ***");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		test1();
		test2();
		test3();
	}

}
