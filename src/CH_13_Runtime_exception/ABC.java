package CH_13_Runtime_exception;

public class ABC {

	/**  Class cast Exception
	 When an object can't be casted to another type then we get this error.*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		A a= new B(); //B type is 'auto up casted' to A type.
		B b=(B)a; // A type is 'explicitly down casted' to B type.
		C c=(C)a; // Here we will get 'Class cast exception'.
		System.out.println(c.k);
	}
}
