package CH_09_ReturnType;
/*
 *  This scenario of Single array return type.
 *  This scenario of Double array return type.
 */

public class Example_2 {
	
	public int [] test1() {
		System.out.println("I am method 'int [] test1()");
		return new int [2];
	}
	
	public int [] [] test2() {
		System.out.println("I am method 'int [] [] test2()");
		return new int [1] [2];
		}

	public static void main(String[] args) {
	System.out.println("##  Invoking Single return type method  ##");
	int a[] = new int [3];
	
	System.out.println("##  Invoking Double return type method  ##");
	int b[] [] = new int [2] [2];
	}
}
