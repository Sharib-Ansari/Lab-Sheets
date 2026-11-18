import java.util.ArrayList;

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name);
    }
}

public class StudentArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student("Palak"));
        list.add(new Student("Riya"));
        list.add(new Student("Priya"));

        list.remove(1);

        for (Student s : list) {
            s.display();
        }
    }
}