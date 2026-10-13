// Question 8: Patient Bill
// Concept: Encapsulation, Setters for Attribute Assignment, Internal Calculation Methods

class PatientBill {
    private String patientName;
    // Private fee variables
    private double consultationFee;
    private double medicineFee;
    private double labTestFee;

    // Constructor initializing patient name
    public PatientBill(String patientName) {
        this.patientName = patientName;
        this.consultationFee = 0.0;
        this.medicineFee = 0.0;
        this.labTestFee = 0.0;
    }

    // Setters to assign fee amounts safely
    public void setConsultationFee(double consultationFee) {
        if (consultationFee >= 0) {
            this.consultationFee = consultationFee;
        }
    }

    public void setMedicineFee(double medicineFee) {
        if (medicineFee >= 0) {
            this.medicineFee = medicineFee;
        }
    }

    public void setLabTestFee(double labTestFee) {
        if (labTestFee >= 0) {
            this.labTestFee = labTestFee;
        }
    }

    // Method to calculate total bill INSIDE the class (MUST NOT be in main)
    public double calculateTotalBill() {
        return consultationFee + medicineFee + labTestFee;
    }

    // Method to display complete bill summary
    public void displayBillSummary() {
        System.out.println("--- PATIENT BILL SUMMARY ---");
        System.out.println("Patient Name     : " + patientName);
        System.out.println("Consultation Fee : $" + consultationFee);
        System.out.println("Medicine Fee     : $" + medicineFee);
        System.out.println("Lab Test Fee     : $" + labTestFee);
        System.out.println("----------------------------");
        System.out.println("Total Amount Due : $" + calculateTotalBill());
        System.out.println("----------------------------");
    }
}

public class Q08_PatientBill {
    public static void main(String[] args) {
        // Main creates object
        PatientBill bill = new PatientBill("Vikram Desai");

        // Set fees using setters (NO calculation performed in main)
        bill.setConsultationFee(450.00);
        bill.setMedicineFee(1200.50);
        bill.setLabTestFee(750.00);

        // Call display method which internally calculates and prints total bill
        bill.displayBillSummary();
    }
}
