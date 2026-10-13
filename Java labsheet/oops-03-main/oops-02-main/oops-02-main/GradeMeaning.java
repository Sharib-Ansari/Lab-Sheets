import java.util.Scanner;

class GradeMeaning {
    char grade;

    GradeMeaning(char grade) {
        this.grade = Character.toUpperCase(grade);
    }

    void display() {
        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Good");
                break;

            case 'C':
                System.out.println("Average");
                break;

            case 'D':
                System.out.println("Below Average");
                break;

            case 'E':
                System.out.println("Pass");
                break;

            case 'F':
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid grade");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter grade: ");
        char grade = sc.next().charAt(0);

        GradeMeaning obj = new GradeMeaning(grade);
        obj.display();
    }
}