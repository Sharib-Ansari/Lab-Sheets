import java.util.LinkedList;

public class LinkedListRemove {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");
        list.add("HTML");

        list.removeFirst();
        list.removeLast();

        System.out.println(list);
    }
}