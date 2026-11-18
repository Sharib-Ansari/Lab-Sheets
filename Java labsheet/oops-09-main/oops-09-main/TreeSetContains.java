import java.util.TreeSet;

public class TreeSetContains {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        System.out.println(set.contains(20));
        System.out.println(set.contains(50));
    }
}