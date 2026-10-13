// Question 11: Multilevel Hospital Staff
// Concept: Multilevel Inheritance (Grandparent -> Parent -> Child Chain)

public class Q11_MultilevelHospitalStaff {

    // Grandparent Class: Person
    static class Person {
        protected String name;
        protected int age;
        protected String contactNumber;

        public Person(String name, int age, String contactNumber) {
            this.name = name;
            this.age = age;
            this.contactNumber = contactNumber;
        }

        public void displayPersonDetails() {
            System.out.println("Name    : " + name);
            System.out.println("Age     : " + age);
            System.out.println("Contact : " + contactNumber);
        }
    }

    // Parent Class: Employee (Inherits Person)
    static class Employee extends Person {
        protected int empId;
        protected double salary;

        public Employee(String name, int age, String contactNumber, int empId, double salary) {
            // Calling Person constructor
            super(name, age, contactNumber);
            this.empId = empId;
            this.salary = salary;
        }

        public void displayEmployeeDetails() {
            // Displaying person details inherited from Person
            displayPersonDetails();
            System.out.println("Emp ID  : " + empId);
            System.out.println("Salary  : $" + salary);
        }
    }

    // Child Class: Manager (Inherits Employee)
    static class Manager extends Employee {
        private String departmentManaged;
        private int teamSize;

        public Manager(String name, int age, String contactNumber, int empId, double salary, String departmentManaged, int teamSize) {
            // Calling Employee constructor
            super(name, age, contactNumber, empId, salary);
            this.departmentManaged = departmentManaged;
            this.teamSize = teamSize;
        }

        // Manager-specific method demonstrating access across the complete multilevel inheritance chain
        public void displayManagerSummary() {
            System.out.println("--- MULTILEVEL HOSPITAL STAFF: MANAGER SUMMARY ---");
            // Accessing behavior from Grandparent (Person) and Parent (Employee)
            displayEmployeeDetails();
            System.out.println("Dept Managed : " + departmentManaged);
            System.out.println("Team Size    : " + teamSize + " Staff Members");
            System.out.println("-------------------------------------------------");
        }

        public void approveLeaveRequest(String staffName) {
            System.out.println("Manager " + name + " approved leave request for staff member: " + staffName);
        }
    }

    public static void main(String[] args) {
        // Create Manager object (inherits attributes and methods from Person -> Employee -> Manager)
        Manager manager = new Manager("Vikram Singh", 42, "+91-9876543210", 501, 85000.0, "Hospital Operations", 12);

        System.out.println("=== DEMONSTRATING MULTILEVEL INHERITANCE ===");
        
        // Call manager summary (uses inherited Person and Employee behavior)
        manager.displayManagerSummary();

        // Call manager specific action
        manager.approveLeaveRequest("Kavita Rao");
    }
}
