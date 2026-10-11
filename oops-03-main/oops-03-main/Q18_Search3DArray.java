import java.util.Scanner;

class Search3D {
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

    void search() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element: ");
        int value = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    if (arr[i][j][k] == value) {
                        System.out.println("Position: "
                                + i + " " + j + " " + k);
                        found = true;
                    }
                }
            }
        }

        if (!found)
            System.out.println("Not found");
    }
}

public class Q18_Search3DArray {
    public static void main(String[] args) {
        Search3D obj = new Search3D();
        obj.input();
        obj.search();
    }
}