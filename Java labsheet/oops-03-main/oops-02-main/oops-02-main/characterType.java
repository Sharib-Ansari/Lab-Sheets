import java.util.Scanner;

class CharacterType {
    char ch;

    CharacterType(char ch) {
        this.ch = ch;
    }

    void check() {
        String result;

        result = (ch >= '0' && ch <= '9') ? "Digit" :
                 ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
                 ? ((ch == 'a' || ch == 'e' || ch == 'i' ||
                     ch == 'o' || ch == 'u' ||
                     ch == 'A' || ch == 'E' || ch == 'I' ||
                     ch == 'O' || ch == 'U')
                     ? "Vowel" : "Consonant")
                 : "Special Symbol";

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        CharacterType obj = new CharacterType(ch);
        obj.check();
    }
}