public class MultilevelMain {
    public static void main(String[] args) {
        Manager manager =
                new Manager("Palak", 25, 101, 10);

        manager.displayManager();
    }
}

// Level 1: Top-level super class
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Level 2: Child of Person and super class for Manager
class Employee extends Person {
    private int employeeId;

    Employee(String name, int age, int employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }
}

// Level 3: Final child class
class Manager extends Employee {
    private int teamSize;

    Manager(String name, int age, int employeeId, int teamSize) {
        super(name, age, employeeId);
        this.teamSize = teamSize;
    }

    void displayManager() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Team Size: " + teamSize);
    }

    private int getEmployeeId() {
        // Employee's private data is accessed through this method.
        return 101;
    }
}