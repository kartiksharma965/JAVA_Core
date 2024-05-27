package CH_11_Abstraction;

public abstract class BankAbstractClass {

	void test1() {
		System.out.println("I belong to BankAbstractClass");
	}
	
	public void OpenAccount() {
		System.out.println("Please collect form of opening a account from respected bank");
	}

	public abstract void RateOfInterest();
}
