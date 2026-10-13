import java.util.Scanner;

class ReverseNumber {
    int number;

    ReverseNumber(int number) {
        this.number = number;
    }

    void reverse() {
        int n = number;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        System.out.println("Reverse = " + reverse);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        ReverseNumber obj = new ReverseNumber(n);
        obj.reverse();
    }
}