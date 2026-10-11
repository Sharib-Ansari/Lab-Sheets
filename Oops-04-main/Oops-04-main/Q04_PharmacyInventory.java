// Question 4: Pharmacy Inventory
// Concept: Aggregation/Composition, Array of Objects, Encapsulating Iteration Logic

class MedicineStock {
    private String name;
    private int quantity;
    private double unitPrice;

    public MedicineStock(String name, int quantity, double unitPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public void displayStock() {
        System.out.println("Medicine: " + name + " | Quantity: " + quantity + " | Price per Unit: $" + unitPrice);
    }
}

class Inventory {
    // MedicineStock array and counter belong to the Inventory class
    private MedicineStock[] stockList;
    private int count;

    // Constructor defining array capacity
    public Inventory(int capacity) {
        stockList = new MedicineStock[capacity];
        count = 0;
    }

    // Method to add/store medicine stock inside the Inventory array
    public void addMedicineStock(MedicineStock stock) {
        if (count < stockList.length) {
            stockList[count] = stock;
            count++;
        } else {
            System.out.println("Inventory full! Cannot add " + stock);
        }
    }

    // Method to display all medicine stock (Loop MUST belong to Inventory class, NOT main)
    public void displayAllStock() {
        System.out.println("--- PHARMACY INVENTORY STOCK LIST ---");
        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + ". ");
            stockList[i].displayStock();
        }
        System.out.println("-------------------------------------");
    }
}

public class Q04_PharmacyInventory {
    public static void main(String[] args) {
        // Main only creates Inventory object
        Inventory inventory = new Inventory(5);

        // Add required MedicineStock objects
        inventory.addMedicineStock(new MedicineStock("Amoxicillin", 120, 15.00));
        inventory.addMedicineStock(new MedicineStock("Ibuprofen", 200, 8.50));
        inventory.addMedicineStock(new MedicineStock("Cetirizine", 90, 5.25));

        // Call the display method (Iteration loop is strictly inside Inventory class)
        inventory.displayAllStock();
    }
}
