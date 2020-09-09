 public class Application {
	public static void main(String[] args) {
		
		// Inefficient use of string.
		String strInfo = "";
		
		strInfo += "This is part of ";
		strInfo += "a string.";
		
		System.out.println(strInfo);
		
		
		// Efficient use of string.
		
		StringBuilder sb = new StringBuilder("");
		
		sb.append("My name is Anthony.");
		sb.append(" ");
		sb.append("I am being eaten by ants")
		.append(" please help me.\n");
		
		System.out.println(sb.toString());
		
		// Another alternative is StringBuffer, it's older but does the same thing. StringBuilder is just more lightweight.
		
		
		
		// String Formatting.
		
		System.out.println("Some text. \tThat was a tab.\nThat was a new line.");
		
		// printf is Print Format.
		
		/*
		 * % is a character placeholder, so a parameter can be set after the string to replace it.
		 * %d is for integers.
		 * %s is for strings.
		 * %f is for floating point values.
		 */
		System.out.printf("Total cost %2d. Quantity is %5d\n", 5, 1);
		System.out.printf("Snakes are %s", "Long");
		
		for (int i=0; i<20; i++) {
			System.out.printf("%2d: here's some text.\n", i);
		}
		
		System.out.printf("Total value: %.2f", 19.22);
	}

}