import java.util.Scanner;

class MatrixSum {
    int[][] arr = new int[3][3];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void sum() {
        int total = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                total += arr[i][j];
            }
        }

        System.out.println("Sum = " + total);
    }
}

public class Q08_MatrixSum {
    public static void main(String[] args) {
        MatrixSum obj = new MatrixSum();
        obj.input();
        obj.sum();
    }
}