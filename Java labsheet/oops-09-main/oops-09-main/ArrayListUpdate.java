import java.util.ArrayList;

public class ArrayListUpdate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.set(1, 50);

        System.out.println(list);
    }
}