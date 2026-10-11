class Jagged {
    int[][] arr = {
        {1, 2},
        {3, 4, 5},
        {6, 7, 8, 9}
    };

    void display() {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Q19_JaggedArray {
    public static void main(String[] args) {
        Jagged obj = new Jagged();
        obj.display();
    }
}