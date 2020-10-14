import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        // If items will only be modified at the end of the list, this should be used.
        /*
            ArrayLists manage arrays internally.
            [0][1][2][etc].

            Adding items to the end of the list, will just copy all items into a new array with the new item, when it reaches the max size.

            Adding an item halfway through the list will move all items proceeding that item up by 1, which should be slower.
         */
        ArrayList<Integer> intNumbers = new ArrayList<Integer>();

        // If items will be modified anywhere in the list, this should be used.
        /*
            LinkedLists consist of elements, where each element has a reference to the previous and next element.
            [0] -> [1] -> [2]
                <-     <-
         */
        LinkedList<Integer> intLinked = new LinkedList<Integer>();

        doTimings("ArrayList", intNumbers);
        doTimings("LinkedList", intLinked);
    }

    private static void doTimings(String strType, List<Integer> list) {
        for (int i = 0; i < 1E5; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();

        // Adding items to the end of the list.
        /*for (int i = 0; i<1E5; i++) {
            list.add(i);
        }*/

        // Adding items at the beginning of the list.
        /*for (int i = 0; i<1E5; i++) {
            list.add(0);
        }*/

        // Adding items near the end of the list.
        for (int i = 0; i<1E5; i++) {
            list.add(list.size()-250);
        }

        // I'm assuming arraylist has been made more efficient. In all cases, ArrayList was faster.

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + "ms for " + strType + ".");
    }
}
