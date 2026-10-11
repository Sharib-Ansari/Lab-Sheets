import java.util.Scanner;

class SortJagged {
    int[][] arr = new int[3][];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter size: ");
            int size = sc.nextInt();

            arr[i] = new int[size];

            for (int j = 0; j < size; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void sort() {
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length - 1; j++) {

                for (int k = 0; k < arr[i].length - j - 1; k++) {

                    if (arr[i][k] > arr[i][k + 1]) {
                        int temp = arr[i][k];
                        arr[i][k] = arr[i][k + 1];
                        arr[i][k + 1] = temp;
                    }
                }
            }
        }
    }

    void display() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Q29_SortJaggedRows {
    public static void main(String[] args) {
        SortJagged obj = new SortJagged();
        obj.input();
        obj.sort();
        obj.display();
    }
}
