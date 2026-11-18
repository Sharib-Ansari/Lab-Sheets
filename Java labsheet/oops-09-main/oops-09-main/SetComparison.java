import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetComparison {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        LinkedHashSet<Integer> l = new LinkedHashSet<>();
        TreeSet<Integer> t = new TreeSet<>();

        int[] values = {30, 10, 20};

        for (int n : values) {
            h.add(n);
            l.add(n);
            t.add(n);
        }

        System.out.println("HashSet: " + h);
        System.out.println("LinkedHashSet: " + l);
        System.out.println("TreeSet: " + t);
    }
}