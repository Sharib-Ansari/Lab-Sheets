import java.util.Scanner;

class MarriageEligibility {
    int age;
    char gender;

    MarriageEligibility(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }

    void checkEligibility() {
        if (gender == 'M' || gender == 'm') {

            if (age >= 21) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("Not eligible for marriage");
            }

        } else if (gender == 'F' || gender == 'f') {

            if (age >= 18) {
                System.out.println("Eligible for marriage");
            } else {
                System.out.println("Not eligible for marriage");
            }

        } else {
            System.out.println("Invalid gender");
        }
    }
}

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter gender (M/F): ");
        char gender = sc.next().charAt(0);

        MarriageEligibility obj =
                new MarriageEligibility(age, gender);

        obj.checkEligibility();
    }
}