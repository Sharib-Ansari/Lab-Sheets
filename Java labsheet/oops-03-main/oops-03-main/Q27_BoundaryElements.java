import java.util.Scanner;

class Boundary {
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

                if (i == 0 || i == 2 || j == 0 || j == 2)
                    System.out.print(arr[i][j] + " ");
                else
                    System.out.print("  ");
            }

            System.out.println();
        }
    }
}

public class Q27_BoundaryElements {
    public static void main(String[] args) {
        Boundary obj = new Boundary();
        obj.input();
        obj.display();
    }
}