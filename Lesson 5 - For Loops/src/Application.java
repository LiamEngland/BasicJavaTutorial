public class Application {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) { // For loop, 3 parameters: the initial value, the condition of the loop, and what executes on each loop.		
			/* 
			 * This is a format specifier. To replace the specifier, start with the percent, then for an integer, 
			 * start with a d. %d will be replaced with the specified variable, in this case 'i'.
			 * 
			 * By default, there's no new line set, so after the %d, adding '\n' will move to the next line.
			 * 
			*/
			System.out.printf("Loop Iteration %d\n", i); 
		}
	}
}