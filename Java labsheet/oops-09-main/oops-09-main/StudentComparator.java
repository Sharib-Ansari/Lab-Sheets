import java.util.ArrayList;
import java.util.Comparator;

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

public class StudentComparator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(3, "Rahul"));
        list.add(new Student(1, "Aman"));
        list.add(new Student(2, "Riya"));

        list.sort(Comparator.comparingInt(s -> s.id));

        for (Student s : list) {
            System.out.println(s);
        }
    }
}