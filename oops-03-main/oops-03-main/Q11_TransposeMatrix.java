import java.util.Scanner;

class Transpose {
    int[][] arr = new int[3][3];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[j][i] + " ");
            }
            System.out.println();
        }
    }
}

public class Q11_TransposeMatrix {
    public static void main(String[] args) {
        Transpose obj = new Transpose();
        obj.input();
        obj.display();
    }
}