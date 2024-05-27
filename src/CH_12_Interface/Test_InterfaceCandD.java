package CH_12_Interface;

public class Test_InterfaceCandD implements Interface_C, Interface_D{

	int l;

	public void test1() {
		System.out.println("Static method that belong to Test_InterfaceCandD class");
	}

	public static void main(String[] args) {
		Test_InterfaceCandD obj = new Test_InterfaceCandD();

		System.out.println(obj.i);
		System.out.println(obj.j);
		System.out.println(obj.k);
		System.out.println(obj.l);
		obj.test1();
		obj.sub();
		obj.sum();
		obj.multiply();
	}

	@Override
	public void multiply() {
		System.out.println("multiply i and j"+(i*j));
		System.out.println("multiply i , j and k"+(i*j*k));
		System.out.println("multiply i , j , k and l"+(i*j*k*l));	
	}

	@Override
	public void sum() {
		System.out.println("sum i and j"+(i+j));
		System.out.println("sum i , j and k"+(i+j+k));
		System.out.println("sum i and j"+(i+j+k+l));	
	}

	@Override
	public void sub() {
		System.out.println("subtract i+j+k-l"+(i+j+k-l));
		System.out.println("subtract i+j-k-l"+(i+j-k-l));
		System.out.println("subtract i-j-k-l"+(i-j-k-l));
	}

}
