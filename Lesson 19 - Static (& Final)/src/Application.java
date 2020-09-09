class Object {
	public String strName;
		
	// Static variables are known as class variables, as the variable is set against the class, rather than the instance.
	public static String strDescription;
	
	// The 'final' keyword is Java's equivalent of constant, meaning the value cannot be modified. When this is added, the value must be assigned.
	public final static int intLuckyNumber = 1;
	
	// Static methods can only output static variables, and not instance variables.
	public static void showInformation() {
		System.out.println(strDescription);
	}
	
	/*
	 * Below is a good example of how static variables can be useful. Since it's against the class and not instances, 
	 * every time that an Object object is created, the constructor will increment the class variable 'intCount' by 1,
	 * therefore it's possible to track how many instances of the class have been created.
	 * 
	 * As well as this, an instance variable of 'intId' can be created, so on every new object created, the id of the object
	 * can be set the value of 'intCount', therefore giving each object their own unique id.
	 */
	
	private static int intCount = 0;
	private int intId;
	
	public Object() {
		intId = intCount;
		intCount++;
	}
	
	public static void showCount() {
		System.out.println(intCount + " instances of Object have been created.");
	}
	
	// Instance methods can access both instance and static variables.
	public void showName() {
		System.out.println(this.strName + " has an id of " + intId);
	}
}

public class Application {

	public static void main(String[] args) {
		
		// Setting the class description.
		Object.strDescription = "Static variable in Object Class.";
		
		// Calling the showInformation Class method.
		Object.showInformation();

		Object object1 = new Object();
		Object object2 = new Object();
		
		object1.strName = "Jeremy";
		object2.strName = "Richard";
		
		object1.showName();
		object2.showName();

		System.out.println(Math.PI);
		
		System.out.println(Object.intLuckyNumber);
		
		Object.showCount();
	}
}