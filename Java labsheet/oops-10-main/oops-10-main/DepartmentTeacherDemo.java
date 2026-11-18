import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }

    public int hashCode() {
        return name.hashCode();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Department)) return false;
        Department d = (Department) obj;
        return name.equals(d.name);
    }
}

class Teacher extends Department {
    String teacherName;

    Teacher(String department, String teacherName) {
        super(department);
        this.teacherName = teacherName;
    }
}

public class DepartmentTeacherDemo {
    public static void main(String[] args) {
        ArrayList<Department> departments = new ArrayList<>();
        HashMap<Department, List<Teacher>> map = new HashMap<>();

        Department d1 = new Department("Computer Science");
        Department d2 = new Department("Mathematics");

        departments.add(d1);
        departments.add(d2);

        map.put(d1, new ArrayList<>());
        map.put(d2, new ArrayList<>());

        map.get(d1).add(new Teacher("Computer Science", "Amit"));
        map.get(d1).add(new Teacher("Computer Science", "Neha"));
        map.get(d2).add(new Teacher("Mathematics", "Ravi"));

        for (Department d : departments) {
            System.out.println("Department: " + d.name);

            for (Teacher t : map.get(d)) {
                System.out.println(t.teacherName);
            }
        }
    }
}