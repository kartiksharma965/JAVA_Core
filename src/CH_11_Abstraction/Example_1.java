package CH_11_Abstraction;
/* Rule 
 * a) Class that is declared with abstract keyword is know as Abstract class in java.
 * b) It can have abstract and non abstract methods. (methods with body)
 * c) It can not be instantiated.( The object can not be created for abstract class).
 * d) A method that is declared as abstract and does not have implementation is known 
 *    as abstract method.
 * e) We can not make a variable as abstract. Since compile time error will occurs.
 * f) In case of abstract method we can not write method implementation.
 *    If we try to write logic in body then compile time error occurs.
 * h) By default this method has "Default" access modifier. 
 *  */

public abstract class Example_1 {
	
	/*Rule => We can not make a variable as abstract.Since compile time error(CTE) occurs.
	 * eg abstract int b =25; // CTE
	 */
 int a = 5;
 int b = 25;
 void test1() {
	 System.out.println("I am non abstract method of Abstract class ");
 }
 
 /*Rule => In case of abstract method we can not write method implementation.
 *    If we try to write logic in body then compile time error occurs.
 eg.
 abstract void test2() {
	 // we are trying to write body in abstract method. Hence compile time error occurs.
 } */

 /* Rule => By default this method has "Default" access modifier. */
 abstract void test2();
 
 /* Access modifier rules method below
  
  Rule 1 => We can increase access of any member of parent class.
  eg public from default is allowed
   */
 public abstract void test3();
 
/*Rule 2 => We can not decrease access of any member of parent class.
 * eg private from default is not allowed.
      If we do so then compile time error is displayed. 
       
    private abstract void test4(); // compile time error is displayed
    */


}
