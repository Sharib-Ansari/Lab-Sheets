public class DefaultAccessMain {
    public static void main(String[] args) {
        Pharmacy pharmacy = new Pharmacy();

        // Default members are accessible because both classes
        // are in the same package.
        pharmacy.medicineName = "Paracetamol";
        pharmacy.price = 25.50;

        pharmacy.displayMedicine();
    }
}

class Pharmacy {
    // Default/package-private variables.
    String medicineName;
    double price;

    // Default/package-private constructor.
    Pharmacy() {
        medicineName = "Unknown";
        price = 0.0;
    }

    // Default/package-private method.
    void displayMedicine() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Price: " + price);
    }
}