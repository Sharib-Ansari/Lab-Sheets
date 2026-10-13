public class MedicineMain {
    public static void main(String[] args) {
        Medicine medicine1 = new Medicine("Paracetamol", "P101", 25.50);
        Medicine medicine2 = new Medicine("Amoxicillin", "A202", 45.75);

        medicine1.displayMedicine();
        medicine2.displayMedicine();
    }
}

class Medicine {
    String medicineName;
    String batchNo;
    double price;

    Medicine(String medicineName, String batchNo, double price) {
        // this refers to the current object.
        this.medicineName = medicineName;
        this.batchNo = batchNo;
        this.price = price;
    }

    void displayMedicine() {
        System.out.println("Medicine Name: " + medicineName);
        System.out.println("Batch No: " + batchNo);
        System.out.println("Price: " + price);
        System.out.println();
    }
}