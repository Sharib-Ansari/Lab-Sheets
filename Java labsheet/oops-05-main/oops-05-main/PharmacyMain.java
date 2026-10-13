public class PharmacyMain {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy("City Pharmacy", "Haridwar");
        Pharmacy pharmacy2 = new Pharmacy("Health Care Pharmacy", "Delhi");
        Pharmacy pharmacy3 = new Pharmacy("Life Pharmacy", "Dehradun");

        pharmacy1.displayPharmacy();
        pharmacy2.displayPharmacy();
        pharmacy3.displayPharmacy();

        pharmacy1.displayPharmacyCount();
    }
}

class Pharmacy {
    String pharmacyName;
    String location;

    // Class variable shared by all Pharmacy objects.
    static int pharmacyCount;

    Pharmacy(String pharmacyName, String location) {
        this.pharmacyName = pharmacyName;
        this.location = location;
        pharmacyCount++;
    }

    void displayPharmacy() {
        System.out.println("Pharmacy Name: " + pharmacyName);
        System.out.println("Location: " + location);
        System.out.println();
    }

    void displayPharmacyCount() {
        System.out.println("Total Pharmacies Created: " + pharmacyCount);
    }
}