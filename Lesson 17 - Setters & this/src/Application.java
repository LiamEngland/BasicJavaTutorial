class Frog {
	private String strName;
	private int intAge;
	
	public void setName(String strName) {
		
		/* 
		 * In the method parameters, the String strName is the same as the instance variable, which is also strName. To differentiate the two, 
		 * the local variable set in the method can be accessed by calling 'strName', whereas to access the instance variable, which is what 
		 * needs to be set by the local variable, this.strName needs to be used as this refers to the instance of the class, so is accessing
		 * the instance variable. 
		 */
		
		this.strName = strName;
	}
	
	public void setAge(int intAge) {
		this.intAge = intAge;
	}
	
	public String getName() {
		return strName;
	}
	
	public int getAge() {
		return intAge;
	}
}

public class Application {
	public static void main(String[] args) {
		Frog frog1 = new Frog();
		
		// Here the name and age are being set by setting the variables directly.
		
		// Now because the variables have been set to private, they're no longer accessible to directly modify, and can only be modified via the use of methods.
		
		//frog1.strName = "dorris";
		//frog1.intAge = 2;
	
		// By calling the setter, there's no need to know the internal variable names of the 'Frog' class.
		
		frog1.setName("Harold");
		frog1.setAge(7);
		
		// Here the name and age has been set by calling a function rather than directly assigning values to the variables.
		
		System.out.println(frog1.getAge());
		System.out.println(frog1.getName());
		
	}
}