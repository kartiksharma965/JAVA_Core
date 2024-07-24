package CH_23_Type_Casting;

public class Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A B = (C) D;

		// Case 1
		Object o = new String("welcome"); // o is object of String class.
		StringBuffer sb = (StringBuffer) o; //Rule1-yes, Rule2 -yes,  Rule3 -failed.

		// Rule 1 (pass) = 'C'(StringBuffer) is having parent child relation with 'D' (Object) class.
		// Rule 2 (pass) = 'A' and 'C' class relation is same.
		// Rule 3 (fails) = 'C' (StringBuffer) is not having any direct relation with'D' (object of string class).

		// Case 2
		String s = new String ("Welcome");
		// StringBuffer Sb1 = (StringBuffer)s; // Rule 1-failed.

		// Rule 1 (failed) = 'C' (StringBuffer) is not having any direct relation with'D'(String class).

		// Case 3
		Object o1=new String("welcome");
		//StringBuffer sb=(String) o1;   //Rule1-passed  Rule2-failed.

		// Rule 1 (pass) = 'C'(StringBuffer) is having parent child relation with 'D' (Object) class.
		// Rule 2 (fails) = 'C' (String) is not having any direct relation with'A' (StringBuffer class).

		// Case 4
		String s2=new String("welcome");
		//StringBuffer sb=(String) s2;   //Rule1-passed  Rule2-failed.

		// Rule 1 (pass) = 'C'(String) is having same relationship  with 'D' (String) class.
		// Rule 2 (fails) = 'C' (String) is not having any direct relation with'A' (StringBuffer class).

		// Case 5
		Object o3=new String("welcome");
		StringBuffer sb3=(StringBuffer) o3;  //Rule1- passed  Rule2- passed  Rule3-failed.

		// Rule 1 (pass) = 'C'(StringBuffer) is having parent child relation with 'D' (Object) class.
		// Rule 2 (pass) = 'A' and 'C' class relation is same.
		// Rule 3 (fails) = 'C' (StringBuffer) is not having any direct relation with'D (Object of String) class.

		// Case 6
		Object o4=new String("welcome");
		String s5=(String) o4;  //Rule1-passed  Rules2-passed Rule3-passed

		// Rule 1 (pass) = 'C'(String) is having parent child relation with 'D' (Object) class.
		// Rule 2 (pass) = 'A' and 'C' class relation is same.
		// Rule 3 (pass) = 'C' (String) is same as 'D' (object of string class).




	}

}
