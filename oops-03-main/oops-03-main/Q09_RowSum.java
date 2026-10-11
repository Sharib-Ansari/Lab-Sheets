import java.util.Scanner;

class RowSum {
    int[][] arr = new int[3][3];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void calculate() {
        for (int i = 0; i < 3; i++) {
            int sum = 0;

            for (int j = 0; j < 3; j++) {
                sum += arr[i][j];
            }

            System.out.println("Row " + (i + 1) + " = " + sum);
        }
    }
}

public class Q09_RowSum {
    public static void main(String[] args) {
        RowSum obj = new RowSum();
        obj.input();
        obj.calculate();
    }
}