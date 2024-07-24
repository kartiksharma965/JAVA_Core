package CH_25_String_Basic_Method;


public class Example_1 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test1();
		test2();
		test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
	} 

	public static void test1() {
		System.out.println("*** Start test1() *** ");
		char ch [] = {'h' ,'e' ,'l','l','o'};

		String s =new  String(ch);
		System.out.println(s);

		String s1 = new String("hello");
		System.out.println(s1);

		System.out.println("Both the string are same");

		System.out.println("*** Ends test1() *** ");
	}

	public static void test2( ) {
		System.out.println("*** Start test2() *** ");

		String s = "Hello Java"; // H=0; e=1, l=2, l=3, o=4 , J=6, a=7, v=8, a=9

		// charAt()  returns charter value of particular string.
		System.out.println("String Charater value @6 index:- "+s.charAt(6));

		// length() returns string length
		System.out.println("Length of String s :="+s.length());

		// toLowerCase() returns string in lowercase.
		System.out.println("String value converted to lowercase:- "+s.toLowerCase());

		// toUpperCase() returns string in uppercase.
		System.out.println("String value converted to uppercase:- "+s.toUpperCase());
		System.out.println("*** End test2() *** ");
	}

	public static void test3() {
		System.out.println("*** Start test3() ***");

		String s = "Hello Java"; // H=0; e=1, l=2, l=3, o=4 , J=6, a=7, v=8, a=9

		// replace() replace old character with new character value in string.
		System.out.println(s.replace('a','e')); // Hello Jeve

		System.out.println(s.replace("Hello", "Namaste")); // Namaste Java
		
		String s1 ="!234$567&89*0";
		System.out.println(s1.replace("!", "").replace("$","").replace("&", "").replace("*", ""));

		// index() returns index of specific character. 
		System.out.println(s.indexOf('J')); // 6

		/** Scenario :- Incase we are searching for any character (y) that is not there in string.
		               So then as result -1 id displayed. */
		System.out.println(s.indexOf('y'));// -1)
		System.out.println(s.indexOf('j')); // -1 (it is case sensitive)


		// isEmpty() check if string is empty.
		System.out.println(s.isEmpty()); // false
		String s2 ="";
		System.out.println(s2.isEmpty()); // true

		// substring() returns substring for given start index.
		System.out.println(s.substring(6)); // Java
		System.out.println(s.substring(7)); // ava



		System.out.println("*** End test3() ***");

	}

	public static void test4() {
		System.out.println("*** Start test4() ***");
		
		// substring(int startIndex, int endIndex) returns a new string that is substring of this string.
		String s= "Welcome"; 
		/**Start Index (W =0 ,e=1 ,l=2 ,c=3 ,o=4 ,m=5 ,e=6)
		 * End Index   (W =1 ,e=2 ,l=3 ,c=4 ,o=5 ,m=6 ,e=7) */
		System.out.println(s.substring(3, 7));
		System.out.println(s.substring(0, 3));
		
		String s1= "I Love you";
		System.out.println(s1.substring(2,6));
		System.out.println(s1.substring(7,10));
		System.out.println("*** End test4() ***");
	}
	
	public static void test5() {
		System.out.println("*** Start test5() ***");
		
		// contains(CharacterSequence t) check if string contains specified character sequence.
		String s ="Welcome to Jungle";
		System.out.println(s.contains("jungle")); // false (contains() method is case sensitive).
		System.out.println(s.contains("hello"));  // false
		System.out.println(s.contains("come"));
		System.out.println(s.contains("Jungle"));
		
		
		// startWith(String str) check if string start with the specified substring.
		System.out.println(s.startsWith("welcome"));// false (contains method is case sensitive).
		System.out.println(s.startsWith("Welcome"));
		
		// startWith(Strinf str ,int startIndex) 
		// check if string start with the specified substring starting from the specified index. 
		System.out.println(s.startsWith("come" ,3));
		System.out.println(s.startsWith("Jungle", 11));
		
		
		// endWith(String str) check if string end with the specified substring.
		System.out.println(s.endsWith("jungle")); //false (endWith() method is case sensitive).
		System.out.println(s.endsWith("Jungle"));
		
		System.out.println("*** End test5() ***");
	}
	
	public static void test6() {
		System.out.println("*** Start test6() ***");
		
		String s1 = "Welcome";
		String s2 = "welcome";
		
		// equals(Object anotherObject) checks equality of string with object.
		System.out.println("Is S1 equals S2:- "+s1.equals(s2)); // false (equals() method is case sensitive).
		
		//equalsIgnoreCase(Object anotherObject) checks equality of string with object. Ignore case
		System.out.println("Is S1 equals S2:- "+s1.equalsIgnoreCase(s2)); //true
		
		System.out.println("*** End test6() ***");
	}
	
	public static void test7() {
		System.out.println("*** Start test7() ***");
		
		// concat() used to join/concatenate strings
		String s1 = "Satyam";
		String s2 = "Shivam";
		String s3 = "Sundram";
		System.out.println(s1+s2);
		System.out.println(s1.concat(s2));
		
		System.out.println(s1+s2+s3);
		System.out.println(s1.concat(s2).concat(s3));
		
		System.out.println("Shiv" + "Shakti");
		System.out.println("Shiv".concat("Shakti"));
		
		// trim() remove space from right side and left side.
		String s4 = "     GoriShankar       ";
		System.out.println("Before trim() method String length :- "+s4.length()); //23
		String s5=s4.trim();
		System.out.println("After trim() method String length :- "+s5.length());  //11
		System.out.println("*** End test7() ***");
	}
	
	public static void test8() {
		System.out.println("*** Start test8() ***");
		String s ="Uma Mahaishwari";
		System.out.println(s.contains("uma mahaishwari")); // false
		System.out.println(s.toLowerCase().contains("uma mahaishwari")); // true
		System.out.println(s.replace('U', 'u').replace('M', 'm').contains("uma mahaishwari"));
		
		System.out.println("*** End test8() ***");
	}
	
	public static void test9() {
		System.out.println("*** Start test9() ***");
		String s ="Durga Maa";
		// toCharArray() method converts this string into character array.
		char ch[]=s.toCharArray();// Converting string to character array.
		
		for(int i =0;i<ch.length;i++ ) {
			System.out.println(ch[i]);
		}
		
		System.out.println("*** End test9() ***");
	}
	
	
	



}
