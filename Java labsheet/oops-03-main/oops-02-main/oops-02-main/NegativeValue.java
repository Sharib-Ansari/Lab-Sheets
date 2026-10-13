import java.util.Scanner;

class NegativeValue {
    int number;

    NegativeValue(int number) {
        this.number = number;
    }

    void displayNegative() {
        System.out.println("Negative value = " + (-number));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int n = sc.nextInt();

        NegativeValue obj = new NegativeValue(n);
        obj.displayNegative();
    }
}