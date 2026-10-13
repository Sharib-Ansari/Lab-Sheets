import java.util.Scanner;

class Number {
    int num;

    Number(int num) {
        this.num = num;
    }

    void checkEvenOdd() {
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
}

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        Number obj = new Number(n);
        obj.checkEvenOdd();
    }
}