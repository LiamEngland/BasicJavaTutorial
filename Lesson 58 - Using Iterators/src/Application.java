import java.util.Iterator;
import java.util.LinkedList;

public class Application {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList<String>();

        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");
        animals.add("fox");

        Iterator<String> iterator = animals.iterator();

        // While there's another item in the list, it'll output it.
        while (iterator.hasNext()) {
            String strAnimal1 = iterator.next();
            System.out.println(strAnimal1);

            if (strAnimal1.equals("cat")) {
                iterator.remove();
            }
        }

        System.out.println();

        // Modern iteration post Java 5.
        for (String strAnimal: animals) {
            System.out.println(strAnimal);
        }
    }
}
