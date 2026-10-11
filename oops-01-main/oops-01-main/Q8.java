import java.util.Scanner;

class VowelChecker {
    char ch;

    VowelChecker(char ch) {
        this.ch = ch;
    }

    void check() {
        if (ch == 'a' || ch == 'e' || ch == 'i' ||
            ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' ||
            ch == 'O' || ch == 'U') {

            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        VowelChecker obj = new VowelChecker(ch);
        obj.check();
    }
}