import java.util.Scanner;

class OperatorCalculator {
    int a, b;
    char operator;

    OperatorCalculator(int a, int b, char operator) {
        this.a = a;
        this.b = b;
        this.operator = operator;
    }

    void calculate() {
        if (operator == '+') {
            System.out.println("Result = " + (a + b));
        } else if (operator == '-') {
            System.out.println("Result = " + (a - b));
        } else if (operator == '*') {
            System.out.println("Result = " + (a * b));
        } else if (operator == '/') {
            if (b != 0) {
                System.out.println("Result = " + (a / b));
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else {
            System.out.println("Invalid operator.");
        }
    }
}

public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        OperatorCalculator obj =
                new OperatorCalculator(a, b, operator);

        obj.calculate();
    }
}