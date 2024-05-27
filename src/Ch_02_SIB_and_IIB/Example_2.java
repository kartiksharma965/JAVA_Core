package Ch_02_SIB_and_IIB;

/*
    Instance Initialization Block (IIB)
    
    1) The movement you create object of class IIB will get loaded.
    2) It will get executed as per object. If we create 10 objects IIB will get executed 10 times.
    3) IIB considers both Static member and Non Static members.
 */
public class Example_2 {
	
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
	
	// Rule = By default SIB block will executed automatically as soon as class get loaded to memory.
	System.out.println("## SIB blocks will be executed automatically ##");
	
	System.out.println("## created Object 1 ##");
	Example_2 obj  = new Example_2();
	
	System.out.println("## created Object 2 ##");
	Example_2 obj1 = new Example_2();
	
	System.out.println("## created Object 3 ##");
	Example_2 obj2 = new Example_2();

	}

}
