import java.util.Scanner;

class BitRotation {
    int number;

    BitRotation(int number) {
        this.number = number;
    }

    void rotate() {
        int result = (number << 2) | (number >>> 30);

        System.out.println("After left rotation by 2 bits = " + result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        BitRotation obj = new BitRotation(n);
        obj.rotate();
    }
}