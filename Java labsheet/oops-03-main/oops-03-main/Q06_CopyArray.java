import java.util.Scanner;

class CopyArray {
    int[] arr1 = new int[5];
    int[] arr2 = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr1[i] = sc.nextInt();
        }
    }

    void copy() {
        for (int i = 0; i < 5; i++) {
            arr2[i] = arr1[i];
        }
    }

    void display() {
        for (int i : arr2) {
            System.out.print(i + " ");
        }
    }
}

public class Q06_CopyArray {
    public static void main(String[] args) {
        CopyArray obj = new CopyArray();
        obj.input();
        obj.copy();
        obj.display();
    }
}