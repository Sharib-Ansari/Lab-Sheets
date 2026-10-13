import java.util.Scanner;

class ArrayDisplay {
    int[] arr = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void display() {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}

public class Q01_InputDisplayArray {
    public static void main(String[] args) {
        ArrayDisplay obj = new ArrayDisplay();
        obj.input();
        obj.display();
    }
}