// Question 15: Final Hospital Staff System
// Concept: Integrated OOP Application (Classes, Objects, Encapsulation, Constructors, Static, Inheritance, Methods, Validation)

// Parent Class: HospitalStaff
class HospitalStaff {
    private int staffId;
    private String name;
    private double baseSalary;

    // Constructor with validation
    public HospitalStaff(int staffId, String name, double baseSalary) {
        this.staffId = staffId;
        this.name = name;
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        } else {
            this.baseSalary = 30000.0; // Default fallback salary
        }
    }

    // Getters and Setters (Encapsulation)
    public int getStaffId() {
        return staffId;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary > 0) {
            this.baseSalary = baseSalary;
        }
    }

    // Method to calculate monthly pay
    public double calculateMonthlyPay() {
        return baseSalary;
    }

    // Display method
    public void displayInfo() {
        System.out.println("Staff ID    : " + staffId);
        System.out.println("Name        : " + name);
        System.out.println("Base Salary : $" + baseSalary);
    }
}

// Derived Class 1: DoctorStaff (Inheritance)
class DoctorStaff extends HospitalStaff {
    private String specialization;
    private double consultationBonus;

    public DoctorStaff(int staffId, String name, double baseSalary, String specialization, double consultationBonus) {
        super(staffId, name, baseSalary);
        this.specialization = specialization;
        if (consultationBonus >= 0) {
            this.consultationBonus = consultationBonus;
        } else {
            this.consultationBonus = 0.0;
        }
    }

    // Override pay calculation
    @Override
    public double calculateMonthlyPay() {
        return getBaseSalary() + consultationBonus;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- DOCTOR RECORD ---");
        super.displayInfo();
        System.out.println("Specialization : " + specialization);
        System.out.println("Bonus          : $" + consultationBonus);
        System.out.println("Total Net Pay  : $" + calculateMonthlyPay());
        System.out.println("---------------------");
    }
}

// Derived Class 2: PharmacistStaff (Inheritance)
class PharmacistStaff extends HospitalStaff {
    private String shift;
    private double dispensingAllowance;

    public PharmacistStaff(int staffId, String name, double baseSalary, String shift, double dispensingAllowance) {
        super(staffId, name, baseSalary);
        this.shift = shift;
        if (dispensingAllowance >= 0) {
            this.dispensingAllowance = dispensingAllowance;
        } else {
            this.dispensingAllowance = 0.0;
        }
    }

    // Override pay calculation
    @Override
    public double calculateMonthlyPay() {
        return getBaseSalary() + dispensingAllowance;
    }

    @Override
    public void displayInfo() {
        System.out.println("--- PHARMACIST RECORD ---");
        super.displayInfo();
        System.out.println("Shift Duty     : " + shift);
        System.out.println("Allowance      : $" + dispensingAllowance);
        System.out.println("Total Net Pay  : $" + calculateMonthlyPay());
        System.out.println("-------------------------");
    }
}

// System Controller Class
class HospitalSystem {
    // Static Variable
    private static String hospitalName = "City Care General Hospital & Research Center";

    private HospitalStaff[] staffMembers;
    private int count;

    public HospitalSystem() {
        staffMembers = new HospitalStaff[5];
        count = 0;
    }

    private void addStaff(HospitalStaff staff) {
        if (count < staffMembers.length) {
            staffMembers[count] = staff;
            count++;
        }
    }

    // Main execution method containing system initialization, business logic, calculations and display
    public void run() {
        System.out.println("===============================================================");
        System.out.println("          WELCOME TO " + hospitalName.toUpperCase());
        System.out.println("===============================================================\n");

        // Object creation and setup handled INSIDE HospitalSystem method
        addStaff(new DoctorStaff(101, "Dr. Rajesh Sharma", 85000.0, "Cardiology", 15000.0));
        addStaff(new DoctorStaff(102, "Dr. Sunita Patel", 78000.0, "Pediatrics", 12000.0));
        addStaff(new PharmacistStaff(201, "Anil Kumar", 42000.0, "Day Shift", 4500.0));
        addStaff(new PharmacistStaff(202, "Meena Verma", 44000.0, "Night Shift", 6000.0));

        // Process and display all staff records
        double totalPayroll = 0.0;
        System.out.println("=== HOSPITAL STAFF PAYROLL & INFORMATION SYSTEM ===");
        for (int i = 0; i < count; i++) {
            staffMembers[i].displayInfo();
            totalPayroll += staffMembers[i].calculateMonthlyPay();
            System.out.println();
        }

        // Display summary calculation
        System.out.println("===============================================================");
        System.out.println(" Total Staff Members Processed : " + count);
        System.out.println(" Total Monthly Payroll Expense : $" + String.format("%.2f", totalPayroll));
        System.out.println("===============================================================");
    }
}

public class Q15_FinalHospitalStaffSystem {
    public static void main(String[] args) {
        // MAIN ONLY CREATES THE SYSTEM OBJECT AND CALLS ITS METHOD
        HospitalSystem system = new HospitalSystem();
        system.run();
    }
}
