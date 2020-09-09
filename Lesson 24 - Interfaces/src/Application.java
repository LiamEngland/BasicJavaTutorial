
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Machine machine1 = new Machine();
		machine1.start();
		
		// A new class cannot use Info as it's creating a new instance of a class.
		Person person1 = new Person("Harry");
		person1.greet();
		
		// A new instance of Info can be used to create a new machine as Machine implements the interface Info.
		// This can only be used to access the one method in machine from the interface which is showInfo.
		
		Info info1 = new Machine();
		info1.showInfo();
		
		Info info2 = person1;
		info2.showInfo();
		
		// Because the methods have been overridden in the individual classes, they're doing separate things.
		
		
		outputInformation(machine1);
		outputInformation(person1);
	}

	private static void outputInformation(Info info) {
		info.showInfo();
	}
}