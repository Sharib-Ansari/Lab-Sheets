import java.util.Scanner;

class Frequency {
    int[] arr = new int[10];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void count() {
        boolean[] visited = new boolean[10];

        for (int i = 0; i < 10; i++) {

            if (visited[i])
                continue;

            int count = 1;

            for (int j = i + 1; j < 10; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            System.out.println(arr[i] + " = " + count);
        }
    }
}

public class Q22_ElementFrequency {
    public static void main(String[] args) {
        Frequency obj = new Frequency();
        obj.input();
        obj.count();
    }
}