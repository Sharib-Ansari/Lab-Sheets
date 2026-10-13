import java.util.Scanner;

class Conversion {
    float num;

    Conversion(float num) {
        this.num = num;
    }

    void convert() {
        int value = (int) num;

        System.out.println("Original value: " + num);
        System.out.println("Integer value: " + value);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter floating-point number: ");
        float num = sc.nextFloat();

        Conversion obj = new Conversion(num);
        obj.convert();
    }
}