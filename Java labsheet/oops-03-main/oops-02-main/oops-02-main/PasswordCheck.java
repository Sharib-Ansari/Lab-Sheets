import java.util.Scanner;

class PasswordCheck {
    String correctPassword = "java123";

    void checkPassword() {
        Scanner sc = new Scanner(System.in);
        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();

            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password!");
            }

        } while (!password.equals(correctPassword));

        System.out.println("Correct password. Access granted.");
    }

    public static void main(String[] args) {
        PasswordCheck obj = new PasswordCheck();
        obj.checkPassword();
    }
}