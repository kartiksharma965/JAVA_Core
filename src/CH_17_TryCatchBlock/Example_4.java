package CH_17_TryCatchBlock;

/*
=	One try block can be associated with more than one catch block.
=	So from multiple exception we can select required exception.
=   Code will go through catch block () in sequential manner. Then it decide which particular exception to select

Let take example of multiple catch. 
int a[] = new int [5];      // array size is 5 which mean it start from 0 ,1,2,3,4
a[5] = 30/0;  
// 30/0 will cause arithmetic exception.
//a[5] will cause array out of array out of bound exception. 
 Since we are  array size is 5 and we are trying to store data in 6th position.
 */


public class Example_4 {

	public void test1() {
		try {
			int a[]=new int [5];
			/* In below scenario there is Array Index out of bound exception and Arithmetic exception.
			 * Result will be displayed for Arithmetic exception will be found first.*/
			a[5]=32/0;	
		} catch(ArrayIndexOutOfBoundsException a ) {
			System.out.println("*** getting Array Index Out of Bound exception ***");
			a.printStackTrace();
		} catch (ArithmeticException b) {
			System.out.println("*** getting Arithmetic exception ***");
			b.printStackTrace();
		} catch (Exception c) {
			System.out.println("*** parent class exception will handle any type of exception ***");
			c.printStackTrace();
		} /*
		Rule :- We can't write child class exception under parent class exception as this result in compile time error.
		
		catch (NullPointerException a) // compile time error occurs if we write child class exception under parent exception
		{
			System.out.println("**********Getting Nullpointer Exception");
         */
		System.out.println("*** Rest of code is executed for test1() method ***");
	}
	
	   public void test2() {
		   try {
			   int a[]= new int [5];
			   a[5]= 32; // Array Index out of bound exception.
		   } catch (ArithmeticException a) {
				System.out.println("*** getting Arithmetic exception ***");
				a.printStackTrace();
			} catch(ArrayIndexOutOfBoundsException b ) {
				System.out.println("*** getting Array Index Out of Bound exception ***");
				b.printStackTrace();
			} catch(Exception c) {
				System.out.println("*** parent class exception will handle any type of exception ***");
				c.printStackTrace();
			}		   
		   System.out.println("*** Rest of code is executed for test2() method ***");
}

	   public void test3() {
		   try {
			   
		     /* In below scenario exception will only be handled
		       by super exception (Exception e) as it will not match any catch block.*/
			   Class.forName("$$$!@#$$!$!$%%"); // Invalid class name.
			   
		   }catch (ArithmeticException a) {
				System.out.println("*** getting Arithmetic exception ***");
				a.printStackTrace();
			} catch(ArrayIndexOutOfBoundsException b ) {
				System.out.println("*** getting Array Index Out of Bound exception ***");
				b.printStackTrace();
			} catch(Exception c) {
				System.out.println("*** parent class exception will handle any type of exception ***");
				c.printStackTrace();
			}	
		   System.out.println("*** Rest of code is executed for test3() method ***");
	   }
	   
	   
public static void main(String[] args) {
	Example_4 obj= new Example_4();
	System.out.println("*** test1() method ***");
	obj.test1();
	System.out.println("*** test2() method ***");
	obj.test2();
	System.out.println("*** test3() method ***");
	obj.test3();
	   }

}