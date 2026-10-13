import java.util.Scanner;

class EvenOdd {
    int[] arr = new int[10];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void count() {
        int even = 0, odd = 0;

        for (int i : arr) {
            if (i % 2 == 0)
                even++;
            else
                odd++;
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}

public class Q05_EvenOddCount {
    public static void main(String[] args) {
        EvenOdd obj = new EvenOdd();
        obj.input();
        obj.count();
    }
}