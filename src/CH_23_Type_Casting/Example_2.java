package CH_23_Type_Casting;

// parent class animal
class Animal{};

// child class dog and cat
class Dog extends Animal{};
class Cat extends Animal{};

public class Example_2 {
	
	public static void test1() {
		System.out.println("*** Rule 1 () starts ***");
		/* A B = (C) D
		 * Rule 1 : conversion is valid or not
	    The type of 'C' and 'D' must have some relationship(either parent to child or child to parent or same type).
         */
		Animal animal = new Dog(); 
		Cat cat = (Cat) animal; // Valid case
		// valid as per rule 1 as parent and child relationship between 'C'(cat) and 'D'(animal).
		
		Dog dog = new Dog();
		//Cat cat = (Cat) dog; // Invalid case
		//in-valid as per rule as there is no direct relationship with dog and cat class.
 
		System.out.println("*** Rule 1 () ends ***");
	}
	
	public static void test2() {
		System.out.println("*** Rule 2 () starts ***");
		/* A B = (C) D
		 * Rule2 : assignment is valid or not
		//'C' must be either same as 'A' or child of 'A'.
         */
		Animal animal = new Dog(); 
		Cat cat = (Cat) animal; // Valid case
		// valid as per rule 2 as 'C'(cat) is same as 'A' (cat).
		
		Animal an=new Dog();
		//Cat cat=(Dog) an; // Invalid case
		//in-valid as per rule as there is no direct relationship with 'C' (dog)  and 'A' (cat) class.
 
		System.out.println("*** Rule 2 () ends ***");
	}

	public static void test3() {
		System.out.println("*** Rule 3 () starts ***");
		/*Rule3 : 
		 The underlying object type of 'D' must be either same or child of 'C'.
		 
		 Animal an=new Dog(); //an is object of dog class.
		  A  B = (C)  D 
		 Cat ct=(Cat) an; 
		 //In-valid as per Rule 3 as 'C'(cat) and 'D' (dog) are not having any direct relationship.
		 // Run-time error is displayed in above scenario.
		 */
				 
		// case 1
		Animal animal = new Dog(); // animal is object of dog class.
		Cat cat = (Cat)animal; // run time error occurs as 'C' (cat) and 'D' (dog) are not having any direct relationship.
		
		// case 2
		Animal animal_1 = new Cat();// animal is object of dog class.
		Dog dog = (Dog) animal_1; // run time error occurs as 'C' (cat) and 'D' (dog) are not having any direct relationship.
		
		System.out.println("*** Rule 3 () ends ***");
	}
	
	public static void test4() {
		System.out.println("*** Start Scenario of  Rule 1, Rule 2, Rule 3 ***");
		 
		// case 1
		Animal animal = new Dog(); 
		Dog cat = (Dog)animal;  //Rule1-yes  Rule2-yes  Rule3=yes
		// case 2
		Animal animal_1 = new Cat();
		Cat dog = (Cat) animal_1; //Rule1-yes  Rule2-yes  Rule3=yes
		
		System.out.println("*** Ends Scenario of  Rule 1, Rule 2, Rule 3 ***");
	}
	
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		
	}

}
