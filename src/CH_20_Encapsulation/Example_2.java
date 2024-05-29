package CH_20_Encapsulation;

/** Solution
  Encapsulation = It is mechanism of binding code and data together in single unit.
  
  Steps to follow
  => We can apply access modifier to our variable.
  => We can hide code by applying private access modifier on variable.
  => We can access this variable in other class with help getter and setter method.
 */


public class Example_2 {
	
	int employee_Id;
	private String employee_name;
	private static String company_name;
	
	//getter method of employee_name
	public String getEmployeeName() {
		return employee_name;
	}
	
	//setter method of employee_Name
	public void setEmployeeName(String employee_name) {
		this.employee_name=employee_name;
	}
	
	//getter method of company_name
    public String getCompanyName() {
    	return company_name;
    }
    
    //setter method of company_name
    public void setCompanyName(String company_name) {
    	this.company_name=company_name;
    }
}
