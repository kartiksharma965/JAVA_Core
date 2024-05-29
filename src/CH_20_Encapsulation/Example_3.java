package CH_20_Encapsulation;
/**
 * 	Private variable 	     Getter	           Setter
	employee_Id	             read = yes	       write = no
	employee_name	         read = yes	       write = no
	mobile_number	         read = yes	       write = yes
	gender	                 read = yes	       write = yes
	company_name	         read = no	       write = no
	age	                     read = no	       write = no

 */
public class Example_3 {
	private int employee_Id;
	private String employee_name;
	private int  mobile_number;
	private char gender;
	private static String CompanyName;
	private int age;
 
	public int getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(int mobile_number) {
		this.mobile_number = mobile_number;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		//apply check in gender
		if(gender=='M'|| gender=='f'||gender=='o')
		{
		this.gender = gender;
	}else {
		System.out.println("please provide a valid gender");
	}}
	public int getEmployee_Id() {
		return employee_Id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
}
