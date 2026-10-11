import java.util.Scanner;

class MixedAdvanced {
    int number;

    MixedAdvanced(int number) {
        this.number = number;
    }

    boolean isPowerOfFour() {
        int n = number;

        if (n <= 0) {
            return false;
        }

        while (n > 1) {
            if ((n & 3) != 0) {
                return false;
            }

            n = n >> 2;
        }

        return n == 1;
    }

    void toggleThirdBit() {
        number = number ^ (1 << 2);

        System.out.println("After toggling 3rd bit = " + number);
    }

    void multiplicationTable() {
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 10; i++) {

            if (i % 6 == 0) {
                continue;
            }

            int result = number * i;

            if (result % 48 == 0) {
                break;
            }

            System.out.println(number + " x " + i + " = " + result);
        }
    }

    void execute() {
        if (isPowerOfFour()) {

            System.out.println(number + " is a power of 4.");

            toggleThirdBit();

            multiplicationTable();

        } else {
            System.out.println(number + " is not a power of 4.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        MixedAdvanced obj = new MixedAdvanced(n);

        obj.execute();
    }
}