package CH_22_Wrapper_Class;

public class Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Primitive
		int i = 10;
		double j = 10.5;
		char k = 'o';
		boolean l = true;
		
		// Auto boxing :- Converting Primitive to Object type.
		System.out.println("*** Auto boxing start ***");
		Integer i_object=i;
		Double j_object=j;
		Character k_object=k;
		Boolean l_object=l;
		
		
		System.out.println(i_object);
		System.out.println(j_object);
		System.out.println(k_object);
		System.out.println(l_object);
		System.out.println("*** Auto boxing ends ***");
		
		// Unboxing :- Converting Object to Primitive type.
		
		System.out.println("*** Unboxing start ***");
		
		int a_primitive = i_object;
		double b_primitive = j_object;
		char c_primitive = k_object;
		boolean d_primitive =l_object;
		
		System.out.println(a_primitive);
		System.out.println(b_primitive);
		System.out.println(c_primitive);
		System.out.println(d_primitive);
		System.out.println("*** Unboxing ends ***");
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
