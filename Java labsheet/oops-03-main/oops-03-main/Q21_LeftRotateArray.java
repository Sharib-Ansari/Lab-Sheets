import java.util.Scanner;

class RotateArray {
    int[] arr = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void rotate() {
        int first = arr[0];

        for (int i = 0; i < 4; i++) {
            arr[i] = arr[i + 1];
        }

        arr[4] = first;
    }

    void display() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class Q21_LeftRotateArray {
    public static void main(String[] args) {
        RotateArray obj = new RotateArray();
        obj.input();
        obj.rotate();
        obj.display();
    }
}