import java.util.Scanner;

class Diagonal {
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
        int main = 0;
        int secondary = 0;

        for (int i = 0; i < 3; i++) {
            main += arr[i][i];
            secondary += arr[i][2 - i];
        }

        System.out.println("Main Diagonal = " + main);
        System.out.println("Secondary Diagonal = " + secondary);
    }
}

public class Q25_DiagonalSum {
    public static void main(String[] args) {
        Diagonal obj = new Diagonal();
        obj.input();
        obj.sum();
    }
}