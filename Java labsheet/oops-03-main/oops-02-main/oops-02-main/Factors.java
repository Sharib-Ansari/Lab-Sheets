import java.util.Scanner;

class Factors {
    int number;

    Factors(int number) {
        this.number = number;
    }

    void displayFactors() {
        int i = 1;

        do {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
            i++;
        } while (i <= number);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        Factors obj = new Factors(n);
        obj.displayFactors();
    }
}