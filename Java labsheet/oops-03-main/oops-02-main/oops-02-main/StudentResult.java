import java.util.Scanner;

class StudentResult {
    double theory, practical, overall;

    StudentResult(double theory, double practical, double overall) {
        this.theory = theory;
        this.practical = practical;
        this.overall = overall;
    }

    void checkResult() {
        if ((theory >= 40 && practical >= 50) || overall >= 50) {
            System.out.println("Student Passes");
        } else {
            System.out.println("Student Fails");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory percentage: ");
        double theory = sc.nextDouble();

        System.out.print("Enter practical percentage: ");
        double practical = sc.nextDouble();

        System.out.print("Enter overall percentage: ");
        double overall = sc.nextDouble();

        StudentResult obj = new StudentResult(theory, practical, overall);
        obj.checkResult();
    }
}