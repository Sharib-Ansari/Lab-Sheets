import java.util.Scanner;

class Rainfall {
    double total;

    Rainfall() {
        total = 0;
    }

    void calculate() {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 7; i++) {
            System.out.print("Enter rainfall for day " + i + ": ");
            double rain = sc.nextDouble();

            total += rain;
        }

        System.out.println("Total rainfall = " + total);
    }

    public static void main(String[] args) {
        Rainfall obj = new Rainfall();
        obj.calculate();
    }
}