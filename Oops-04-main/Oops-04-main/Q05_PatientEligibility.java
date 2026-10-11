// Question 5: Patient Eligibility
// Concept: Encapsulation of Business Logic, Conditional Statements in Class Methods

class Patient {
    private String patientName;
    private int age;

    public Patient(String patientName, int age) {
        this.patientName = patientName;
        this.age = age;
    }

    // Classification method containing the if-else condition INSIDE the Patient class
    public void classifyEligibility() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Patient Age : " + age);
        
        // If-Else logic strictly inside Patient method
        if (age >= 60) {
            System.out.println("Eligibility Status: Eligible for Senior Citizen Healthcare Subsidy.");
        } else if (age >= 18) {
            System.out.println("Eligibility Status: Eligible for Standard Adult Healthcare Plan.");
        } else if (age > 0) {
            System.out.println("Eligibility Status: Eligible for Pediatric Care Program.");
        } else {
            System.out.println("Eligibility Status: Invalid Age Entered.");
        }
        System.out.println("---------------------------------------------------------");
    }
}

public class Q05_PatientEligibility {
    public static void main(String[] args) {
        // Main creates Patient objects and calls method (NO if-else logic in main)
        Patient patient1 = new Patient("Ramesh Gupta", 65);
        Patient patient2 = new Patient("Priya Sharma", 28);
        Patient patient3 = new Patient("Aarav Mehta", 8);

        patient1.classifyEligibility();
        patient2.classifyEligibility();
        patient3.classifyEligibility();
    }
}
