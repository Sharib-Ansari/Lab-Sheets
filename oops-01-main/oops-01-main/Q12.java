import java.util.Scanner;

class LeapYear {
    int year;

    LeapYear(int year) {
        this.year = year;
    }

    void check() {
        if (year % 400 == 0) {
            System.out.println("Leap Year");
        } else if (year % 100 == 0) {
            System.out.println("Not a Leap Year");
        } else if (year % 4 == 0) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }
    }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        LeapYear obj = new LeapYear(year);
        obj.check();
    }
}