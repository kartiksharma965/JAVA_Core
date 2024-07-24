package CH_25_String_Basic_Method;

public class Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// split() - split/divide the string in multiple parts based on delimiter.
		
		System.out.println("*** Case1 ***");
		String s = "abc@xyz";
		String a[]=s.split("@");
		System.out.println(a[0]);
		System.out.println(a[1]);
		
		System.out.println("*** Case2 ***");
		String s1 = "abc@gmail.com";
		String a1[]=s1.split("@");
		System.out.println(a1[0]);
		System.out.println(a1[1]);
		
		System.out.println("*** Case3 ***");
		String s2 = "abc 123 xyz";
		String a2[]=s2.split(" ");
		System.out.println(a2[0]);
		System.out.println(a2[1]);
		System.out.println(a2[2]);
		
		System.out.println("*** Case4 ***");
		String s3="abc,123@xyz";
		String a3[]=s3.split(",");
		System.out.println(a3[0]);
		System.out.println(a3[1]);
		
		// Important
		String a4[]=a3[1].split("@");
		System.out.println(a4[0]);
		System.out.println(a4[1]);
		
		

	}

}
