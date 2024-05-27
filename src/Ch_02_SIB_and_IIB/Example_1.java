package Ch_02_SIB_and_IIB;

 /*
    Static Initialization Block (SIB)
    
    Scenario =Whenever we are writing static block to any class.
     
    1) It will get loaded to memory the movement class will get loaded to memory.  
    2) It will get executed only once.
    3) Static block/ method will only consider Static member. 
    Note => SIB will never consider Non- Static member.
  */

public class Example_1 {
	
	static {
		System.out.println("I belong to SIB block 1");
	}
	
	static {
		System.out.println("I belong to SIB block 2");
	}

	{
		System.out.println("I belong to IIB block 1");
	}
	
	{
		System.out.println("I belong to IIB block 2");
	}
	public static void main(String[] args) {
		


	}

}
