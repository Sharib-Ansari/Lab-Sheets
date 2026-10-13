import java.util.Scanner;

class SearchMatrix {
    int[][] arr = new int[3][3];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void search() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter element: ");
        int value = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] == value) {
                    System.out.println("Row = " + i + ", Column = " + j);
                    found = true;
                }
            }
        }

        if (!found)
            System.out.println("Element not found");
    }
}

public class Q28_Search2DArray {
    public static void main(String[] args) {
        SearchMatrix obj = new SearchMatrix();
        obj.input();
        obj.search();
    }
}