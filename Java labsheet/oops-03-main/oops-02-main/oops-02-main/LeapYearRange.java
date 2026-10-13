import java.util.Scanner;

class LeapYearRange {
    int year, start, end;

    LeapYearRange(int year, int start, int end) {
        this.year = year;
        this.start = start;
        this.end = end;
    }

    void check() {
        boolean leap = (year % 400 == 0) ||
                       (year % 4 == 0 && year % 100 != 0);

        if (leap && year >= start && year <= end) {
            System.out.println("Year is a leap year and within range.");
        } else {
            System.out.println("Condition not satisfied.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = sc.nextInt();

        System.out.print("Enter range: ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        LeapYearRange obj = new LeapYearRange(year, start, end);
        obj.check();
    }
}