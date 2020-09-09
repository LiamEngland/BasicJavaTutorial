class Robot {
	public void speak(String strValue) {
		System.out.println(strValue );
	}
	
	public void jump(int intHeight) {
		System.out.println("Jumping " + intHeight);
	}
	
	public void move(String strDirection, double dblDistance) {
		System.out.println("Moving " + dblDistance + " meters facing " + strDirection);
	}
}

public class Application {

	public static void main(String[] args) {
		Robot robot1 = new Robot();
		robot1.speak("Hello, I don't have a conciousness.");
		robot1.jump(10);
		robot1.move("West", 86.4);
		
		String strGreeting = "Hello there.";
		robot1.speak(strGreeting);
	}
}