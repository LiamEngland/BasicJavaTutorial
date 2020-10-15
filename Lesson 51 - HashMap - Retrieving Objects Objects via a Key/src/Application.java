import java.util.HashMap;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(5, "Five");
        map.put(6, "Six");

        // Here the second statement will override the first.
        map.put(7, "Seven");
        map.put(7, "Also Seven");

        String strText = map.get(7);
        System.out.println(strText);

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            int intKey = entry.getKey();
            String strValue = entry.getValue();

            System.out.println("Key " + intKey + " - value " + strValue);
        }
    }
}
