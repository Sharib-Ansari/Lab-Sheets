import java.util.Scanner;

class DayCheck {
    int day;

    DayCheck(int day) {
        this.day = day;
    }

    void checkDay() {
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("Invalid day");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        DayCheck obj = new DayCheck(day);
        obj.checkDay();
    }
}