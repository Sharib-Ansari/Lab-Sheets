import java.util.Scanner;

class Result {
    double m1, m2, m3;

    Result(double m1, double m2, double m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    void calculate() {
        double total = m1 + m2 + m3;
        double percentage = total / 3;

        System.out.println("Total = " + total);
        System.out.println("Percentage = " + percentage + "%");

        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks of subject 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter marks of subject 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter marks of subject 3: ");
        double m3 = sc.nextDouble();

        Result obj = new Result(m1, m2, m3);
        obj.calculate();
    }
}