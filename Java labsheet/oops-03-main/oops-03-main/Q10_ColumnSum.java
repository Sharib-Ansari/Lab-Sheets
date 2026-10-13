import java.util.Scanner;

class ColumnSum {
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
        for (int j = 0; j < 3; j++) {
            int sum = 0;

            for (int i = 0; i < 3; i++) {
                sum += arr[i][j];
            }

            System.out.println("Column " + (j + 1) + " = " + sum);
        }
    }
}

public class Q10_ColumnSum {
    public static void main(String[] args) {
        ColumnSum obj = new ColumnSum();
        obj.input();
        obj.calculate();
    }
}