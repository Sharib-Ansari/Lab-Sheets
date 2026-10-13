import java.util.Scanner;

class PositiveNegative {
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

    void count() {
        int positive = 0, negative = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] > 0)
                        positive++;
                    else if (arr[i][j][k] < 0)
                        negative++;
                }
            }
        }

        System.out.println("Positive = " + positive);
        System.out.println("Negative = " + negative);
    }
}

public class Q16_3DPositiveNegative {
    public static void main(String[] args) {
        PositiveNegative obj = new PositiveNegative();
        obj.input();
        obj.count();
    }
}