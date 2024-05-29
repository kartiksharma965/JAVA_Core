package CH_20_Encapsulation;

public class Test_Example_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example_3 employee = new Example_3();
		// since we have not defined value so null is displayed.
		System.out.println(employee.getEmployee_name());
		System.out.println(employee.getEmployee_Id());
		employee.setGender('t');
		employee.setMobile_number(96696963);
		System.out.println(employee.getMobile_number());
		// generic inbuild class of selenium the value of pie
		System.out.println(Math.PI);
		
		

	}

}
