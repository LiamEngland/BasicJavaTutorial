import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        ArrayList<Integer> intNumbers = new ArrayList<Integer>();

        // Adding items to the array.
        intNumbers.add(10);
        intNumbers.add(20);
        intNumbers.add(30);

        // Accessing values of specific array item.
        System.out.println(intNumbers.get(0));

        // Indexed for loop iteration.
        System.out.println("\nLoop #1");
        for (int i = 0; i < intNumbers.size(); i++) {
            System.out.println(intNumbers.get(i));
        }

        // Removing an item from the Array. This removes the last item in the array.
        intNumbers.remove(intNumbers.size() -1);

        // Removing from the array, this method is very slow.
        // This method will copy all subsequent item array keys back by 1, which depending on the size of the array, will be very slow.
        intNumbers.remove(0);

        // A different approach to using a for loop.
        System.out.println("\nLoop #2");
        for (Integer value: intNumbers) {
            System.out.println(value);
        }

        // List interface.
        List<String> values = new ArrayList<String>();
    }
}
