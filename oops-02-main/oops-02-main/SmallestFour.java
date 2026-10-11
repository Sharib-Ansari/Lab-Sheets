import java.util.Scanner;

class SmallestFour {
    int a, b, c, d;

    SmallestFour(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    void findSmallest() {
        int smallest = (a < b)
                ? ((a < c) ? ((a < d) ? a : d) : ((c < d) ? c : d))
                : ((b < c) ? ((b < d) ? b : d) : ((c < d) ? c : d));

        System.out.println("Smallest = " + smallest);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter four numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        SmallestFour obj = new SmallestFour(a, b, c, d);
        obj.findSmallest();
    }
}