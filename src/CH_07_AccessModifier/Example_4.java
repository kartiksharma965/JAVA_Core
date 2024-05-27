package CH_07_AccessModifier;
/*
 * Encapsulation :- It is mechanism of binding code and data together in single unit.
 */
public class Example_4 {
	/* Rule = Variable declared as Private.
	 *      = These Private variable can only be accessed by Public method.
	 */
	private int age;
	private String name;
	
	// Rule = Getter and Setter method to access Private variable.
	
	// generally = Firstly setter method, In this value is provided at runtime.
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	// generally = Secondly getter method, In this fetching value.
	public int getAge() {
		return age;
	}
	
	
	public String getName( ) {
		return name;
	}
	
}
