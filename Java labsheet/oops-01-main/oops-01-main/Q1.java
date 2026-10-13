class Student {
    String name;
    int age;
    String college;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("College: " + college);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Student s = new Student();

        s.name = "Palak";
        s.age = 21;
        s.college = "ABC College";

        s.display();
    }
}