import java.util.*;

public class Application {
    public static void main(String[] args) {
        // List, Set or Map?

        /*
            Lists store lists of objects, which allow duplicates.
            In lists objects remain in order, unless specifically sorted.
            Elements in a list are indexed using an integer.
            Checking for a particular item in list is slow, however looking by index is fast.
            Iterating through lists are also rather fast, which can be sorted if needed.
         */

        // If you only need to add or remove items at the end of a list, ArrayList is best.
        List<String> list1 = new ArrayList<String>();

        // If you need to add or remove from a list, then LinkedLists are best.
        List<String> list2 = new LinkedList<String>();

        // Sets

        /*
            Sets only store unique value, as well as they're not indexed.
            Sets are optimised to finding objects in the lists, so ar fast.
            Sets using your own objects will need to implement hashCode & equals.
         */

        // If no order is needed and can change, HashSet will be the best, as it's unordered.
        Set<String> set1 = new HashSet<String>();


        // TreeSet will sort in natural order, which is 1,2,3.. & a,b,c.. etc.
        Set<String> set2 = new TreeSet<String>();

        // LinkedHashSets will remain in the order they were added.
        Set<String> list3 = new LinkedHashSet<String>();

        // Maps

        /*
            Maps store key value pairs, which allows for easily accessing objects based on their key.
            Maps are also optimised, so getting objects by key is fast.
            Iterating over maps values is slow.
            Using your own objects in maps will need to implement hashCode & equals.
         */

        // Keys will not be in any particular order.
        Map<String, Integer> map1 = new HashMap<>();

        // Keys will be sorted in natural order - Comparable must be implemented for custom types.
        Map<String, Integer> map2 = new TreeMap<>();

        // Keys will remain the the same order as they were added.
        Map<String, Integer> map3 = new LinkedHashMap<>();

        // SortedSet & SortedMap interfaces can also be used.
    }
}
