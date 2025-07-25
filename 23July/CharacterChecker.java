import java.util.*;

public class CharacterChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter any character: ");
        char ch = scanner.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("It is an Uppercase Letter.");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("It is a Lowercase Letter.");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("It is a Digit.");
        } else {
            System.out.println("It is a Special Character.");
        }
    }
}
