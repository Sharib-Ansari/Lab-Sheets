import java.util.Scanner;

class Divisibility {
    int num;

    Divisibility(int num) {
        this.num = num;
    }

    void check() {
        if (num % 3 == 0 && num % 5 == 0) {
            System.out.println("Divisible by both 3 and 5");
        } else {
            System.out.println("Not divisible by both 3 and 5");
        }
    }
}

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int n = sc.nextInt();

        Divisibility obj = new Divisibility(n);
        obj.check();
    }
}