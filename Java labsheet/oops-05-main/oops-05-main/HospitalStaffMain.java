public class HospitalStaffMain {
    public static void main(String[] args) {
        Employee[] staff = {
            new Doctor("Dr. Rahul", 40, 101, 90000.0, "Cardiology"),
            new Pharmacist("Anjali", 30, 102, 55000.0, "LIC202")
        };

        HospitalStaffManager manager = new HospitalStaffManager();
        manager.displayStaff(staff);
    }
}

// Top-level super class
class Person {
    protected String name;
    protected int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

// Employee is a child of Person
class Employee extends Person {
    private int employeeId;
    private double salary;

    // Static variable shared by all Employee objects.
    static int employeeCount;

    Employee(String name, int age, int employeeId, double salary) {
        super(name, age);
        this.employeeId = employeeId;
        this.salary = salary;
        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

// Doctor descendant through Employee
class Doctor extends Employee {
    private String specialization;

    Doctor(String name, int age, int employeeId,
           double salary, String specialization) {
        super(name, age, employeeId, salary);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    void displayDoctor() {
        displayEmployee();
        System.out.println("Role: Doctor");
        System.out.println("Specialization: " + specialization);
    }
}

// Pharmacist descendant through Employee
class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(String name, int age, int employeeId,
               double salary, String licenseNo) {
        super(name, age, employeeId, salary);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Role: Pharmacist");
        System.out.println("License No: " + licenseNo);
    }
}

// Separate manager class keeps processing outside main().
class HospitalStaffManager {
    void displayStaff(Employee[] staff) {
        for (int i = 0; i < staff.length; i++) {
            if (staff[i] instanceof Doctor) {
                Doctor doctor = (Doctor) staff[i];
                doctor.displayDoctor();
            } else if (staff[i] instanceof Pharmacist) {
                Pharmacist pharmacist = (Pharmacist) staff[i];
                pharmacist.displayPharmacist();
            }

            System.out.println();
        }

        System.out.println("Total Employees: " + Employee.employeeCount);
    }
}