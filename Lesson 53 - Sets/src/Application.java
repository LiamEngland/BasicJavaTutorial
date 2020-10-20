import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        // A set is a kind of collection that only stores unique elements.

        // HashSet does not retain order. The output of this will not be in the order they were inputted.
        Set<String> setStrings1 = new HashSet<>();

        // LinkedHashSet does retain order. This will output in the order they were inputted.
        Set<String> setStrings2 = new LinkedHashSet<>();

        // TreeSet sorts in natural order.
        Set<String> setStrings3 = new TreeSet<>();

        // Checking if a set is empty. Will return true.
        if (setStrings1.isEmpty()) {
            System.out.println("Set is empty. \n");
        }

        setStrings1.add("Dog");
        setStrings1.add("Cat");
        setStrings1.add("Horse");
        setStrings1.add("Rabbit");
        setStrings1.add("Frog");

        if (setStrings1.isEmpty()) {
            System.out.println("Set is empty.\n");
        }

        setStrings2.add("Dog");
        setStrings2.add("Cat");
        setStrings2.add("Horse");
        setStrings2.add("Rabbit");
        setStrings2.add("Frog");

        setStrings3.add("Dog");
        setStrings3.add("Cat");
        setStrings3.add("Horse");
        setStrings3.add("Rabbit");
        setStrings3.add("Frog");

        // Adding duplicate items will do nothing.
        setStrings1.add("Dog");

        // The same applies to LinkedHashSets.
        setStrings2.add("Dog");

        // As you can see, 'Dog' is not in the set twice.
        System.out.println(setStrings1);

        // Here you can see the items are in the order they were inputted.
        System.out.println("\n" + setStrings2);

        // Here you can see the items are in alphabetical order.
        System.out.println("\n" + setStrings3 + "\n");


        // Iteration.
        for (String strElement : setStrings3) {
            System.out.println(strElement);
        }

        // Checking whether a set contains a given item.
        if (setStrings3.contains("Hamster")) {
            System.out.println("\nSet contains a Hamster.");
        } else {
            System.out.println("\nSet does not contain a Hamster.");
        }

        if (setStrings3.contains("Cat")) {
            System.out.println("\nSet contains a Cat.");
        } else {
            System.out.println("\nSet does not contain a Cat.");
        }

        System.out.println("\nSet 1 contains " + setStrings1.size() + " elements.");


        // Intersection.

        Set<String> setStrings4 = new TreeSet<>();

        // setStrings4 has both mutual and exclusive elements to setStrings1.

        setStrings4.add("Dog");
        setStrings4.add("Cat");
        setStrings4.add("Lizard");
        setStrings4.add("Parrot");
        setStrings4.add("Whale");

        // Adding setStrings1 will make intersection a copy of setStrings1.
        Set<String> intersection = new LinkedHashSet<>(setStrings1);

        System.out.println("\n" + intersection);

        // intersection will only retain set items which values match an item in setStrings4.
        intersection.retainAll(setStrings4);

        // Now only 'Cat' & 'Dog' are contained within intersection.
        System.out.println(intersection);


        // Difference between sets.
        Set<String> difference = new LinkedHashSet<>(setStrings1);

        /*
            difference will be a copy of setStrings1, then the removeAll method will remove all elements
            that are shared with both setStrings1 & setStrings4, so only elements exclusive to setStrings1
            will be removed from difference.
         */

        difference.removeAll(setStrings4);

        // Now only 'Frog', 'Horse' and 'Rabbit' will be shown.
        System.out.println("\n" + difference);
    }
}