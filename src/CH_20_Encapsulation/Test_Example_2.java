package CH_20_Encapsulation;

public class Test_Example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Example_2 employee = new Example_2();
    // using setter method proving values to method
    employee.setCompanyName("Capgemini");
    employee.setEmployeeName("Kartik Kumar");
    // using getter method displaying values.
    System.out.println(employee.getCompanyName());
    System.out.println(employee.getEmployeeName());
    
    
    
	}

}
