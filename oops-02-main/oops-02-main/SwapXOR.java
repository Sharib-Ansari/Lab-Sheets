import java.util.Scanner;

class SwapXOR {
    int a, b;

    SwapXOR(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void swap() {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        SwapXOR obj = new SwapXOR(a, b);
        obj.swap();
    }
}