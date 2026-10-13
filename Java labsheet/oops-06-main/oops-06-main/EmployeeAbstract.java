abstract class Employee {
    abstract double calculateSalary();

    abstract void displayInfo();
}

class Manager extends Employee {
    String name;
    double salary;

    Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary + 10000;
    }

    @Override
    void displayInfo() {
        System.out.println("Role: Manager");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Programmer extends Employee {
    String name;
    double salary;

    Programmer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    double calculateSalary() {
        return salary + 5000;
    }

    @Override
    void displayInfo() {
        System.out.println("Role: Programmer");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

public class EmployeeAbstract {
    public static void main(String[] args) {

        Manager manager = new Manager("Rahul", 50000);
        Programmer programmer = new Programmer("Amit", 40000);

        manager.displayInfo();

        System.out.println();

        programmer.displayInfo();
    }
}