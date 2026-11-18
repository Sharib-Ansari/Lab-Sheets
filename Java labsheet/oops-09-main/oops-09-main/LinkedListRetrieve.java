import java.util.LinkedList;

public class LinkedListRetrieve {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println("First: " + list.getFirst());
        System.out.println("Last: " + list.getLast());
    }
}