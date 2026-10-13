public class SingleInheritanceMain {
    public static void main(String[] args) {
        Pharmacist pharmacist =
                new Pharmacist(101, "Palak", 55000.0, "LIC101");

        pharmacist.displayPharmacist();
    }
}

// Super class
class Employee {
    protected int employeeId;
    protected String employeeName;
    protected double salary;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
    }
}

// Child class
class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName,
               double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("License No: " + licenseNo);
    }
}