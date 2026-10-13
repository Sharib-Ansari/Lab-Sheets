// Question 10: Hierarchical Hospital Staff
// Concept: Hierarchical Inheritance (One Base Class inherited by Multiple Derived Classes)

public class Q10_HierarchicalHospitalStaff {

    // Parent Class
    static class Employee {
        protected int staffId;
        protected String name;
        protected String department;

        public Employee(int staffId, String name, String department) {
            this.staffId = staffId;
            this.name = name;
            this.department = department;
        }

        public void displayBaseInfo() {
            System.out.println("Staff ID   : " + staffId);
            System.out.println("Name       : " + name);
            System.out.println("Department : " + department);
        }
    }

    // First Child Class inheriting Employee
    static class Doctor extends Employee {
        private String specialization;

        public Doctor(int staffId, String name, String department, String specialization) {
            super(staffId, name, department);
            this.specialization = specialization;
        }

        // Doctor-specific behavior
        public void performDiagnosis(String patientName) {
            System.out.println("Dr. " + name + " (" + specialization + ") is diagnosing patient: " + patientName);
        }

        public void displayDoctorInfo() {
            System.out.println("--- DOCTOR DETAILS ---");
            displayBaseInfo();
            System.out.println("Specialization: " + specialization);
            System.out.println("----------------------");
        }
    }

    // Second Child Class inheriting Employee
    static class Pharmacist extends Employee {
        private String shift;

        public Pharmacist(int staffId, String name, String department, String shift) {
            super(staffId, name, department);
            this.shift = shift;
        }

        // Pharmacist-specific behavior
        public void verifyPrescription(int prescriptionId) {
            System.out.println("Pharmacist " + name + " (Shift: " + shift + ") verified prescription #" + prescriptionId);
        }

        public void displayPharmacistInfo() {
            System.out.println("--- PHARMACIST DETAILS ---");
            displayBaseInfo();
            System.out.println("Shift Duty : " + shift);
            System.out.println("--------------------------");
        }
    }

    public static void main(String[] args) {
        // Create objects of both child classes inheriting from same Employee parent class
        Doctor doctor = new Doctor(201, "Dr. Priya Nair", "Cardiology", "Cardiologist");
        Pharmacist pharmacist = new Pharmacist(202, "Amit Patel", "Pharmacy Depot", "Night Shift");

        System.out.println("=== DEMONSTRATING HIERARCHICAL INHERITANCE ===");
        
        // Doctor details & action
        doctor.displayDoctorInfo();
        doctor.performDiagnosis("Anil Kapoor");

        System.out.println();

        // Pharmacist details & action
        pharmacist.displayPharmacistInfo();
        pharmacist.verifyPrescription(88421);
    }
}
