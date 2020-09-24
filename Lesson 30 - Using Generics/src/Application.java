import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

class Animal {

}

public class Application {
    public static void main(String[] args) {

        // Prior to Java 5.
        ArrayList list = new ArrayList();

        list.add("pear");
        list.add("banana");
        list.add("kiwi");

        String fruit = (String)list.get(2);
        System.out.println(fruit);

        // Modern Style.

        ArrayList<String> strings = new ArrayList<String>();

        strings.add("dog");
        strings.add("rabbit");
        strings.add("cat");

        String animal = strings.get(1);
        System.out.println(animal);

        // More than one type of argument.

        HashMap<Integer, String> map = new HashMap<Integer, String>();

        map.put(1, "Hello");

        // Java 7 Style.

        ArrayList<Integer> list2;
        ArrayList<Animal> list3 = new ArrayList<>();
    }
}
