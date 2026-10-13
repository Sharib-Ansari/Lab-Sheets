// Question 1: Student Record
// Concept: Classes, Objects, Instance Variables, Methods

class Student {
    // Instance variables
    private String name;
    private int rollNumber;

    // Constructor to initialize student details
    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    // Method to display student record (Logic inside class, not in main)
    public void display() {
        System.out.println("--- Student Record ---");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number  : " + rollNumber);
        System.out.println("----------------------");
    }
}

public class Q01_StudentRecord {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Rahul Sharma", 101);

        // Call the display method (no display logic written in main)
        student.display();
    }
}
