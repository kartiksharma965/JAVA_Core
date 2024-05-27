package CH_16_Throws;
/** 
 *Rule
 1. The Java through keyword is used to explicitly (forcefully) throw an exception.
 2. We can through either checked or unchecked exception in java by throw keyword.
 3. Throw keyword is used to throw custom exception.
 
 Note = When we want to throw exception based on condition then we can use throw keyword.
      = This will help us to throw exception at runtime.
 */
public class Example_1 {

	public void ValidAge(int age) {
		if(age<18) {
			throw new ArithmeticException("Person age is not valid for voting");
			
		} if (age>18) {
			System.out.println("Person is authorized to vote");
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Example_1 obj= new Example_1();
		obj.ValidAge(37);
		obj.ValidAge(12);

	}

}
