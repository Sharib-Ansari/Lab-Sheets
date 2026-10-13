import java.util.Scanner;

class CharacterCheck {
    char ch;

    CharacterCheck(char ch) {
        this.ch = ch;
    }

    void check() {
        if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase Letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase Letter");
        } else {
            System.out.println("Special Character");
        }
    }
}

public class Q14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        CharacterCheck obj = new CharacterCheck(ch);
        obj.check();
    }
}