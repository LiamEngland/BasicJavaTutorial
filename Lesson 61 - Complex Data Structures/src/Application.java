import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Application {
    public static String[] vehicles = {
        "Ambulance", "Helicopter", "Patrol Car", "Firetruck"
    };

    public static String[][] operators = {
        {"Henry", "Alice"},
        {"Richard", "David", "Tegan"},
        {"Dennis", "Mark", "Hammond", "Sharon"},
        {"Alfie", "Vernon", "Amy"}
    };

    public static void main(String[] args) {
        Map<String, Set<String>> personnel = new HashMap<>();

        for (int i = 0; i < vehicles.length; i++) {
            String strVehicle = vehicles[i];
            String[] strDrivers = operators[i];

            Set<String> strDriverSet = new LinkedHashSet<>();
            for (String driver: strDrivers) {
                strDriverSet.add(driver);
            }

            personnel.put(strVehicle, strDriverSet);
        }

        // Iterate through single vehicle type.
        Set<String> strDrivers = personnel.get("Patrol Car");

        for (String driver: strDrivers) {
            System.out.println(driver);
        }

        // Iterate through all.
        for (String strVehicle: personnel.keySet()) {
            System.out.print("Operators for " + strVehicle + ": ");
            Set<String> strDriversList = personnel.get(strVehicle);

            for (String strDriver: strDriversList) {
                System.out.print(strDriver + " ");
            }
            System.out.println("\n");
        }
    }
}
