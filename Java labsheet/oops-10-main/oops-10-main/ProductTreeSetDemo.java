import java.util.TreeSet;

class Product implements Comparable<Product> {
    int id;
    String name;
    double price;

    Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    double getPrice() {
        return price;
    }

    public int compareTo(Product p) {
        int result = Double.compare(price, p.price);
        return result != 0 ? result : Integer.compare(id, p.id);
    }

    void display() {
        System.out.println(id + " " + name + " " + price);
    }
}

public class ProductTreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Product> products = new TreeSet<>();

        products.add(new Product(1, "Mouse", 500));
        products.add(new Product(2, "Keyboard", 800));
        products.add(new Product(3, "Monitor", 5000));
        products.add(new Product(4, "Laptop", 40000));
        products.add(new Product(5, "USB", 300));

        for (Product p : products) {
            p.display();
        }
    }
}