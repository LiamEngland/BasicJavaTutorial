import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scannerInput = new Scanner(System.in);

		System.out.println("Please enter a command: ");
		String strText = scannerInput.nextLine();
		strText.toLowerCase();

		switch (strText) {
		case "start":
			System.out.println("Started");
			break;

		case "run":
			System.out.println("Running");
			break;

		case "stop":
			System.out.println("Stopped");
			break;

		default:
			System.out.println("Command not recognised");
			break;
		}
	}
}
