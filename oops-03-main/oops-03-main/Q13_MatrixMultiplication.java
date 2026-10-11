import java.util.Scanner;

class MatrixMultiplication {
    int[][] a = new int[3][3];
    int[][] b = new int[3][3];
    int[][] result = new int[3][3];

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter second matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                b[i][j] = sc.nextInt();
            }
        }
    }

    void multiply() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
    }

    void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Q13_MatrixMultiplication {
    public static void main(String[] args) {
        MatrixMultiplication obj = new MatrixMultiplication();
        obj.input();
        obj.multiply();
        obj.display();
    }
}