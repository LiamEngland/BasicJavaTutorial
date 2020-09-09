
public class Car extends Machine {
	
	@Override
	public void start() {
		System.out.println("Car has Started.");
	}

	public void wipe() {
		System.out.println("Wiping Windshield.");
	}
	
	public void showInformation() {
		System.out.println("Car name: " + strName);
	}
}
