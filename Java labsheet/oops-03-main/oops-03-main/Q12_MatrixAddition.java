import java.util.Scanner;

class MatrixAddition {
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

    void add() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = a[i][j] + b[i][j];
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

public class Q12_MatrixAddition {
    public static void main(String[] args) {
        MatrixAddition obj = new MatrixAddition();
        obj.input();
        obj.add();
        obj.display();
    }
}