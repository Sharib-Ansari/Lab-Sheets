import java.util.Scanner;

class Palindrome {
    int number;

    Palindrome(int number) {
        this.number = number;
    }

    void check() {
        int original = number;
        int n = number;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }

        if (original == reverse) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        Palindrome obj = new Palindrome(n);
        obj.check();
    }
}