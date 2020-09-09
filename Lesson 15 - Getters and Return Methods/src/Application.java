class Person {
	String strName;
	int intAge;
	
	void speak() {
		System.out.println("My name is " + strName);
	}
	
	int calculateYearsToRetirement() {
		int intYearsLeft = 70 - intAge;
		
		return intYearsLeft;
	}
	
	int getAge() {
		return intAge;
	}
	
	String getName() {
		return strName;
	}
}

public class Application {
	public static void main(String[] args) {
		Person person1 = new Person();
		person1.strName = "Harry";
		person1.intAge = 29;
		person1.speak();
		int intYears = person1.calculateYearsToRetirement();
		
		System.out.println("Years until retirement " + intYears);
		
		int intAge = person1.getAge();
		
		System.out.println("I am " + intAge);
		
		String strName = person1.getName();
		
		System.out.println("My name is " + strName);
	}
}
