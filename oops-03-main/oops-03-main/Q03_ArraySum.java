import java.util.Scanner;

class ArraySum {
    int[] arr = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void sum() {
        int total = 0;

        for (int i : arr) {
            total += i;
        }

        System.out.println("Sum = " + total);
    }
}

public class Q03_ArraySum {
    public static void main(String[] args) {
        ArraySum obj = new ArraySum();
        obj.input();
        obj.sum();
    }
}