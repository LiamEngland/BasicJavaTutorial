import java.util.Scanner;

public class Application {
	public static void main(String[] args) {

		// Declaring and setting value and scanner.
		
		int intValue = 0;
		Scanner scannerObject = new Scanner(System.in);

		do { // Loop will always execute at least once.
			System.out.print("Please enter a number: ");
			if (scannerObject.hasNextInt()) {
				intValue = scannerObject.nextInt();
			}
		} while (intValue != 5); // Will loop until intValue is set to 5.
		
		System.out.println("You Entered " + intValue);
	}
}