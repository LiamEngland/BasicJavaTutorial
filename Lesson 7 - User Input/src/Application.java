import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		
		// Creates new Scanner Object.
		Scanner input = new Scanner(System.in);
		
		// Output the text prompt.
		System.out.print("Enter a line of text: ");
		
		// Try catch to prevent any errors if incorrect data type entered.
		try {
			// Waiting for user to enter their text, then returns what they entered.
			String strLine = input.nextLine();
			System.out.println("You entered " + strLine);
		} catch (Exception e) {
			System.out.println("An error occured: " + e);
		}

	

		// Creating the same thing but using an integer instead.
		
		// Creates another Scanner Object.
		Scanner scannerInt = new Scanner(System.in);
		
		// Output the text prompt.
		System.out.print("Please enter a whole number: ");
		
		try {
			// Waits for the user to enter their integer (Note using .nextInt() rather than .nextText().
			int intUserValue = scannerInt.nextInt();
			
			// Returns the user's integer value.
			System.out.printf("You Entered " + intUserValue);
		} catch (Exception e) {
			System.out.println("An error occured: " + e);
		}
		
		// Closing Scanner Instance so not to leak memory.
		input.close();
		scannerInt.close();
	}
}