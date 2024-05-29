package CH_20_Encapsulation;

/* Test_Example_1 class is able to access all variable and methods of Example_1 class.
 * In short there is no security of data here.
 */

public class Test_Example_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example_1 employee= new Example_1();
		employee.empId=44;
		employee.age=37;
		employee.CompanyName="Capgemini";
		employee.gender='m';
		//employee.mobileNo='98765432108080080800;
		employee.salaray=10000.500;
		System.out.println(employee.empId);
		System.out.println(employee.age);
		System.out.println(employee.CompanyName);
		System.out.println(employee.gender);
		System.out.println(employee.salaray);
		employee.doWork();
	}
}
