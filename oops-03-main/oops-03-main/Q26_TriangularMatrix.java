import java.util.Scanner;

class Triangular {
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
        System.out.println("Upper:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i <= j)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }

        System.out.println("Lower:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i >= j)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print("0 ");
            }
            System.out.println();
        }
    }
}

public class Q26_TriangularMatrix {
    public static void main(String[] args) {
        Triangular obj = new Triangular();
        obj.input();
        obj.display();
    }
}