import java.util.Scanner;

class ReverseArray {
    int[] arr = new int[10];

    void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void reverse() {
        for (int i = 9; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class Q02_ReverseArray {
    public static void main(String[] args) {
        ReverseArray obj = new ReverseArray();
        obj.input();
        obj.reverse();
    }
}