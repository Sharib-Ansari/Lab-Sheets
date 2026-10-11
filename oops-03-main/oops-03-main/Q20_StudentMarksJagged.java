import java.util.Scanner;

class StudentMarks {
    int[][] marks;

    void input() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        marks = new int[n][];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subjects for student " + (i + 1) + ": ");
            int subjects = sc.nextInt();

            marks[i] = new int[subjects];

            for (int j = 0; j < subjects; j++) {
                marks[i][j] = sc.nextInt();
            }
        }
    }

    void display() {
        for (int i = 0; i < marks.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");

            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
            }

            System.out.println();
        }
    }
}

public class Q20_StudentMarksJagged {
    public static void main(String[] args) {
        StudentMarks obj = new StudentMarks();
        obj.input();
        obj.display();
    }
}