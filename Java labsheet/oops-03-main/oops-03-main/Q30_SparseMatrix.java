import java.util.Scanner;

class Sparse {
    int[][] arr = new int[3][3];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void check() {
        int zero = 0;
        int nonZero = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == 0)
                    zero++;
                else
                    nonZero++;
            }
        }

        if (zero > nonZero)
            System.out.println("Sparse Matrix");
        else
            System.out.println("Not a Sparse Matrix");
    }
}

public class Q30_SparseMatrix {
    public static void main(String[] args) {
        Sparse obj = new Sparse();
        obj.input();
        obj.check();
    }
}