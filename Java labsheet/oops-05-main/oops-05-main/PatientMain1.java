public class PatientMain1 {
    public static void main(String[] args) {
        Patient patient = new Patient("Rahul", 25, 65.5);

        patient.setAge(30);       // Valid
        patient.setAge(-5);       // Invalid

        patient.setWeight(70.0);  // Valid
        patient.setWeight(-10);   // Invalid

        patient.displayPatient();

        System.out.println("Name: " + patient.getPatientName());
        System.out.println("Age: " + patient.getAge());
        System.out.println("Weight: " + patient.getWeight());
    }
}

class Patient {
    private String patientName;
    private int age;
    private double weight;

    Patient(String patientName, int age, double weight) {
        this.patientName = patientName;
        this.age = age;
        this.weight = weight;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public void displayPatient() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
    }
}