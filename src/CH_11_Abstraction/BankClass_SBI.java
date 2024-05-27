package CH_11_Abstraction;

public class BankClass_SBI extends BankAbstractClass {

	public static void main(String[] args) {
	BankAbstractClass obj = new BankClass_SBI();
	obj.test1();
	obj.OpenAccount();
	obj.RateOfInterest();
	}

	@Override
	public void RateOfInterest() {
	System.out.println("Rate of Interest on FD for SBI Bank = 7.0 %");
	}

}
