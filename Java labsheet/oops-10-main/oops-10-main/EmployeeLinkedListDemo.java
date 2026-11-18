import java.util.LinkedList;

class Person {
    String name;

    Person(String name) {
        this.name = name;
    }
}

class Employee extends Person {
    int id;

    Employee(int id, String name) {
        super(name);
        this.id = id;
    }

    void display() {
        System.out.println(id + " " + name);
    }
}

public class EmployeeLinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Employee> list = new LinkedList<>();

        list.add(new Employee(1, "Aman"));
        list.add(new Employee(2, "Riya"));

        for (Employee e : list) {
            e.display();
        }

        String searchName = "Riya";

        for (Employee e : list) {
            if (e.name.equals(searchName)) {
                System.out.println("Employee Found: " + e.name);
            }
        }
    }
}