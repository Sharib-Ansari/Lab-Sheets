public class PublicAccessMain {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();

        // Public members can be accessed directly from Main.
        hospital.hospitalName = "City Hospital";
        hospital.hospitalCode = "H101";

        hospital.displayHospital();
    }
}

class Hospital {
    // Public members are accessible from other classes.
    public String hospitalName;
    public String hospitalCode;

    public Hospital() {
        hospitalName = "Default Hospital";
        hospitalCode = "H000";
    }

    public void displayHospital() {
        System.out.println("Hospital Name: " + hospitalName);
        System.out.println("Hospital Code: " + hospitalCode);
    }
}