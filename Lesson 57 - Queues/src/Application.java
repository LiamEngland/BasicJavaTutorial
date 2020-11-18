import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Application {
    public static void main(String[] args) {
        // Front of the queue is called the head.
        // End of the queue is called the tail.
        // This is  FIFO (First In First Out).

        Queue<Integer> queue1 = new ArrayBlockingQueue<Integer>(2);

        queue1.add(10);
        queue1.add(16);

        try {
            queue1.add(3);
        } catch (IllegalStateException e) {
            System.out.println("Queue Full.");
        }

        for (Integer intValue: queue1) {
            System.out.println("Queue value: " + intValue);
        }

        // Remove will remove the head of the queue. In this case it'd be 10.

        System.out.println(queue1.remove() + " Removed from Queue.");

        try {
            System.out.println(queue1.remove() + " Removed from Queue.");
            System.out.println(queue1.remove() + " Removed from Queue.");
        } catch (NoSuchElementException e) {
            System.out.println("Queue is empty.");
        }

        // Second Queue.

        Queue<Integer> queue2 = new ArrayBlockingQueue<Integer>(2);

        System.out.println("Queue 2 peek " + queue2.peek());

        // Offer attempts to add items to a queue, which won't cause an exception.
        queue2.offer(54);
        queue2.offer(234);
        if (!queue2.offer(9)) {
            System.out.println("Queue is full.");
        }

        System.out.println("Queue 2 peek " + queue2.peek());

        for (Integer intValue: queue2) {
            System.out.println("Queue value: " + intValue);
        }

        // Poll will attempt to remove from the head of the queue. Will return null rather than exception with no items.
        System.out.println("Queue 2 poll " + queue2.poll());
        System.out.println("Queue 2 poll " + queue2.poll());
        System.out.println("Queue 2 poll " + queue2.poll());
    }
}
