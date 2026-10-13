import java.util.Scanner;

class Array3DSum {
    int[][][] arr = new int[2][2][2];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
            }
        }
    }

    void sum() {
        int total = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    total += arr[i][j][k];
                }
            }
        }

        System.out.println("Sum = " + total);
    }
}

public class Q15_3DArraySum {
    public static void main(String[] args) {
        Array3DSum obj = new Array3DSum();
        obj.input();
        obj.sum();
    }
}