import java.util.Scanner;

class NumberAnalyzer {
    int[] numbers;
    double average;

    NumberAnalyzer(int[] numbers) {
        this.numbers = numbers;
    }

    void calculateAverage() {
        int sum = 0;

        for (int num : this.numbers) {
            sum = sum + num;
        }

        this.average = (double) sum / this.numbers.length;
    }

    int countAboveAverage() {
        int count = 0;

        for (int num : this.numbers) {
            if (num > this.average) {
                count++;
            }
        }

        return count;
    }

    void displayResult() {
        System.out.println("Average = " + this.average);
        System.out.println(
            "Numbers above average = " + this.countAboveAverage()
        );
    }
}

public class NumberAverage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        NumberAnalyzer obj = new NumberAnalyzer(numbers);

        obj.calculateAverage();
        obj.displayResult();

        sc.close();
    }
}