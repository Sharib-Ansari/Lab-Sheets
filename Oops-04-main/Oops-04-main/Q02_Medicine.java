// Question 2: Medicine
// Concept: Parameterized Constructor, 'this' Keyword, Instance Methods

class Medicine {
    // Instance variables
    private String medicineName;
    private String manufacturer;
    private double price;
    private String expiryDate;

    // Parameterized Constructor using 'this' keyword
    public Medicine(String medicineName, String manufacturer, double price, String expiryDate) {
        this.medicineName = medicineName;
        this.manufacturer = manufacturer;
        this.price = price;
        this.expiryDate = expiryDate;
    }

    // Method to display medicine details
    public void displayMedicineInfo() {
        System.out.println("--- Medicine Details ---");
        System.out.println("Medicine Name : " + this.medicineName);
        System.out.println("Manufacturer  : " + this.manufacturer);
        System.out.println("Price         : $" + this.price);
        System.out.println("Expiry Date   : " + this.expiryDate);
        System.out.println("------------------------");
    }
}

public class Q02_Medicine {
    public static void main(String[] args) {
        // Create Medicine object using parameterized constructor
        Medicine med = new Medicine("Paracetamol 500mg", "Apex Pharmaceuticals", 12.50, "12/2027");

        // Display information through method call
        med.displayMedicineInfo();
    }
}
