
public class Application {
	public static void main(String[] args) {
		
		// Single dimensional array.
		int[] intValues = {345, 342, 556};
		
		System.out.println(intValues[1]);
		
		
		// A multidimensional array is an array of arrays.
		
		int[][] intGrid = {
			{1, 88, 92},
			{56, 3, 987},
			{12, 345, 99, 46}
		};
		
		System.out.println(intGrid[1][2] + "\n");
		
		/* 
		 * Here are two loops, the initial loop looping around the main array which contain the sub-arrays, then the second loop
		 * which goes around all the values within the sub-array.
		 * 
		 */
		
		System.out.println("Each Array and their subarrays:\n");
		
		for (int i = 0; i<intGrid.length; i++) {
			for (int j = 0; j<intGrid[i].length; j++) {
				System.out.print(intGrid[i][j] + "\t");
			}
			System.out.println("\n");
		}
		
		// Setting a multi-dimensional array before setting the values.
		String[][] strWords = new String[2][];
		
		System.out.println(strWords[0]);

		strWords[0] = new String[3];
		
		strWords[0][1] = "Hello there.";
		
		System.out.println(strWords[0][1]);
	}
}
