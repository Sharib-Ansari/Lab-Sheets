// Question 3: Pharmacy
// Concept: Static Variables, Static Methods, Shared Class Variables

class Pharmacy {
    // Static variables shared across all Pharmacy objects
    private static String pharmacyName;
    private static String location;

    // Instance variable unique to each store object
    private String storeId;

    // Parameterized Constructor
    public Pharmacy(String storeId) {
        this.storeId = storeId;
    }

    // Class method to set static details
    public static void setPharmacyDetails(String name, String loc) {
        pharmacyName = name;
        location = loc;
    }

    // Method inside class to display store details including shared static values
    public void displayStoreInfo() {
        System.out.println("Store ID      : " + this.storeId);
        System.out.println("Pharmacy Name : " + pharmacyName);
        System.out.println("Location      : " + location);
        System.out.println("---------------------------------");
    }

    // Method to demonstrate that modifying static variable affects all instances
    public static void demonstrateSharedBehavior(Pharmacy store1, Pharmacy store2) {
        System.out.println("=== INITIAL PHARMACY DETAILS ===");
        store1.displayStoreInfo();
        store2.displayStoreInfo();

        System.out.println("=== UPDATING STATIC DETAILS VIA CLASS METHOD ===");
        setPharmacyDetails("MediCare Central Pharmacy", "City Hospital Campus");

        System.out.println("=== DETAILS AFTER UPDATING STATIC VARIABLES ===");
        System.out.println("(Notice both objects reflect the new shared static values)");
        store1.displayStoreInfo();
        store2.displayStoreInfo();
    }
}

public class Q03_Pharmacy {
    public static void main(String[] args) {
        // Set initial static pharmacy details
        Pharmacy.setPharmacyDetails("MediCare Health Pharmacy", "Downtown Square");

        // Create multiple Pharmacy objects
        Pharmacy store1 = new Pharmacy("STORE-01");
        Pharmacy store2 = new Pharmacy("STORE-02");

        // Execute demonstration through class method
        Pharmacy.demonstrateSharedBehavior(store1, store2);
    }
}
