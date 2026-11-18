import java.util.LinkedHashSet;

public class LinkedHashSetOrder {
    public static void main(String[] args) {
        LinkedHashSet<String> set = new LinkedHashSet<>();

        set.add("Apple");
        set.add("Mango");
        set.add("Banana");
        set.add("Apple");

        System.out.println(set);
    }
}