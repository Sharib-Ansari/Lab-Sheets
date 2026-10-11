import java.util.Scanner;

class LargestNumber {
    int a, b, c;

    LargestNumber(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void findLargest() {
        int largest;

        if (a > b) {
            if (a > c) {
                largest = a;
            } else {
                largest = c;
            }
        } else {
            if (b > c) {
                largest = b;
            } else {
                largest = c;
            }
        }

        System.out.println("Largest = " + largest);
    }
}

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        LargestNumber obj = new LargestNumber(a, b, c);
        obj.findLargest();
    }
}