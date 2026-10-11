import java.util.Scanner;

class SetBits {
    int number;

    SetBits(int number) {
        this.number = number;
    }

    void countBits() {
        int count = 0;
        int n = number;

        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }

        System.out.println("Number of set bits = " + count);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        SetBits obj = new SetBits(n);
        obj.countBits();
    }
}