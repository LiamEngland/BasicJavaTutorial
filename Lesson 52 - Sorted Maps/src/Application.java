import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp {

}

public class Application {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

        System.out.println(new Temp());

        // This will order the keys.
        testMap(hashMap);

        // This maintains the order of which the items are added.
        testMap(linkedHashMap);

        // Will order the keys in numerical order.
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> testMap) {
        testMap.put(0, "Dog");
        testMap.put(1, "Cat");
        testMap.put(2, "Mouse");
        testMap.put(3, "Rabbit");
        testMap.put(6, "Horse");
        testMap.put(68, "Parrot");

        for (Integer intKey : testMap.keySet()) {
            String strValue = testMap.get(intKey);
            System.out.println(intKey + ": " + strValue);
        }
    }
}
