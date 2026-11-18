import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("Java");
        set.add("Python");
        set.add("C++");

        List<String> list = new ArrayList<>(set);

        for (String s : list) {
            System.out.println(s);
        }
    }
}