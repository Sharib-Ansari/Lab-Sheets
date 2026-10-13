public class PharmacyEmployeeMain {
    public static void main(String[] args) {
        Employee[] employees = {
            new Pharmacist(101, "Palak", 55000.0, "LIC101"),
            new StoreManager(102, "Rahul", 65000.0, 2),
            new Pharmacist(103, "Anjali", 50000.0, "LIC202")
        };

        PharmacyEmployeeManager manager =
                new PharmacyEmployeeManager();

        manager.processEmployees(employees);
    }
}

// Super class
class Employee {
    private int employeeId;
    private String employeeName;
    private double salary;

    // Static/class variable shared by all Employee objects.
    static int employeeCount;

    // Protected member genuinely used by child classes.
    protected String employeeStatus;

    Employee(int employeeId, String employeeName, double salary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.salary = salary;
        this.employeeStatus = "Active";

        employeeCount++;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        // Negative salary values are rejected.
        if (salary >= 0) {
            this.salary = salary;
        }
    }

    public String getEmployeeStatus() {
        return employeeStatus;
    }

    public void setEmployeeStatus(String employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Salary: " + salary);
        System.out.println("Status: " + employeeStatus);
    }

    // Default/package-private method.
    void showDefaultMessage() {
        System.out.println("Employee belongs to Pharmacy.");
    }
}

// Child class 1
class Pharmacist extends Employee {
    private String licenseNo;

    Pharmacist(int employeeId, String employeeName,
               double salary, String licenseNo) {
        super(employeeId, employeeName, salary);
        this.licenseNo = licenseNo;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        displayEmployee();
        System.out.println("Role: Pharmacist");
        System.out.println("License No: " + licenseNo);
    }
}

// Child class 2
class StoreManager extends Employee {
    private int storeSection;

    StoreManager(int employeeId, String employeeName,
                 double salary, int storeSection) {
        super(employeeId, employeeName, salary);
        this.storeSection = storeSection;
    }

    public int getStoreSection() {
        return storeSection;
    }

    public void setStoreSection(int storeSection) {
        this.storeSection = storeSection;
    }

    void displayStoreManager() {
        displayEmployee();
        System.out.println("Role: Store Manager");
        System.out.println("Store Section: " + storeSection);
    }
}

// Separate manager class for processing.
class PharmacyEmployeeManager {

    void processEmployees(Employee[] employees) {
        // Local variables used for processing.
        int pharmacistCount = 0;
        int managerCount = 0;
        double totalSalary = 0.0;

        for (int i = 0; i < employees.length; i++) {
            totalSalary = totalSalary + employees[i].getSalary();

            if (employees[i] instanceof Pharmacist) {
                Pharmacist pharmacist =
                        (Pharmacist) employees[i];

                pharmacist.displayPharmacist();
                pharmacist.showDefaultMessage();

                pharmacistCount++;
            } else if (employees[i] instanceof StoreManager) {
                StoreManager manager =
                        (StoreManager) employees[i];

                manager.displayStoreManager();
                manager.showDefaultMessage();

                managerCount++;
            }

            System.out.println();
        }

        System.out.println("Total Employees: " + Employee.employeeCount);
        System.out.println("Total Pharmacists: " + pharmacistCount);
        System.out.println("Total Store Managers: " + managerCount);
        System.out.println("Total Salary: " + totalSalary);
    }
}
