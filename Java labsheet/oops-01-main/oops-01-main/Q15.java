import java.util.Scanner;

class Armstrong {
    int num;

    Armstrong(int num) {
        this.num = num;
    }

    void check() {
        if (num < 100 || num > 999) {
            System.out.println("Enter a 3-digit number.");
            return;
        }

        int original = num;

        int digit1 = num % 10;
        num = num / 10;

        int digit2 = num % 10;
        num = num / 10;

        int digit3 = num % 10;

        int sum = (digit1 * digit1 * digit1)
                + (digit2 * digit2 * digit2)
                + (digit3 * digit3 * digit3);

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 3-digit number: ");
        int num = sc.nextInt();

        Armstrong obj = new Armstrong(num);
        obj.check();
    }
}