import java.util.Scanner;

class PrimeNumber {
    int num;

    PrimeNumber(int num) {
        this.num = num;
    }

    void check() {
        if (num <= 1) {
            System.out.println("Not a Prime Number");
            return;
        }

        boolean prime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println("Prime Number");
        } else {
            System.out.println("Not a Prime Number");
        }
    }
}

public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        PrimeNumber obj = new PrimeNumber(num);
        obj.check();
    }
}