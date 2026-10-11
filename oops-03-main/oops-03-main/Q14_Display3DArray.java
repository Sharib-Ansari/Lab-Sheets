import java.util.Scanner;

class Array3D {
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

    void display() {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}

public class Q14_Display3DArray {
    public static void main(String[] args) {
        Array3D obj = new Array3D();
        obj.input();
        obj.display();
    }
}