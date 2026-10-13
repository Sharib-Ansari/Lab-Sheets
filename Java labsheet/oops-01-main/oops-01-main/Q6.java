import java.util.Scanner;

class CharacterValue {
    char ch;

    CharacterValue(char ch) {
        this.ch = ch;
    }

    void displayASCII() {
        int ascii = (int) ch;

        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + ascii);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        CharacterValue obj = new CharacterValue(ch);
        obj.displayASCII();
    }
}