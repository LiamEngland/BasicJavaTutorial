public class Application {
	public static void main(String[] args) {
		String[] strWords = new String[2];

		strWords[0] = "Hello";
		strWords[1] = "There";
		
		System.out.println(strWords[0]);
		
		String[] strFruits = {"Apple", "Banana", "Pineapple"};
		
		for (String fruit: strFruits) {
			System.out.println(fruit);
		}
		
		int intValue = 1;
		
		String strText = null; // The string references a block of memory that'll be used to store any value in the string. Default value is null.
		
		System.out.println(strText); // This prints out null, see that the set value isn't in quotes, as null is also a value.
		
		/* This array of references (that being 2 strings), are automatically initialised with the value of null.
		 * 
		 * When printing the values out, note that the value is null due to nothing being programmatically set.
		 */
		
		String[] strTexts = new String[2]; 
		
		System.out.println(strTexts[0]);
		
	}
}