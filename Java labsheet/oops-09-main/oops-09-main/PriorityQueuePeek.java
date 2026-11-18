import java.util.PriorityQueue;

public class PriorityQueuePeek {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(30);
        pq.add(10);
        pq.add(20);

        System.out.println("First: " + pq.peek());
        System.out.println("Queue: " + pq);
    }
}