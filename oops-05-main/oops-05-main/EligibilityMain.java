public class EligibilityMain {
    public static void main(String[] args) {
        Medicine medicine = new Medicine("Adult Medicine", 18);

        System.out.println("Patient Age 25: "
                + medicine.checkEligibility(25));

        System.out.println("Patient Age 15: "
                + medicine.checkEligibility(15));
    }
}

class Medicine {
    String medicineName;
    int ageLimit;

    Medicine(String medicineName, int ageLimit) {
        this.medicineName = medicineName;
        this.ageLimit = ageLimit;
    }

    String checkEligibility(int patientAge) {
        // Local variable stores the method result.
        String result;

        if (patientAge >= ageLimit) {
            result = "Eligible";
        } else {
            result = "Not Eligible";
        }

        return result;
    }
}