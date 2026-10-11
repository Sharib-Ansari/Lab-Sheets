import java.util.Scanner;

class RemoveDuplicate {
    int[] arr = new int[10];
    int[] unique = new int[10];
    int count = 0;

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void remove() {
        for (int i = 0; i < 10; i++) {
            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (arr[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[count] = arr[i];
                count++;
            }
        }
    }

    void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}

public class Q24_RemoveDuplicates {
    public static void main(String[] args) {
        RemoveDuplicate obj = new RemoveDuplicate();
        obj.input();
        obj.remove();
        obj.display();
    }
}