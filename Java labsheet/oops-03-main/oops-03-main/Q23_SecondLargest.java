import java.util.Scanner;

class SecondLargest {
    int[] arr = new int[5];

    void input() {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
    }

    void find() {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > largest) {
                second = largest;
                largest = i;
            } else if (i > second && i != largest) {
                second = i;
            }
        }

        System.out.println("Second Largest = " + second);
    }
}

public class Q23_SecondLargest {
    public static void main(String[] args) {
        SecondLargest obj = new SecondLargest();
        obj.input();
        obj.find();
    }
}