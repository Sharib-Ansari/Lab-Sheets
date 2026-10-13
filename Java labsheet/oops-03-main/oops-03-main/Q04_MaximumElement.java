import java.util.Scanner;

class Maximum {
    int[] arr = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void findMax() {
        int max = arr[0];

        for (int i = 1; i < 5; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
    }
}

public class Q04_MaximumElement {
    public static void main(String[] args) {
        Maximum obj = new Maximum();
        obj.input();
        obj.findMax();
    }
}