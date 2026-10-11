import java.util.Scanner;

class StringCompare {
    String s1, s2;

    StringCompare(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }

    void compare() {
        int min = Math.min(s1.length(), s2.length());

        for (int i = 0; i < min; i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                System.out.println(s1 + " comes before " + s2);
                return;
            } else if (s1.charAt(i) > s2.charAt(i)) {
                System.out.println(s1 + " comes after " + s2);
                return;
            }
        }

        if (s1.length() < s2.length()) {
            System.out.println(s1 + " comes before " + s2);
        } else if (s1.length() > s2.length()) {
            System.out.println(s1 + " comes after " + s2);
        } else {
            System.out.println("Both strings are equal");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        StringCompare obj = new StringCompare(s1, s2);
        obj.compare();
    }
}