public class Application {
	public static void main(String[] args) {
		
		// Booleans can be set to true or false. They can also be set with conditions to give it a true or false value.
		
		int intValue = 10;
		boolean isBoolean = intValue < 20; // Here, intValue set to 10, is less than 20, so isBoolean will be set to true.
		
		System.out.println(isBoolean); // Printing the Boolean isBoolean will output 'true'.
		
		// A While loop will run as long as the condition is true.
		
		int intIterator = 0;
		
		while (intIterator < 10) { // While the value stored in intIterator is less than 10, the loop will continue.
			System.out.println("Value is " + intIterator);
			intIterator++; // Every time the loop executes, the value intIterator increments by 1.
		}
	}
}