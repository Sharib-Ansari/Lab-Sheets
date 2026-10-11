public class PatientMain {
    public static void main(String[] args) {
        Patient[] patients = {
            new Patient(101, "Rahul", 25),
            new Patient(102, "Anjali", 30),
            new Patient(103, "Aman", 22),
            new Patient(104, "Priya", 35),
            new Patient(105, "Rohit", 40)
        };

        PatientManager manager = new PatientManager();
        manager.displayAllPatients(patients);
    }
}

class Patient {
    int patientId;
    String patientName;
    int age;

    Patient(int patientId, String patientName, int age) {
        this.patientId = patientId;
        this.patientName = patientName;
        this.age = age;
    }

    void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println();
    }
}

class PatientManager {
    void displayAllPatients(Patient[] patients) {
        // Local variable used for loop processing.
        for (int i = 0; i < patients.length; i++) {
            patients[i].displayPatient();
        }
    }
}