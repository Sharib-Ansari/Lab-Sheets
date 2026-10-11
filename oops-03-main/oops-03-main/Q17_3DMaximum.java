import java.util.Scanner;

class Maximum3D {
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

    void findMax() {
        int max = arr[0][0][0];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] > max) {
                        max = arr[i][j][k];
                    }
                }
            }
        }

        System.out.println("Maximum = " + max);
    }
}

public class Q17_3DMaximum {
    public static void main(String[] args) {
        Maximum3D obj = new Maximum3D();
        obj.input();
        obj.findMax();
    }
}