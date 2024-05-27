package CH_11_Abstraction;

public class BankClass_IDFC extends BankAbstractClass{

	public static void main(String[] args) {
		BankClass_IDFC obj = new BankClass_IDFC();
		obj.test1();
		obj.OpenAccount();
		obj.RateOfInterest();
	}

	@Override
	public void RateOfInterest() {
	System.out.println("Rate of Interest on FD for IDFC Bank = 7.1 %");
	}

}
