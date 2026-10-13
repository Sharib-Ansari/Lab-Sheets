import java.util.Scanner;

class NumberCheck {
    int num;

    NumberCheck(int num) {
        this.num = num;
    }

    void check() {
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
    }
}

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        NumberCheck obj = new NumberCheck(num);
        obj.check();
    }
}