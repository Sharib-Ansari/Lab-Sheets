import java.util.Scanner;

class ShiftOperations {
    int number;

    ShiftOperations(int number) {
        this.number = number;
    }

    void calculate() {
        System.out.println("Number * 2 = " + (number << 1));
        System.out.println("Number * 4 = " + (number << 2));
        System.out.println("Number / 2 = " + (number >> 1));
        System.out.println("Number / 4 = " + (number >> 2));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        ShiftOperations obj = new ShiftOperations(n);
        obj.calculate();
    }
}