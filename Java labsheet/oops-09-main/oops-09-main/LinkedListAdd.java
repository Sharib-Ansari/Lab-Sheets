import java.util.LinkedList;

public class LinkedListAdd {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Python");
        list.add("C++");

        list.addFirst("Java");
        list.addLast("JavaScript");

        System.out.println(list);
    }
}