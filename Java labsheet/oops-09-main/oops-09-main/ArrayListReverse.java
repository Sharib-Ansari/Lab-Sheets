import java.util.ArrayList;
import java.util.Collections;

public class ArrayListReverse {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        Collections.reverse(list);

        System.out.println(list);
    }
}