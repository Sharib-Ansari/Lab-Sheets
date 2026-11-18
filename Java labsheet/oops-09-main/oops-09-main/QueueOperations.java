import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();

        q.offer("A");
        q.offer("B");
        q.offer("C");

        System.out.println("Queue: " + q);
        System.out.println("Peek: " + q.peek());

        System.out.println("Removed: " + q.poll());
        System.out.println("After removal: " + q);
    }
}