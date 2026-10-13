// Question 9: Employee -> Pharmacist
// Concept: Single Inheritance, Code Reusability, Extending Base Class

public class Q09_EmployeePharmacist {

    // Parent Class: Employee
    static class Employee {
        protected int empId;
        protected String name;
        protected double salary;

        // Constructor for Parent Class
        public Employee(int empId, String name, double salary) {
            this.empId = empId;
            this.name = name;
            this.salary = salary;
        }

        // Method belonging to Employee class
        public void displayEmployeeInfo() {
            System.out.println("--- EMPLOYEE BASE DETAILS ---");
            System.out.println("Employee ID   : " + empId);
            System.out.println("Name          : " + name);
            System.out.println("Monthly Salary: $" + salary);
        }
    }

    // Child Class: Pharmacist (Inherits Employee)
    static class Pharmacist extends Employee {
        private String pharmacyLicense;

        // Constructor for Child Class
        public Pharmacist(int empId, String name, double salary, String pharmacyLicense) {
            // Calling parent class constructor using super
            super(empId, name, salary);
            this.pharmacyLicense = pharmacyLicense;
        }

        // Pharmacist-specific behavior
        public void dispenseMedicine(String medicineName) {
            System.out.println("Pharmacist " + name + " (License: " + pharmacyLicense + ") is dispensing: " + medicineName);
        }

        public void displayPharmacistDetails() {
            // Reusing parent display method
            displayEmployeeInfo();
            System.out.println("Pharmacy License: " + pharmacyLicense);
            System.out.println("----------------------------");
        }
    }

    public static void main(String[] args) {
        // Create Pharmacist object (child class instance)
        Pharmacist pharmacist = new Pharmacist(101, "Rohan Verma", 45000.0, "PH-IN-9982");

        System.out.println("=== DEMONSTRATING INHERITED BEHAVIOR ===");
        // Calling inherited method from Employee parent class
        pharmacist.displayEmployeeInfo();

        System.out.println("\n=== DEMONSTRATING PHARMACIST-SPECIFIC BEHAVIOR ===");
        // Calling Pharmacist specific methods
        pharmacist.dispenseMedicine("Paracetamol 500mg");
        pharmacist.displayPharmacistDetails();
    }
}
