import java.util.Scanner;

class ArrayMinMax {
    int[] numbers;

    ArrayMinMax(int[] numbers) {
        this.numbers = numbers;
    }

    void findMinMax() {
        int max = numbers[0];
        int min = numbers[0];

        for (int n : numbers) {
            if (n > max) {
                max = n;
            }

            if (n < min) {
                min = n;
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 numbers:");

        for (int i = 0; i < 5; i++) {
            numbers[i] = sc.nextInt();
        }

        ArrayMinMax obj = new ArrayMinMax(numbers);
        obj.findMinMax();
    }
}