import java.util.HashMap;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    void display() {
        System.out.println(roll + " " + name);
    }
}

public class StudentHashMapDemo {
    static HashMap<Integer, Student> map = new HashMap<>();

    static void addStudent(int roll, String name) {
        map.put(roll, new Student(roll, name));
    }

    static void removeStudent(int roll) {
        map.remove(roll);
    }

    static void displayStudents() {
        for (Student s : map.values()) {
            s.display();
        }
    }

    public static void main(String[] args) {
        addStudent(101, "Palak");
        addStudent(102, "Riya");
        addStudent(103, "Aman");

        displayStudents();

        System.out.println("After removal:");
        removeStudent(102);
        displayStudents();
    }
}