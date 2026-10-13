import java.util.Scanner;

class HalfNumber {
    double number;
    int steps;

    HalfNumber(double number) {
        this.number = number;
        this.steps = 0;
    }

    void calculate() {
        while (number >= 1) {
            number /= 2;
            steps++;
        }

        System.out.println("Number of steps = " + steps);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double n = sc.nextDouble();

        HalfNumber obj = new HalfNumber(n);
        obj.calculate();
    }
}