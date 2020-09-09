class Machine {
	private String strName;
	private int intCode;
	
	// A constructor is method that's run every time an instance of a class is created.
	// Constructors have no return type. One thing to note, the constructor needs to have the same name as the class.
	
	// When a new Machine instance is created, the contents within the constructor will be executed.
	public Machine() {
		this("Bert"); // Other constructors can also be called within constructors, using the 'this' keyword. And must be on the first line.
		
		System.out.println("Running.");
	}
	
	/* 
	 * This is another constructor with the same name, however this accepts a String value, so when a new instance is created
	 * and a string value is passed into the parameters, the below constructor will run rather than the first constructor.
	 * 
	 */

	public Machine(String strName) {
		this.strName = strName;
		System.out.println(this.strName);
	}
	
	// Alike the above constructor, the same applies here, as there are two parameters rather than one.
	
	public Machine(String strName, int intCode) {
		this.strName = strName;
		this.intCode = intCode;
		
		System.out.println("\nName: " + this.strName + ", Code: " + this.intCode + "\n");
	}
}

public class Application {
	public static void main(String[] args) {
		
		Machine machine1 = new Machine();
		
		Machine machine2 = new Machine("Testing");
		
		Machine machine3 = new Machine("Machine2", 10);
	}
}