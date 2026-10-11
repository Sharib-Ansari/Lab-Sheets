public class StudentMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayDetails();
    }
}

class Student {
    String name;
    int rollNo;
    double marks;

    Student() {
        name = "Palak";
        rollNo = 101;
        marks = 85.5;
    }

    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
    }
}