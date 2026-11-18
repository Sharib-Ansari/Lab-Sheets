import java.util.HashSet;

public class HashSetRemove {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        set.add(10);
        set.add(20);
        set.add(30);

        set.remove(20);

        System.out.println(set);
    }
}