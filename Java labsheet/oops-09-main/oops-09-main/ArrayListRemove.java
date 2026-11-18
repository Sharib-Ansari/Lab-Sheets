import java.util.ArrayList;

public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        list.remove(1); // Removes index 1 (20)
        list.remove(Integer.valueOf(40)); // Removes value 40

        System.out.println(list);
    }
}