import java.util.Scanner;

class Greatest {
    int a, b;

    Greatest(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void findGreatest() {
        if (a > b) {
            System.out.println(a + " is greatest");
        } else if (b > a) {
            System.out.println(b + " is greatest");
        } else {
            System.out.println("Both are equal");
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Greatest obj = new Greatest(a, b);
        obj.findGreatest();
    }
}