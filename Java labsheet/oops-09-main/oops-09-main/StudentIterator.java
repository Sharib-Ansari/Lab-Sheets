import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class StudentIterator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Aman"));
        list.add(new Student(2, "Riya"));
        list.add(new Student(3, "Rahul"));

        Iterator<Student> it = list.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}