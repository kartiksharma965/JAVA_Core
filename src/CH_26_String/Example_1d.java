package CH_26_String;

public class Example_1d {
// Seprating Numeric and Alphabets in Sring.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Interview of Java 23456 C 123455";
		String alpha = "";
		String numeric = "";
		//String specialCharater = "";
		
		for(int i = 0; i<str.length()-1;i++) 
		{
		 char ch=str.charAt(i);
		 
		 if(Character.isDigit(ch))
		 { 
		 numeric= numeric+ch; 
		} else{
			alpha = alpha+ch;
		} }
		
		System.out.println("Numeric value = "+numeric);
		System.out.println("Alphabetic value ="+alpha);
		
			
	
		
		

	}

}
