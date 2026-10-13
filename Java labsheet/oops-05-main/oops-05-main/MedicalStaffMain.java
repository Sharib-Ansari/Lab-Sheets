public class MedicalStaffMain {
    public static void main(String[] args) {
        Doctor doctor =
                new Doctor(101, "Dr. Rahul", "Cardiology");

        Pharmacist pharmacist =
                new Pharmacist(102, "Anjali", "LIC202");

        doctor.displayDoctor();
        System.out.println();
        pharmacist.displayPharmacist();
    }
}

// Super class
class MedicalStaff {
    protected int staffId;
    protected String staffName;

    MedicalStaff(int staffId, String staffName) {
        this.staffId = staffId;
        this.staffName = staffName;
    }
}

// Child class 1
class Doctor extends MedicalStaff {
    private String specialization;

    Doctor(int staffId, String staffName, String specialization) {
        super(staffId, staffName);
        this.specialization = specialization;
    }

    void displayDoctor() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Specialization: " + specialization);
    }
}

// Child class 2
class Pharmacist extends MedicalStaff {
    private String licenseNo;

    Pharmacist(int staffId, String staffName, String licenseNo) {
        super(staffId, staffName);
        this.licenseNo = licenseNo;
    }

    void displayPharmacist() {
        System.out.println("Staff ID: " + staffId);
        System.out.println("Staff Name: " + staffName);
        System.out.println("License No: " + licenseNo);
    }
}