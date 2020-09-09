
public class Application {
	public static void main(String[] args) {

		int[] intValues; // Declaring an array for integers.
		
		intValues = new int[3]; // Initialising the array by setting it to a new integer array with 3 items.
		
		System.out.println(intValues[0]); // Outputs 0 as Java automatically sets the default values to 0.
		
		intValues[0] = 10; // Setting the first array item to 10.
		intValues[1] = 4;
		intValues[2] = 77;
		
		System.out.println(intValues[0]); // Printing the first array item, which outputs its assigned value of 10.
		System.out.println(intValues[1]); // The same principle applies to the next two values.
		System.out.println(intValues[2]);
		
		System.out.println("\nLooping through values via a for loop. \n");
		
		/*
		 * Looping through the array using a for loop. Assigning the incremental variable 'i' to 0, which will
		 * increment by 1 on each loop iteration, until it's reached 1 less than the length of the array.
		 * 
		 * In this case, the length of the array is 3, so once 'i' hits 2, the loop will drop out.
		 * 
		 * On each loop, the array is printed out, by calling the value of whatever 'i' is set to. So, for example, if it's the first
		 * iteration of the loop, 'i' will equal 0, so the value set to item 0 of the array will be printed, which in this case is 10.
		 */
		
		for (int i = 0; i < intValues.length; i++) {
			System.out.println(intValues[i]);
		}
		
		System.out.println("\nLooping through dynamically set values. \n");
		
		int[] intNumbers = {10, 77, 13}; // Setting the array values without setting the array size.
		
		for (int i = 0; i < intNumbers.length; i++) { // Looping through the array in the same way as previously.
			System.out.println(intNumbers[i]);
		}
	}
}