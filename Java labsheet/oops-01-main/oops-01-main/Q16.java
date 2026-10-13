import java.util.Scanner;

class TaxCalculator {
    double income;

    TaxCalculator(double income) {
        this.income = income;
    }

    void calculateTax() {
        double tax;

        if (income <= 250000) {
            tax = 0;
        } else if (income <= 500000) {
            tax = income * 0.05;
        } else if (income <= 1000000) {
            tax = income * 0.20;
        } else {
            tax = income * 0.30;
        }

        System.out.println("Income = " + income);
        System.out.println("Tax = " + tax);
    }
}

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter income: ");
        double income = sc.nextDouble();

        TaxCalculator obj = new TaxCalculator(income);
        obj.calculateTax();
    }
}