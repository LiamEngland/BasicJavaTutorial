/*import ocean.Fish;
import ocean.Seaweed;*/

// The * is a wildcard for all, so all classes within 'ocean' will be imported.
import ocean.*;
import ocean.plants.Seaweed;
import ocean.plants.Kelp;

public class Application {

	public static void main(String[] args) {
		new Fish();
		new Seaweed();
		new Kelp();
	}
}
