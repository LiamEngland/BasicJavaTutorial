class Frog {
	
	private int intId;
	private String strName;
	
	public Frog(int intId, String strName) {
		this.intId = intId;
		this.strName = strName;
	}
	
	// The toString method allows for a Sting representation of the object.
	public String toString() {
		/*StringBuilder sbToString = new StringBuilder();
		sbToString.append(intId).append(": ").append(strName);
		return sbToString.toString();*/
		
		return String.format("%-4d : %s", intId, strName);
		
		// A StringBuilder or String.format are both efficient ways of formatting the strings.
		
		// If a toString method is not created, the class name & a Hash code will be printed instead.
	}
}

public class Application {
	public static void main(String[] args) {
		Frog frog1 = new Frog(10, "Brad");
		Frog frog2 = new Frog(6, "Albert");
		
		System.out.println(frog1);
		System.out.println(frog2)
;	}
}
