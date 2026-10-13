import java.util.Scanner;

class ValidTriangle {
    int a, b, c;

    ValidTriangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void check() {
        if (a > 0 && b > 0 && c > 0 && a + b + c == 180) {
            System.out.println("Valid Triangle");
        } else {
            System.out.println("Invalid Triangle");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three angles: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        ValidTriangle obj = new ValidTriangle(a, b, c);
        obj.check();
    }
}