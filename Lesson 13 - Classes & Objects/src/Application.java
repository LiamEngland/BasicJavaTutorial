class Person {
	/*
	 * Classes can contain:
	 * 
	 * 	- Data
	 *  - Subroutines (Methods) 
	 *  
	 */
	
	// Data in classes are called instance variables.
	
	String strName;
	int intAge;
	
	void speak() {
		System.out.println("Hello, my name is " + strName + " and I'm " + intAge);
	}
	
	void speak2() {
		System.out.println("Hello.");
	}
}

public class Application {
	public static void main(String[] args) {
		
		// Creating a new Person object by setting person1 to being a new instance of the Person class.
		Person person1 = new Person();
		
		// Setting the object's instance variables.
		person1.strName = "Jeremy Clarkson";
		person1.intAge = 60;

		Person person2 = new Person();
		person2.strName = "Harrison Ford";
		person2.intAge = 70;

		System.out.println(person1.strName);
		System.out.println(person2.strName);
		
		person1.speak();
		person2.speak2();
	}
}