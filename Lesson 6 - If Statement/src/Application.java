public class Application {
	public static void main(String[] args) {
				
		int intInteger = 15;
		int intLoop = 0;
		
		// If, Else If, Else Statement.
		if (intInteger < 10) {
			System.out.println("Integer is less than 10.\n");
		} else if (intInteger > 20) {
			System.out.println("Integer is greater than 20.\n");
		} else {
			System.out.println("Conditions not met.\n");
		}
		
		
		// While loop with conditional statement. Will loop indefinitely as always true.
		while (true) {
			System.out.printf("Loop %d.\n", intLoop);
			
			if (intLoop == 5) { // Once intLoop is set to 5, break will be called to break out of the loop.
				break;
			}
			
			intLoop++;
			System.out.println("Running.");
		}
	}
}