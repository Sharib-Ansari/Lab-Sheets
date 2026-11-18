import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class ClearCollections {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        list.add(10);
        list.add(20);

        set.add(10);
        set.add(20);

        queue.add(10);
        queue.add(20);

        list.clear();
        set.clear();
        queue.clear();

        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Queue: " + queue);
    }
}