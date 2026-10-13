// Question 6: Encapsulated Medicine Product
// Concept: Encapsulation, Private Instance Variables, Getter/Setter Methods

class MedicineProduct {
    // Private instance variables for encapsulation
    private String medicineId;
    private String name;
    private double price;

    // Constructor
    public MedicineProduct(String medicineId, String name, double price) {
        this.medicineId = medicineId;
        this.name = name;
        this.price = price;
    }

    // Getters and Setters demonstrating controlled access
    public String getMedicineId() {
        return medicineId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    // Method inside class to display medicine data
    public void displayProductDetails() {
        System.out.println("--- ENCAPSULATED MEDICINE PRODUCT ---");
        System.out.println("Medicine ID : " + medicineId);
        System.out.println("Name        : " + name);
        System.out.println("Price       : $" + price);
        System.out.println("------------------------------------");
    }
}

public class Q06_EncapsulatedMedicine {
    public static void main(String[] args) {
        // Main creates object and calls display method
        MedicineProduct med = new MedicineProduct("MED-501", "Azithromycin 500mg", 35.75);

        med.displayProductDetails();
    }
}
